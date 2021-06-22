public class Day4_Testfor02{
	public static void main(String[] args){
		//实现正向乘法口诀；
		System.out.println("下面输出正向乘法口诀:");
		for(int j=1;j<=9;j++){
			for(int i=1;i<=j;i++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
		System.out.println();	
		}
		//实现反向乘法口诀；
		System.out.println("========分割线==============");
		System.out.println("下面输出反向乘法口诀:");
		for(int j=9;j>=1;j--){
			for(int i=1;i<=j;i++){
				System.out.print(i+"*"+j+"="+j*i+"\t");
			}
		System.out.println();
		}
		
	}
}