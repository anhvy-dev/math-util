package com.anhvy.mathutil.main;

import com.anhvy.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0ReturnsWell();
        testFactorialGivenRightArgument5ReturnsWell();

    }

    //test hàm viết ra, gọi ra unit testing - test ~ đơn vị code cơ bản nhất
    //test getFactorial() với các bộ data đưa vào -> những test case
    //test case: ~ bộ data đưa vào hàm, vào app, và cách thức xài ~ bộ data này, và kèm theo kq kì vọng app/hàm sẽ trả về

    //TEST CASE #2

    //DESCRIPTION (MÔ TẢ MỤC ĐÍCH TEST CASE DÙNG TEST ĐIỀU GI?)
    //             TO CHECK, TO VERIFY THE getFactotrial() method with correct given argument, e.g n = 5

    //STEPS/PROCEDURES: (CÁC BƯỚC TEST HÀM/APP, ...)
    //          CALL getFactorial() method with valid argument: getFactorial(5)

    //EXPECTED RESULT
    //          To have number 120 as the result of 5!

    //STATUS (TRẠNG THÁI CỦA TEST CASE LÀ GÌ SAU KHI CHẠY APP/HÀM)
    //      PASSED, FAILED (BUG)
    //      Chờ xem hàm, app xử lý đc số mấy - ACTUAL VALUE
    //      và đi so sánh với EXPECTED ở trên để luận đúng sai

    //viết code test để test hàm chính chạy đúng với n = 5 hay ko

    static void testFactorialGivenRightArgument5ReturnsWell(){
        //so sánh
        System.out.println("5! = \n"
                + "expected value: 120 \n"
                + "actual value: " + MathUtility.getFactorial(5));
    }





    //TEST CASE #1

    //DESCRIPTION (MÔ TẢ MỤC ĐÍCH TEST CASE DÙNG TEST ĐIỀU GI?)
    //             TO CHECK, TO VERIFY THE getFactotrial() method with correct given argument, e.g n = 0

    //STEPS/PROCEDURES: (CÁC BƯỚC TEST HÀM/APP, ...)
    //          CALL getFactorial() method with valid argument: getFactorial(0)

    //EXPECTED RESULT
    //          To have number 1 as the result of 0!

    //STATUS (TRẠNG THÁI CỦA TEST CASE LÀ GÌ SAU KHI CHẠY APP/HÀM)
    //      PASSED, FAILED (BUG)
    //      Chờ xem hàm, app xử lý đc số mấy - ACTUAL VALUE
    //      và đi so sánh với EXPECTED ở trên để luận đúng sai

    //viết code test để test hàm chính chạy đúng với n = 0 hay ko

    static void testFactorialGivenRightArgument0ReturnsWell(){
        int n = 0; //dự tính 0!
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(0); //tính thử 0! bằng hàm

        //so sánh
        System.out.println(n + "! = \n"
                           + "expected value: " + expectedResult + "\n"
                           + "actual value: " + actualResult);
    }



}
