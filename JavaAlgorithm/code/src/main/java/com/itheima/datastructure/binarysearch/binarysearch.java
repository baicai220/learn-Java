package com.itheima.datastructure.binarysearch;

public class binarysearch {
    public static void main(String[] args) {
        long[] arr={2L,4L,6L,8L,9L,10L,11L,14L,16L};
        System.out.println(binarysearch1(arr,0, arr.length-1, 16L));
    }

    public static int binarysearch1(long[] a,int from,int to,long key) {
        //Long[] a表示数组中的元素类型为Long，但是数组的长度依然是由int类型决定的，即最长为2^31-1
        while(from<=to) {
            int mid=(from +to)/2;
            if(a[mid]==key) {
                return mid; //返回索引值
            }else if(a[mid]<key) {
                from =mid+1;
            } else if (a[mid]>key) {
                to = mid-1;
            }
        }
        return -1;
    }
}



