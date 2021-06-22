import java.util.Scanner;
public class Day4_TestMethod01{
	public static void main(String[] args){
		//实现一个猜数的小功能，你输入一个数，我输入一个数，然后比较是否相同
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入您的底数:");
		int a = sc.nextInt();
		System.out.print("请输入您猜测数:");
		int b = sc.nextInt();
		System.out.println(guessNums(a,b));
	}	
	public static String guessNums(int a,int b){
		
		return a==b?"你猜对了":"你猜错了";
		
	}
	
	
}

