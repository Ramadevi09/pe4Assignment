package com.stackroute.pe4;

public class StringTranspose {
    public String transpose(String str)
    {
        String reversedString = "";
        if(str==null){
            return "enter the String";
        }
        else if(str==""){
            return "given String is empty";
        }
        else {
            String[] words = str.split(" ");

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reversedString = reversedString + reverseWord + " ";
            }
        }
// System.out.println(reversedString);
        return reversedString.trim();
    }

}
