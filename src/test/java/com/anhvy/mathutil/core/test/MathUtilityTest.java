package com.anhvy.mathutil.core.test;

import com.anhvy.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //test case structure: ID ,Desciption, Steps/Procedures
    //                     Expected Result, Status(Passed, Failed)
    //                     BugID (Bugzilla, Jira)

    //test case #4: check getFactorial() with n = -1, -2, -3, -4, -5, 21, 22, 23, 24, 25
    //...
    @Test
    public void testFactorialGivenWrongArgumentsThrowsException() {
        //so sánh ev và av
        //MathUtility.getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-2);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(22);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(100);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-100);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(21);});
    }//Phải ném ngoại lệ



    @Test
    public void testFactorialGivenWrongArgumentsMinus5ThrowsException() {
        //so sánh ev và av
        //MathUtility.getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-5);});
        }//Phải ném ngoại lệ





    //test case #3 (gộp): check getFactorial() with n = 2, 3, 4, 5, 6...
    //...


    @Test
    public void testFactorialGivenRightArgumentsReturnsWell(){
        //so sánh ev và av
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));

    } //bad smells = đoạn code thối vcl (Robert C. Martin - Clean code)
    //code bị lặp lại, trộn lộn xộn test data và lệnh kiểm thử
    //ta cần tinh chỉnh, tối ưu code - REFACTOR, REFACTORING




    //test case #2: check getFactorial() with n = 1
    //...

    @Test

    public void testFactorialGivenRightArgument1ReturnsWell(){
        //so sánh ev và av
        assertEquals(1, MathUtility.getFactorial(1));
    }

    //test case #1: check getFactorial() with n = 0
    //...

    @Test

    public void testFactorialGivenRightArgument0ReturnsWell(){
        long expectedValue = 1; //hy vọng 0! trả kq về 1
        long actualValue = MathUtility.getFactorial(0); //hàm trả về 10

        //so sánh ev và av
        assertEquals(expectedValue, actualValue);
    }
}