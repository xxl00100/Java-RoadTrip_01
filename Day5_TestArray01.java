import java.util.Scanner;
public class Day5_TestArray01{
	public static void main(String[] args){
		//先实现一个功能，录入十个数，求出其和，以及平均；
		System.out.println("先实现一个功能，录入十个数，求出其和，以及平均");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<11;i++){
			System.out.print("请输入第"+i+"个数:");
			int score=sc.nextInt();
			sum+=score;
		}
		System.out.println("您输入的十个数的和是:"+sum);
		System.out.println("您输入的十个数的均值是:"+(sum/10));
		
		System.out.println("========分割线==============");
		System.out.println(" 上面的功能无法存储输入的是个数据  ---》使用数组进行练习2：");
		System.out.println("需求1.使用数组让用户确定要输入几个数字；");
		System.out.println("需求2.打印用户输入的所有数字；");
		System.out.println("需求3.求和以及平均值；");
		System.out.print("您好，请确定您要输入的数字个数：");
		int count=sc.nextInt();
		int arr2 [];
		arr2 =new int [count];
		//int arr2[]=new int [count];
		int sum2=0;
		for(int i=1;i<=count;i++){
			System.out.print("请输入第"+i+"个数:");
			arr2[i-1]=sc.nextInt();
			sum2+=arr2[i-1];
		}
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		System.out.println("您输入的"+count+"个数的和是:"+sum2);
		System.out.println("您输入的"+count+"个数的均值是:"+(sum2/count));
		
	}
}