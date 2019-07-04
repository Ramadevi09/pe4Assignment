package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionExampleTest {
    RegularExpressionExample regularExpressionExample;

    @Before
    public void setUp() {
        regularExpressionExample = new RegularExpressionExample();
    }

    @After
    public void tearDown() {
        regularExpressionExample = null;
    }

    @Test
    public void givenSequenceIsTherePrintTrue() {
        boolean result = regularExpressionExample.matchingStringChecker("This is Harry", "Harry");
        assertEquals(true, result);
    }

    @Test
    public void ifgivenSequenceIsNotTherePrintErrMsg() {
        boolean result = regularExpressionExample.matchingStringChecker("This is Harry", "Hello");
        assertEquals(false, result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsNull(){
        boolean result=regularExpressionExample.matchingStringChecker(null,"She sells seashells by the seashore");
        assertEquals(false,result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsEmpty(){
        boolean result=regularExpressionExample.matchingStringChecker("","");
        assertEquals(false,result);
    }
}