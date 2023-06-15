/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.nghi.mathutil.core.test;

import java.lang.reflect.Executable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.nghi.mathutil.core.MathUtility;
import static org.nghi.mathutil.core.MathUtility.*;

/**
 *
 * @author vsngh
 */
public class MathUltilityAdvancedTest {
    
    //hàm chuẩn bị bộ data test để sau đó  fill vào hàm assertE() ở dưới
    public static Object[][] initTestData(){
        Object testData[][] = {{0,1}, 
                                {1,1}, 
                                {2,2}, 
                                {4,24}, 
                                {5,120}};
        
        return testData;
    }
    
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected){
        assertEquals(expected, getFactorial(n));
    }
    
    
    
    @Test
    public void testFactorialGivenWrongArgumentThrowsException() {
        
        org.junit.jupiter.api.function.Executable gF = new org.junit.jupiter.api.function.Executable() {
            @Override
            public void execute() throws Throwable {
                MathUtility.getFactorial(-5);
                }
        };
            
            
        
        
        assertThrows(IllegalArgumentException.class, gF);
        //ham thuoc ineterface excutable lambda chay cho nhanh
    }
    
}
