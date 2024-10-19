package com.anhvy.mathutil.core.test;

import com.anhvy.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilityDDTTest {

    //class này sẽ chứa các hàm kiểm thử code the style DDT
    //DDT, ta tách code code kiểm thử (các lênh assert()) riêng
    //ko gọp chung bộ data kiểm thử
    //Mục tiêu: dễ đọc code kiểm thử, dễ đánh giá đc xem có bao nhiêu test
    //case đang đc test, đã đủ hay chưa, vì nó rất dễ thấy do data nằm riêng
    //-> giúp ngli PESTICIDE PARADOX

    //BỘ DATA ĐƯA VÀO TEST SẼ ĐỂ RIÊNG Ở 1 HÀM PUBLIC STATIC
    //hàm này trả về 1 mảng các con số < 0 or > 20
    //là ~ n gây ra exception khi ta dùng hàm
    public static Integer[] initWrongDataSet() {
        return new Integer[] {-1, -2, -3, -4, -100, -1000, 21, 22, 23, 100, 1000};

    }
    //test case #... : check if getFactorial() throws IllegalArgumentException
    @ParameterizedTest
    @MethodSource("initWrongDataSet")
    public void testGetFactorialGivenWrongArgumentsThrowsException(int n) {
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(n);});
    }

    //test case #... : check getFactorial() with right argument  and run well with n = 0, 1, 2, 3, 4, 5,... 20
    public static Object[][] initRightDataSet() {
        return new Object[][] {{0, 1},
                               {1, 1},
                               {2, 2},
                               {3, 6},
                               {4, 24},
                               {5, 120},
                               {6, 720}};
    }
    @ParameterizedTest
    @MethodSource("initRightDataSet")
    public void testGetFactorialGivenRightArgumentsRunWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    //

}