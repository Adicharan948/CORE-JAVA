package com.languagefundamentals.Methods;

class Misnuminarray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5}; // 3 is missing
        int n=5;
        int total = n*(n+1)/2;
        int sum=0;
        for(int x:arr) sum+=x;
        System.out.println("Missing: "+(total-sum));
    }
}
