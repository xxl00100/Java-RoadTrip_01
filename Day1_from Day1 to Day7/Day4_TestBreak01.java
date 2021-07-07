public class Day4_TestBreak01{
	public static void main(String[] args){
		//练习1：使用break结束循环；从1往100求和，当sum大于1314时结束，并输出i；
	System.out.println("练习1：使用break结束循环；");	
	System.out.println("从1往100求和，当sum大于1314时结束，并输出i");	
	int sum=0;
	for(int i=1;i<=100;i++){
		sum=sum+i;
		
		if(sum<=1314){
			System.out.print(i+"+");
		}
		else{
			System.out.print("="+sum);
			break;}
	}
	
	
	
	
	}
}