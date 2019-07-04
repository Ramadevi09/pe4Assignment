package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOfCharactersTest {
    CountOfCharacters countOfCharacters;
    @Before
    public void setUp() {
        countOfCharacters=new CountOfCharacters();
    }

    @After
    public void tearDown() {
countOfCharacters=null;
    }
    @Test
    public void inTheGivenInputStringPrintCountOfCharacters(){
String result=countOfCharacters.charactersCountChecker("java is java",'a');
assertEquals("4",result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsNull(){
        String result=countOfCharacters.charactersCountChecker(null,'a');
        assertEquals("enter the String",result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsEmpty(){
        String result=countOfCharacters.charactersCountChecker("",'a');
        assertEquals("given String or character is empty",result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfCharacterIsEmpty(){
        String result=countOfCharacters.charactersCountChecker("java is java",' ');
        assertEquals("given String or character is empty",result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfCharacterIsEmptyAndStringIsEmpty(){
        String result=countOfCharacters.charactersCountChecker("",' ');
        assertEquals("given String or character is empty",result);
    }


}