import java.util.Scanner;
public class Day4_ReviewDay3_01{
	public static void main(String[] args){
		//实现功能输入一个数，计算圆的面积周长
	System.out.println("复习Day3，取数计算圆的面积和周长");
	final double PI=3.14;
	Scanner sc=new Scanner(System.in);
	System.out.print("请输入圆半径：");
	double r=sc.nextDouble();
	double cu=2*PI*r;
	double s=PI*r*r;
	System.out.println("半径为"+r+"的圆周长是:"+cu+",圆面积是:"+s);
	
	System.out.println("==============我是分割线==============");
	System.out.println("复习2:给出任意一个四位数，然后分别输出每一个位置上的数字");
	System.out.print("请输入一个四位数整数:");
	int num=sc.nextInt();
	String str=String.valueOf(num);
	char a,b,c,d;
	a=str.charAt(0);
	b=str.charAt(1);
	c=str.charAt(2);
	d=str.charAt(3);
	System.out.println("您输入的四位数:"+num+"的千分位是:"+a+",百分位是:"+b
	+",十分位是:"+c+",个位是:"+d);
	
	
	System.out.println("==============我是分割线==============");
	System.out.println("复习3:键盘录入年龄、身高、姓名、性别");
	System.out.print("请输入您的姓名:");
	String name=sc.next();
	System.out.print("请选择您的性别:1.Male;2.Female:");
	int choice=sc.nextInt();
	String sex=(choice==1?"Male":"Female");
	System.out.print("请请输入您的年龄:");
	int age=sc.nextInt();
	System.out.print("请请输入您的身高:");
	double height=sc.nextDouble();
	System.out.println("您的个人信息如下：");
	System.out.println("您叫"+name+","+sex+","+"今年"+age+"岁,身高"+height);
	
	System.out.println("==============我是分割线==============");
	System.out.println("复习4:实现功能，由男生女生确定晚饭，如意见一致输出听男孩的，反之输出听女孩的");
	System.out.println("晚餐的选项有:1.西餐;2.中餐;3.火锅;4.烧烤");
	System.out.print("请男孩输入数字进行选择:");
	int Boy_Choice=sc.nextInt();
	System.out.print("请女孩输入数字进行选择:");
	int Girl_Choice=sc.nextInt();
	System.out.println(Girl_Choice==Boy_Choice?"听男孩的":"听女孩的");
	
	}
}