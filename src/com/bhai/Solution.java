package com.bhai;

public class Solution {

    public static void main(String arhs[]){

        int[] A = {1,2,-934,3,4,5,-3,-5};

        Solution sol = new Solution();
        System.out.println(sol.solution(A));
    }

    int solution (int[] A){
        int ans = 0;
        for(int i =1;i<A.length;i++){
            for(int j=0; j<A.length;j++){
                if(ans>A[j]){
                    ans = A[i];
                }
            }
        }
        return ans;
    }
}
