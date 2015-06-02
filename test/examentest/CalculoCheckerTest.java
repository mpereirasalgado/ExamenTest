/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examentest;

import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author mpereirasalgado
 */
@RunWith(Parameterized.class)
public class CalculoCheckerTest {
   private int numDiv1;
   private int numDiv2;
   private int resto;
   private int expectedResult;
   private Calculo calculo;

   @Before
   public void initialize() {
       calculo = new Calculo();
   }

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
   public CalculoCheckerTest(int numDiv1, int numDiv2, int resto,int expectedResult) {
      this.numDiv1 = numDiv1;
      this.numDiv2 = numDiv2;
      this.resto = resto;
      this.expectedResult = expectedResult;
   }

   @Parameterized.Parameters
   public static Collection Calculo() {
      return Arrays.asList(new Object[][] {
          {2,4,2,2},
          {11,22,11,11},
          {4,8,4,4},
          {2,3,1,1}});
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testlogicChecker() {
      System.out.println("Parametros testeados : " + numDiv1+" , " +numDiv2+"MCD = "+ resto );
      assertEquals(expectedResult, calculo.obtenerMCD(numDiv1, numDiv2),2);
   }
}
