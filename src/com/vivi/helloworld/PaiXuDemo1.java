package com.vivi.helloworld;

public class PaiXuDemo1 {//选择排序

	public static void main(String[] args) {
		int[] arr = {12,32,652,35,256,165,21,16};
		for(int a:arr){
            System.out.print(a+" ");
        }
		System.out.println("\n"+"从大到小排列");
		arr=toSmall(arr);
		for(int a:arr)
        {
            System.out.print(a+" ");
        }
		System.out.println("\n"+"从小到大排列");
		arr=toBig(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
	public static int[] toSmall(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int number = arr[i];
					arr[i] = arr[j];
					arr[j] = number;
				}
			}
		}
		return arr;
	}
	public static int[] toBig(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int number = arr[i];
					arr[i] = arr[j];
					arr[j] = number;
				}
			}
		}
		return arr;
	}
}
