public class Day4_TestMethod02{
	public static void main(String[] args){
		//判断数据交换是否成功；
		System.out.println("判断数据交换是否成功");
		int a=10;int b=20;
		System.out.println(a+"---原始的a;  原始的b---"+b);
		changeNum(a,b);
		System.out.println(a+"---方法调用后的a;  方法调用后的b---"+b);
	}
	public static void changeNum(int a,int b){
		int c;
		c=a;
		a=b;
		b=c;
		
		
	}
	
}