package com.basics;

public class FIndMinimum {

    public static void main(String[] args) {
        int a[] = {2, 3, 4, 1000, 45};
        System.out.println(min(a));
    }
    static int min(int[] a){
        int ans = a[0];
        for(int i=1 ; i<a.length ; i++){
            if(ans>a[i]){
                ans = a[i];
            }
        }
        return ans;
    }

}
