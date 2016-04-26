package com.offer;

public class Power {

	public double power(double base, int exponent) {
        double r=1.0;
        int a=Math.abs(exponent);
        while(a!=0){
        	if((a & 1)==1){
        		r=r*base;
        	}
        	base*=base;
    		a >>= 1;
        }
        return exponent<0?1/r:r;
	}
	
	public static void main(CharactorString[] args) {
		// TODO Auto-generated method stub

	}

}
