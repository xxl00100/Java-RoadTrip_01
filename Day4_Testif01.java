import java.util.Scanner;
//使用Math.random()不需要导包
public class Day4_Testif01{
	public static void main(String[] args){
		
		//练习一：实现功能：输入三个0~5的数，求和>=10,一等奖；5<=和<10,二等奖，否则三等奖
	System.out.println("奖品分级");
	System.out.print("请在0,1,2,3,4,5中选择一个数字输入:");
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	System.out.print("请在0,1,2,3,4,5中选择一个数字输入:");
	int num2=sc.nextInt();
	System.out.print("请在0,1,2,3,4,5中选择一个数字输入:");
	int num3=sc.nextInt();
	int sum=num1+num2+num3;
	//上面代码完成取数和求和，下面开始逻辑匹配;
	if(sum>=10){
		System.out.println("恭喜你获得一等奖！");
	}
	else if(5<=sum&sum<10){
		System.out.println("恭喜你获得二等奖！");
	}
	else{
		System.out.println("恭喜你获得三等奖！");
	}
	
	
	
	//练习2： 实现随机数。分别实现[32,98] 和 [0,66]的两个随机数，并相减
	System.out.println("==============我是分割线==============");
	System.out.println("练习2：先练习使用随机数生成Math.random ");
	double a =Math.random();
	int b=(int)(Math.random()*10);
	System.out.println(a+"是用Math.random生成的");
	System.out.println(b+"是用Math.random*10并强转生成的");
	System.out.println("练习3:实现[32,98]的一个随机数 ");
	int c=(int)(Math.random()*99); //生成0~98的数
	int d=(int)(-1*(Math.random()*33));
	int e=c+d;
	System.out.println(e+"是介于[32,98]的一个随机数");
	
	
	
	
	
	
	
	
	}

}