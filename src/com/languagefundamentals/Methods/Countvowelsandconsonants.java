package com.languagefundamentals.Methods;

class Countvowelsandconstants {
    public static void main(String[] args) {
        String s = "hello";
        int v=0, c=0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') v++;
            else if(ch>='a' && ch<='z') c++;
        }
        System.out.println("Vowels: "+v+" Consonants: "+c);
    }
}