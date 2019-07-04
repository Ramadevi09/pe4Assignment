package com.stackroute.pe4;

public class CharacterReplace {
    //character replace
    public String replaceCharacters(String input){
        String replace2="";
        if(input==null){
            return "enter the String";
        }
        else if(input==""){
            return "given String is empty";
        }
        else {
            String input1 = input.toLowerCase();
            String replace1 = input1.replace('d', 'f');
             replace2 = replace1.replace('l', 't');
        }
      return replace2;
    }
}
