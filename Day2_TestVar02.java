public class Day2_TestVar02{
	public static void main(String[] args){
		System.out.println("练习1：类型强制转换");
		int a=6;
		double b=3.8;
		System.out.println("a="+a+";"+"b="+b);
		double a1=(double) a;
		System.out.println("强转double的a="+a1);
		int b1=(int) b;
		System.out.println("强转int的b="+b1);
		System.out.println("多种类型的强转实例如下：");
		double c =122+56L+8.5F+'a';//+true;
		System.out.println(c);
		byte b2=(byte)300;
		System.out.println(b2);
		
		
		
		
	}
}