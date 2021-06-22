import java.util.Scanner;
public class Day4_TestWhile01{
	public static void main(String[] args){
		//实现一个功能，输入一个整数i，然后从输出Sum=1+2+3+...+i
	System.out.println("实现一个功能，输入一个整数i，然后从输出Sum=1+2+3+...+i");	
	Scanner sc=new Scanner(System.in);
	System.out.print("请输入一个正整数:");
	int i=sc.nextInt(); 					//取数
	int i0=i;								//方便打印
	int sum=0;
	while(i!=0){
		sum=sum+i;
		i--;
	}
	System.out.println("Sum=1+2+3+...+"+i0+"="+sum);
	
	System.out.println("==============我是分割线==============");
	System.out.println("练习2：使用for循环再重复上面的过程 ");	
	System.out.print("请输入一个正整数:");
	int num=sc.nextInt();
	int sum1=0;
	for(int a=0;num!=a-1;a++){
		sum1=sum1+a;
		
	}
	System.out.println("Sum=1+2+3+...+"+num+"="+sum1);
	
	
	}
}