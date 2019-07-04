package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordsSortingTest {
    WordsSorting wordsSorting;
    @Before
    public void setUp() {
        wordsSorting=new WordsSorting();
    }

    @After
    public void tearDown() {
        wordsSorting=null;
    }
    @Test
    public void giveninputStringsetWordsSorting(){
        String result=wordsSorting.Sortingwords("hai rama devi iam");
        assertEquals("devi hai iam rama",result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsNull(){
        String result=wordsSorting.Sortingwords(null);
        assertEquals("enter the String",result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsEmpty(){
        String result=wordsSorting.Sortingwords("");
        assertEquals("given String is empty",result);
    }

}