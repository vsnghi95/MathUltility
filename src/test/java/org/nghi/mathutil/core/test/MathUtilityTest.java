/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.nghi.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.nghi.mathutil.core.MathUtility;

/**
 *
 * @author vsngh
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentRunsWell(){
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    
}
