package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrences {
   public String multipleOccrenceschecker(String pattern1,String input)
        {
            if(input==null || pattern1==null){
                return "enter the pattern or String";
            }
            else if(input==""|| pattern1==""){
                return "given String or pattern is empty";
            }
            String result="";
            // Create a pattern to be searched
            Pattern pattern = Pattern.compile(pattern1);

            // Search above pattern in "She sells seashells by the seashore"
            Matcher m = pattern.matcher(input);

            // Print starting and ending indexes of the pattern
            // in text
            while (m.find()) {
                result +=  + m.start() + "to" + (m.end() - 1)+" ";
            }
            return result.trim();
        }

    }

