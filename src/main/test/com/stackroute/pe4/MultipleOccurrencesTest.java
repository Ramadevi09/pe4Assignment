package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurrencesTest {
    MultipleOccurrences multipleOccurrences;
    @Before
    public void setUp() {
        multipleOccurrences=new MultipleOccurrences();
    }

    @After
    public void tearDown() {
        multipleOccurrences=null;
    }
    @Test
public void matcher(){
        String result=multipleOccurrences.multipleOccrenceschecker("se","She sells seashells by the seashore");
        assertEquals("4to5 10to11 27to28",result);
}
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsNull(){
        String result=multipleOccurrences.multipleOccrenceschecker(null,"She sells seashells by the seashore");
        assertEquals("enter the pattern or String",result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsEmpty(){
        String result=multipleOccurrences.multipleOccrenceschecker("","");
        assertEquals("given String or pattern is empty",result);
    }

}