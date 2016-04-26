package com.offer;

import java.util.ArrayList;

public class MinNumberInRotateArray {
	
	public int minNumberInRotateArray(int [] array) {
    	int a=0;
    	if(array.length==0){
    		return 0;
    	}else{
    		a=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<a)
                a=array[i];
        }
        return a;
    	}
    }
	
	public static void main(CharactorString[] args) {
		int[] a=new int [0];
		MinNumberInRotateArray one=new MinNumberInRotateArray();
		System.out.println(one.minNumberInRotateArray(a));
	}
}
