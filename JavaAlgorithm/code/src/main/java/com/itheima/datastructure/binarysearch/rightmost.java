package com.itheima.datastructure.binarysearch;

public class rightmost {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3,3,3,3,3,  10 ,10,10,18};
        System.out.println(rightMost1(arr,3));
        System.out.println(rightMost2(arr,3));
        System.out.println(rightMost2(arr,4));
    }

    public  static int rightMost1(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        int ans=-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                ans=mid;
                left=mid+1;
            }else if(arr[mid]>target){
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }
        }
        return ans;
    }

    public static int rightMost2(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(target>=arr[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left-1;
    }
}
