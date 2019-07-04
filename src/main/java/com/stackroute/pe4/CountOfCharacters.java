package com.stackroute.pe4;

public class CountOfCharacters {
//count th echaracters
    public  String charactersCountChecker(String input,char ch){
        int count=0;String result="";
        if(input==null){
            return "enter the String";
        }
        else if(input==""||ch==' '){
        return "given String or character is empty";
        }
        else {
            String changeTolowercase = input.toLowerCase();
            int length = changeTolowercase.length();
            int length2 = changeTolowercase.replaceAll(String.valueOf(ch), "").length();
            count = length - length2;
            result += count;
        }
return result;
    }
}
