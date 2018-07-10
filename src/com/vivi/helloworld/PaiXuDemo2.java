package com.vivi.helloworld;

public class PaiXuDemo2 {//冒泡排序

	public static void main(String[] args) {
		 int[] arr ={2,9,7,6,8,4,3,5,1};
		 for(int i=0;i < arr.length-1;i++) {//外层循环控制排序趟数
			 for(int j=0; j< arr.length-i-1;j++) {//内层循环控制每一趟排序多少次       
				 if(arr[j]>arr[j+1]) {
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;					 
				 }
			 }
			 System.out.println("第"+(i+1)+"次排序");
			 for(int a=0; a<arr.length; a++) {
				 System.out.print(arr[a]+" ");
			 }
			 System.out.println();
		 }
	}
}
