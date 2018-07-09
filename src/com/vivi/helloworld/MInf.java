package com.vivi.helloworld;

public class MInf {
	int mWeight;
	public MInf(int mHeight) {
		System.out.println("马斌的身高是：" + mHeight +"cm");
	} 
	public void setWeight(int weight) {
		mWeight = weight;
	}
	public int getWeight() {
		System.out.println("马斌的体重为：" + mWeight + "kg");
		return mWeight;
	}
	
	public static void main(String[] args) {
		MInf inf = new MInf(168);
		inf.setWeight(200);
		inf.getWeight();
	}

}
