/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.nghi.mathutil.core;

/**
 *
 * @author vsngh
 */
public class MathUtility {

    public static final double PI = 3.1415;

//tinh n! = 1.2.3...n
//thiết kế/quy ước cho hàm/method này
//0!= 1! = 1
//ko áp dụng giai thừa cho số âm. Nếu n<0: CHỬI/NÉM RA EXCEPTION
//ko áp dụng giai thừa cho số > 20. Vì 20! vừa đủ khít kiểu long: 18 con số 0
//21!: chửi/ ném ngoại lệ
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;

    }

}
