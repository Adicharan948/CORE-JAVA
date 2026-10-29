package com.languagefundamentals.Methods;
class Removeduplicate {
    public static void main(String[] args) {
        String s="hello", result="";
        for(int i=0; i<s.length(); i++){
            if(result.indexOf(s.charAt(i))==-1) result+=s.charAt(i);
        }
        System.out.println(result);
    }
}
