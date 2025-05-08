package com.lcwd.test.Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

//test addTwoMethod

//    @Test
//    public void addTwoNuber()
//    {
//        int result=CalculaterService.addTwoNumber(10,20);
//        int expected=30;
//        //Assert.assertEquals(expected , result);
//
//        //actual result
//
//
//
//        //Expected Result
//
//
//    }
//
//    @Test
//    public void sumAnyNumber()
//    {
//        int result=CalculaterService.sumAnyNumber(1,2,3,4);
//        int expected=10;
//
//      Assert.assertEquals(expected,result);
//    }
//

    //annotatioins
    //@Test
    //@BeforeClass
    //@AfterClass
    //@Before
    //@AfterClass

    //junit vession 5

    @Test
    public void addTwoNumber()
    {
    int actualresult=CalculaterService.addTwoNumber(5,6);
    int expected =11;
        Assertions.assertEquals(expected ,actualresult);
    }

    @Test
    public void addAnyNumber()
    {

        int result = CalculaterService.sumAnyNumber(1,4,5,7);
        int Expectedresult=17;

        Assertions.assertEquals(Expectedresult, result);

    }

}
