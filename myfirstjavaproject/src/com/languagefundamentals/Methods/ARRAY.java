package com.languagefundamentals.Methods;

class ARRAY {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for(int x : arr) System.out.print(x+" ");
    }
}