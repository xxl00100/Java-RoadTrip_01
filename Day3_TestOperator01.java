import java.util.Scanner;
public class Day3_TestOperator01{
	public static void main(String[] args){
	System.out.println("练习1：给出任意一个四位数，然后分别输出每一个位置上的数字");
	Scanner sc=new Scanner(System.in); //先创建一个scanner，用于取数字；
	System.out.println(System.in);
	System.out.println("请输入一个4位数整数：");
	int num=sc.nextInt();
	String C_num=String.valueOf(num);
	System.out.println(C_num);
										/*
										0最开始尝试直接把int变char，用charAt，结果CharAt是Sting的方法；
										1然后尝试把int变String，结果int无法直接强转为String
										2搜索发现，string的一个方法String.valueOf(int)能够直接转换
										
										*/
										//String C_num=Integer.toString(num);
										
	char a,b,c,d;
	a=C_num.charAt(0);
	b=C_num.charAt(1);
	c=C_num.charAt(2);
	d=C_num.charAt(3);
	
											/*
												int a,b;
												int c,d;//定义千分位，百分位，十分位，个位；
												a=C_num.charAt(0);
												b=C_num.charAt(1);
												c=num%100/10;//问题：计算顺序是什么？从左到右吗？
												d=(num%100)%10;
												*/
	System.out.println("你输入的数字"+num+"的千分位是:"+a+",百分位是:"
	+b+",十分位是:"+c+"个位是:"+d);

	System.out.println("==============我是分割线==============");
	System.out.println("练习3:三元运算符");
	System.out.println(5>9?0:100);
	System.out.println("==============我是分割线==============");
	System.out.println("练习4:实现功能，由男生女生确定晚饭，如意见一致输出听男孩的，反之输出听女孩的");
	Scanner sc1=new Scanner(System.in);
	System.out.println("晚饭内容选项：1.火锅；2.西餐;3.麻辣烫;4.烧烤");
	System.out.print("请男孩输入选择:");
	int BoyChoice=sc1.nextInt();
	System.out.print("请女孩输入选择:");
	int GirlChoice=sc1.nextInt();
	System.out.println(GirlChoice==BoyChoice?"听男孩的":"听女孩的");


	
	}
	
}