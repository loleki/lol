package com.company;

//строка в подстроке
public class Task {
    public static boolean check(String text, String subtext, int text_p, int subtext_p){
        if(text_p == text.length() && subtext_p != subtext.length()){return false;}
        if(subtext_p == subtext.length()){return true;}

        if(text.charAt(text_p) == subtext.charAt(subtext_p)){return  check(text, subtext, text_p + 1, subtext_p + 1);}
        else{return false;}

    }

    public static boolean match(String text, String subtext, int text_p, int subtext_p){
        if(text_p == text.length()){return false;}

        if(text.charAt(text_p) == subtext.charAt(subtext_p)){
            if(check(text, subtext, text_p, subtext_p)){
                return true;
            }
            else{return match(text, subtext, text_p + 1, subtext_p);}
        }
        else{return match(text, subtext, text_p + 1, subtext_p);}
    }
}
