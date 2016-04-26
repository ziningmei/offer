package com.offer;

public class Array {
	// 题目描述
	//
	// 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
	// 输入描述:
	// array： 待查找的二维数组
	// target：查找的数字
	//
	// 输出描述:
	// 查找到返回true，查找不到返回false
	public boolean find(int[][] array, int target) {
		if (array == null || array.length == 0 || array[0].length == 0) {
			return false;
		}
		int rows = array.length;
		int cols = array[0].length;
		int row = 0;
		boolean flag = false;
		int col = cols - 1;
		while (row < rows && col >= 0) {
			if (array[row][col] == target) {
				flag = true;
				break;
			}
			if (array[row][col] > target) {
				col--;
			} else if (array[row][0] < target) {
				row++;
			}
		}
		return flag;
	}

	// 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
	// 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
	public int[] multiply(int[] A) {
		int length = A.length;
		int[] pre = new int[length];
		int[] next = new int[length];
		int[] B = new int[length];
		pre[0] = 1;
		next[0] = 1;
		for (int i = 1; i < length; i++) {
			pre[i] = A[i - 1] * pre[i - 1];
			// System.out.print(pre[i]+" ");
			next[i] = A[length - i] * next[i - 1];
			// System.out.println(next[i]);
		}
		for (int i = 0; i < length; i++) {
			B[i] = pre[i] * next[length - i - 1];
		}
		return B;
	}

	// 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
	// 数组中某些数字是重复的，但不知道有几个数字是重复的。
	// 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
	// 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，
	// 那么对应的输出是重复的数字2或者3。
	// Parameters:
	// numbers: an array of integers
	// length: the length of array numbers
	// duplication: (Output) the duplicated number in the array number,length of
	// duplication array is 1,so using duplication[0] = ? in implementation;
	// Here duplication like pointor in C/C++, duplication[0] equal *duplication
	// in C/C++
	// 这里要特别注意~返回任意重复的一个，赋值duplication[0]
	// Return value: true if the input is valid, and there are some duplications
	// in the array number
	// otherwise false
	public boolean duplicate(int numbers[],int length,int [] duplication) {
	    int b[]=new int[length];
	    for(int i=0;i<length;i++){
	    	b[i]=0;
	    }
	    for(int i=0;i<length;i++){
	    	for(int j=0;j<i;j++){
	    		if(numbers[i]==numbers[j]){
	    			b[j]++;
	    		}
	    	}
	    }
	    for(int i=0;i<length;i++){
	    	if(b[i]>0){
	    		duplication[0]=numbers[i];
	    		return true;
	    	}
	    }
	    return false;
    }
	public static void main(CharactorString[] args) {
		Array a = new Array();
		int b[][] = new int[][] { { 1, 2, 3 }, { 3, 4, 5 } };
		int c[] = new int[] { 1, 2, 3, 4, 5 };
		int[] d = a.multiply(c);
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + "  ");
		}
		// System.out.println(a.find(b, 7));
	}
}
