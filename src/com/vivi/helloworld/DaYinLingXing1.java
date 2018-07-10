package com.vivi.helloworld;

public class DaYinLingXing1 {

	public static void main(String[] args) {
		int length = 9;
		for(int i=0; i<=length/2; i++) {
			for(int j=0; j<length; j++) {
				if(j<=length/2+i && j>=length/2-i) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=length/2+1; i<=length; i++) {
			for(int j=0; j<length; j++) {
				if(j<=length/2+(length-1-i) && j>=length/2-(length-1-i)) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
