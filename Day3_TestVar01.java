import java.util.Scanner;
import java.util.Scanner;
public class Day3_TestVar01{
	public static void main(String[] args){
		//实现计算圆的周长和面积
		System.out.println("练习1");
		double r=50;
		final double PI=3.14;
		System.out.println("变量PI被final修饰变成字符常量，需要全部大写");
		double c=2*PI*r;
		double s=PI*r*r;
		System.out.println("圆半径为"+r+"的周长是："+c);
		System.out.println("圆半径为"+r+"的面积是："+s);
		//联系2，使用scanner
		System.out.println("==============我是分割线==============");
		System.out.println("练习2");
		System.out.print("练习使用SCanner,请输入一个数字用于计算，然后回车：");
		Scanner sc= new Scanner(System.in);
		double r1=sc.nextDouble();
		double c1=2*PI*r1;
		double s1=PI*r*r1;
		System.out.println("圆半径为"+r1+"的周长是："+c1);
		System.out.println("圆半径为"+r1+"的面积是："+s1);
		System.out.println("==============我是分割线==============");
		System.out.println("练习3");
		System.out.println("加深使用SCanner，键盘录入年龄、身高、姓名、性别");
		//定义一个scanner
		Scanner sc1= new Scanner(System.in);
		System.out.print("您的姓名是：");
		String name = sc1.next();//写错了String name = sc1.nextString();接受String的方法叫做next
		System.out.print("您的性别是：");
		String sex=sc1.next();
		System.out.print("您的年龄是：");
		int age = sc1.nextInt();
		System.out.print("您的身高是：");
		Double height = sc1.nextDouble();//出错，因为身高有小数，不能用nextInt
		//以上内容获取信息，下面开始输出
		System.out.println("您的个人信息如下：");
		System.out.println("您叫"+name+","+sex+","+"今年"+age+"岁,身高"+height);
	}
}
