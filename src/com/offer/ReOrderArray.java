package com.offer;

public class ReOrderArray {
	public void reOrderArray(int[] array) {
		int length=array.length;
		int a[]=new int[length];
		int b[]=new int[length];
		int c=0,d=0;
		for(int i=0;i<length;i++){
			if(array[i]%2==1){
				a[c++]=array[i];
			}else{
				b[d++]=array[i];
			}
		}
		for(int i=0;i<d;i++){
			a[c++]=b[i];
		}
		for(int i=0;i<length;i++){
            array[i]=a[i];
            System.out.print(array[i]);
        }
	}
	public static void main(CharactorString[] args) {
		ReOrderArray reOrderArray=new ReOrderArray();
		int a[]=new int[]{1,2,3,4,5,6,7};
		reOrderArray.reOrderArray(a);
	}
}
