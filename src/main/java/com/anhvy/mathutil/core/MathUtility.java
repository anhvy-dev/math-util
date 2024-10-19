package com.anhvy.mathutil.core;

public class MathUtility {
        //class cung cấp các hàm tiện ích cho mọi nơi sử dụng => thường thiết kế là static

        //hàm tính n! = 1.2.3.4...n
        //< 0! Và 21! > ta ko tính, ko có âm giai thừa. 20! Vừa đủ kểu long
        //0! Và 21! 22! Ta throw exception
        public static long getFactorial(int n) {

            if (n < 0 || n > 20)
                throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");

            if (n == 0 || n == 1)
                return 1;

            //đến bước này, n = 2, 3, 4, ...20
            long result = 1; //tích ban đầu = 1
            for (int i = 2; i <= n; i++)
                result *= i; //nhân dồn i vào kq

            return result;
        }

    }

