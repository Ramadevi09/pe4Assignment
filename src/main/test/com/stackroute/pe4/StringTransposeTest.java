package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose stringTranspose;
    @Before
    public void setUp() {
        stringTranspose=new StringTranspose();
    }

    @After
    public void tearDown() {
        stringTranspose=null;
    }
    @Test
    public void givenTextShouldPrintTranspose() {
//Arrange
//Act
        String result = stringTranspose.transpose("hello hai rama devi bar");
//Assert
        assertEquals("olleh iah amar ived rab",result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsNull(){
        String result=stringTranspose.transpose(null);
        assertEquals("enter the String",result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsEmpty(){
        String result=stringTranspose.transpose("");
        assertEquals("given String is empty",result);
    }

}