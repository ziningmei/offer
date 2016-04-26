package com.offer;

public class JumpFloor {

	public int jumpFloor(int target) {
		int a=1,b=2,c=0;
		if(target<=0)
			return 0;
		else if (target==1){
			return 1;
		}else if (target==2){
			return 2;
		}else {
            for(int i=3;i<=target;i++){
                c=a+b;
                a=b;
                b=c;
            }
			return c;
		}
    }
	public int jumpFloor1(int target) {
		if(target<=0)
			return 0;
		else if (target==1){
			return 1;
		}else {
			return 2*jumpFloor1(target-1);
		}
    }
	public static void main(CharactorString[] args) {
		// TODO Auto-generated method stub
		JumpFloor jumpFloor=new JumpFloor();
		//System.out.println(jumpFloor.jumpFloor(4));
		System.out.println(jumpFloor.jumpFloor(2));
	}

}
