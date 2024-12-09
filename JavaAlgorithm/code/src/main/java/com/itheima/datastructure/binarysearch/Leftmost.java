package com.itheima.datastructure.binarysearch;

public class Leftmost {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3,3,3,3,3,  10 ,10,10,18};
        System.out.println(leftMost1(arr,10));
        System.out.println(leftMost2(arr,3));
        System.out.println(leftMost2(arr,4));
    }
    public static int leftMost1(int[] arr,int target) {
        int i=0,j=arr.length-1;
        int ans=-1;
        while(i<=j) {
            int mid = (i+j)/2;
            if(arr[mid]==target) {
                ans=mid;
                j=mid-1;
            }
            else if(arr[mid]>target) {
                j=mid-1;
            } else if (arr[mid]<target) {
                i=mid+1;
            }
        }
        return ans; //找到的话返回索引，找不到则返回-1
    }

    public static int leftMost2(int[] arr,int target) {
        int i=0,j=arr.length-1;
        while(i<=j) {
            int mid = (i+j)/2;
            if(target<=arr[mid]){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return i; //找不到的话返回<target的元素个数
    }

}
