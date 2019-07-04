package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplaceTest {
    CharacterReplace characterReplace;
    @Before
    public void setUp() {
characterReplace=new CharacterReplace();
    }

    @After
    public void tearDown() {
        characterReplace=null;
    }
    @Test
    public void givenStringreplaceDwithFAndLwithT(){
        String result=characterReplace.replaceCharacters("daily dry");
        assertEquals("faity fry",result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsNull(){
        String result=characterReplace.replaceCharacters(null);
        assertEquals("enter the String",result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsEmpty(){
        String result=characterReplace.replaceCharacters("");
        assertEquals("given String is empty",result);
    }

}