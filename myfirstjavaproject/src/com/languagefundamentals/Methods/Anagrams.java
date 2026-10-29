package com.languagefundamentals.Methods;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String S1="listen";
		String S2="silent";
		
		char[] a1=S1.toCharArray();
		char[] a2=S2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		
		if(Arrays.equals(a1,a2)) {
			System.out.println("anagram");
			
			
		}else {
			System.out.println("not anagram");
		}
		

	}

}
