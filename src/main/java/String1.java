package src.main.java;

public class String1
{
    private String unimplemented = "UNIMPLEMENTED CODE";

    public static void main(String[] args){
        String1 s = new String1();
        System.out.println(s.helloName("Bob"));
        System.out.println(s.makeAbba("Hi", "Bye"));
        System.out.println(s.makeTags("i", "Yay"));
        System.out.println(s.makeOutWord("<<>>", "Yay"));
        System.out.println(s.extraEnd("Hello"));
        System.out.println(s.firstTwo("Hello"));
        System.out.println(s.withoutEnd("Hello"));
        System.out.println(s.comboString("hi", "Hello"));
        System.out.println(s.middleThree("Candy"));
        System.out.println(s.extraFront("Hello"));
        System.out.println(s.left2("Hello"));
        System.out.println(s.hasBad("badxx"));
        System.out.println(s.conCat("abc", "cat"));
        System.out.println(s.minCat("Hello", "Hi"));
        System.out.println(s.withoutX("xHix"));
        System.out.println(s.deFront("Hello"));
    }

    public String1()
    {

    }

    //ONLY EDIT BELOW HERE-------------------------------------------------------------------------

    /*
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     *  helloName("Bob") â†’ "Hello Bob!"
     *  helloName("Alice") â†’ "Hello Alice!"
     *  helloName("X") â†’ "Hello X!"
     */
    public String helloName(String name) {
        //return unimplemented;
        return "Hello " + name + "!";
    }

    /*
     * Given two strings, a and b, return the result of putting them together in the order abba, 
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * makeAbba("Hi", "Bye") â†’ "HiByeByeHi"
     * makeAbba("Yo", "Alice") â†’ "YoAliceAliceYo"
     * makeAbba("What", "Up") â†’ "WhatUpUpWhat"
     */
    public String makeAbba(String a, String b) {
        //return unimplemented;
        return a + b + b + a;
    }

    /*
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
     * In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
     * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
     * makeTags("i", "Yay") â†’ "<i>Yay</i>"
     * makeTags("i", "Hello") â†’ "<i>Hello</i>"
     * makeTags("cite", "Yay") â†’ "<cite>Yay</cite>"
     */
    public String makeTags(String tag, String word) {
        //return unimplemented;
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /*
     * Given an "out" string length 4, such as "<<>>", and a word, 
     *      return a new string where the word is in the middle of the out string, 
     *      e.g. "<<word>>". 
     * Note: use str.substring(i, j) to extract the String starting at index i and going up to but 
     * not including index j.
     * makeOutWord("<<>>", "Yay") â†’ "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") â†’ "<<WooHoo>>"
     * makeOutWord("[[]]", "word") â†’ "[[word]]"
     */
    public String makeOutWord(String out, String word) {
        //return unimplemented;
        String outStart = out.substring(0,2);
        String outEnd = out.substring(2,4);
        return outStart + word + outEnd;
    }

    /*
     * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
     * The string length will be at least 2.
     * extraEnd("Hello") â†’ "lololo"
     * extraEnd("ab") â†’ "ababab"
     * extraEnd("Hi") â†’ "HiHiHi"
     */
    public String extraEnd(String str) {
        int length = str.length();
        String strEnd = str.substring(length - 2, length);
        return strEnd + strEnd + strEnd;
    }

    /*
     * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
     * If the string is shorter than length 2, return whatever there is, 
     * so "X" yields "X", and the empty string "" yields the empty string "". 
     * Note that str.length() returns the length of a string.
     * firstTwo("Hello") â†’ "He"
     * firstTwo("abcdefg") â†’ "ab"
     * firstTwo("ab") â†’ "ab"
     */
    public String firstTwo(String str) {
        if (str.length() >= 2) {
            String strStart = str.substring(0, 2);
            return strStart;
        }else {
            return str;
        }
    }

    /*
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".]
     * firstHalf("WooHoo") â†’ "Woo"
     * firstHalf("HelloThere") â†’ "Hello"
     * firstHalf("abcdef") â†’ "abc"
     */
    public String firstHalf(String str) {
        int length = str.length();
        String strStart = str.substring(0, (length / 2));
        return strStart;
    }

    /*
     * Given a string, return a version without the first and last char, so "Hello" yields "ell". 
     * The string length will be at least 2.
     * withoutEnd("Hello") â†’ "ell"
     * withoutEnd("java") â†’ "av"
     * withoutEnd("coding") â†’ "odin"
     */
    public String withoutEnd(String str) {
        int length = str.length();
        String strMid = str.substring(1, length - 1);
        return strMid;
    }

    /*
     * Given 2 strings, a and b, return a string of the form short+long+short, with the 
     * shorter string on the outside and the longer string on the inside. 
     * The strings will not be the same length, but they may be empty (length 0).
     * comboString("hi", "Hello") â†’ "hiHellohi"
     * comboString("Hello", "hi") â†’ "hiHellohi"
     * comboString("aaa", "b") â†’ "baaab"
     */
    public String comboString(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        String strCombo = "";
        if (aLength > bLength) {
            strCombo = b + a + b;
        }
        else if (bLength > aLength) {
            strCombo = a + b + a;
        }
        return strCombo;
    }

    /*
     * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". 
     * The string length will be at least 3.
     * middleThree("Candy") â†’ "and"
     * middleThree("and") â†’ "and"
     * middleThree("solving") â†’ "lvi"
     */
    public String middleThree(String str) {
        int length = str.length();
        int newLength = length - 3;
        newLength = newLength / 2;
        String strMid = str.substring(newLength, length - newLength);
        return strMid;
    }

    /*
     * Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
     * The string may be any length. If there are fewer than 2 chars, use whatever is there.
     * extraFront("Hello") â†’ "HeHeHe"
     * extraFront("ab") â†’ "ababab"
     * extraFront("H") â†’ "HHH"
     */
    public String extraFront(String str) {
        int length = str.length();
        String strFront = "";
        if (length > 2) {
            strFront = str.substring(0, 2);
            strFront = strFront + strFront + strFront;
        }
        else {
            strFront = str + str + str;
        }
        return strFront;
    }

    /*
     * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
     * The string length will be at least 2.
     * left2("Hello") â†’ "lloHe"
     * left2("java") â†’ "vaja"
     * left2("Hi") â†’ "Hi"
     */
    public String left2(String str) {
        int length = str.length();
        String firstTwo = str.substring(0,2);
        String newWord = "";
        if (length > 2){
            String lastLetters = str.substring(2, length);
            newWord = lastLetters + firstTwo;
        }
        else {
            newWord = firstTwo;
        }
        return newWord;
    }

    /*
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
     * such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. 
     * Note: use .equals() to compare 2 strings.
     * hasBad("badxx") â†’ true
     * hasBad("xbadxx") â†’ true
     * hasBad("xxbadxx") â†’ false
     */
    public boolean hasBad(String str) {
        boolean badFound = false;
        if (str.length() > 3) {
            String firstThree = str.substring(0,3);
            if (firstThree.equals("bad")){
                badFound = true;
            }
            else {
                String nextThree = str.substring(1,4);
                if (nextThree.equals("bad")) {
                    badFound = true;
                }
            }
        }
        return badFound;
    }

    /*
     * Given two strings, append them together (known as "concatenation") and return the result. 
     * However, if the concatenation creates a double-char, then omit one of the chars, 
     *     so "abc" and "cat" yields "abcat".
     * conCat("abc", "cat") â†’ "abcat"
     * conCat("dog", "cat") â†’ "dogcat"
     * conCat("abc", "") â†’ "abc"
     */
    public String conCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        String aLast = a.substring(aLength - 1, aLength);
        String bFirst = "";
        if (bLength > 0) {
            bFirst = b.substring(0,1);
        }
        else {
            bFirst = "";
        }
        
        String comboStr = "";
        if (aLast.equals(bFirst)) {
            String aWithoutLast = a.substring(0, aLength - 1);
            comboStr = aWithoutLast + b;
        }
        else {
            comboStr = a + b;
        }
        return comboStr;
    }

    /*
     *Given two strings, append them together (known as "concatenation") and return the result. 
     *However, if the strings are different lengths, omit chars from the longer string 
     *    so it is the same length as the shorter string. 
     *So "Hello" and "Hi" yield "loHi". 
     *The strings may be any length.
     *minCat("Hello", "Hi") â†’ "loHi"
     *minCat("Hello", "java") â†’ "ellojava"
     *minCat("java", "Hello") â†’ "javaello"
     */
    public String minCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        String comboStr = "";
        if (aLength == bLength) {
            comboStr = a + b;
        }
        else if(aLength > bLength) {
            String aShorter = a.substring(aLength - bLength, aLength);
            comboStr = aShorter + b;
        }
        else if(bLength > aLength) {
            String bShorter = b.substring(bLength - aLength, bLength);
            comboStr = a + bShorter;
        }
        return comboStr;
    }

    /*
     * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
     * and otherwise return the string unchanged.
     * withoutX("xHix") â†’ "Hi"
     * withoutX("xHi") â†’ "Hi"
     * withoutX("Hxix") â†’ "Hxi"
     */
    public String withoutX(String str) {
        int length = str.length();
        String firstLetter = str.substring(0,1);
        String lastLetter = str.substring(length - 1, length);
        String strNoX = "";
        if(firstLetter.equals("x")) {
            if(lastLetter.equals("x")) {
                strNoX = str.substring(1, length - 1);
            }
            else {
            strNoX = str.substring(1, length);
            }
        } 
        else if(lastLetter.equals("x")){
            strNoX = str.substring(0, length - 1);
        }
        else {
            strNoX = str;
        }
        return strNoX;
    }

    /*
     * Given a string, return a version without the first 2 chars. 
     * Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
     * The string may be any length. 
     * Harder than it looks.
     * deFront("Hello") â†’ "llo"
     * deFront("java") â†’ "va"
     * deFront("away") â†’ "aay"
     */
    public String deFront(String str) {  
        int length = str.length();
        String firstLetter = str.substring(0,1);
        String secondLetter = str.substring(1,2);
        String restOfString = str.substring(2, length);
        String strNoFront = "";
        if(firstLetter.equals("a")){
            if(secondLetter.equals("b")) {
                strNoFront = str;
            }
            else {
                strNoFront = firstLetter + restOfString;
            }
        }
        else if(secondLetter.equals("b")){
            strNoFront = secondLetter + restOfString;
        }
        else {
            strNoFront = restOfString;
        }
        return strNoFront;
    }

}
