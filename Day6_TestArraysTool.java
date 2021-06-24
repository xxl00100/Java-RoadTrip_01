import java.util.Scanner;
import java.util.Arrays;
public class Day6_TestArraysTool{
	public static void main(String[] args){
		//让用户输入一个数字，并练习使用Arrays
		System.out.println("让用户输入一个数字，并练习使用Arrays");
		System.out.print("请您输入数组的长度:");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int arr0[]=new int [count];
		for(int i=1;i<=count;i++)
		{
			System.out.print("请您输入第"+i+"个数:");
			arr0[i-1]=sc.nextInt();
		}			
		System.out.print("通过toString遍历:");
		System.out.print(Arrays.toString(arr0));
		System.out.println();
		Arrays.sort(arr0);
		System.out.print("通过sort将数组升序排列:");
		System.out.print(Arrays.toString(arr0));
		System.out.println();
		int arr2[]=Arrays.copyOf(arr0,3);
		System.out.print("通过copyOf将数组复制前3个内容:");
		System.out.print(Arrays.toString(arr2));
		System.out.println();
		int arr3 [] = Arrays.copyOfRange(arr0,1,3);
		System.out.print("通过copyOfRange将数组复制[1,3)的内容:");
		System.out.print(Arrays.toString(arr3));	
		System.out.println();		
		int arr4 [] =arr0;
		System.out.print("通过equals判断两个数组值是否一致:");
		System.out.print(Arrays.equals(arr4,arr0));		
		
		
	}
}

//Day6_TestArraysTool.java