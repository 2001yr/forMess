package com;

public class fast {
    //快速排序
    public static void main(String[] args) {
        //确立基准数，右边向左找比基准数小的，左边找比基准数大的，右边先出发
        int[] arr = {5, 7, 9, 10, 8, 4, 1, 6, 2};
        quiteSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    private static void quiteSort(int[]arr,int left,int right) {
        if(right<left)
            return;
        int left0 = left;
        int right0 = right;
        //基准数
        int base = arr[left0];
        while (left!=right){
            while (arr[right]>=base &&right>left){
                right--;      //暂时找不到更小的数，让right继续向左
            }
            while (arr[left]<=base &&right>left){
                left++;
            }
            //左右交换
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] =  temp;
        }
            //基准数归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

              quiteSort(arr, left0, left-1);
              quiteSort(arr, left+1, right0);

    }
    }


