import java.util.Scanner;
public class Day5_TestArray02
{
	public static void main(String[] args)
	{
		System.out.println("先实现一个功能，用户输入数字，给出其中的最大值，最小值");
		System.out.println("请确定您要输入几个数字:");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int arr1 [] =new int [count];
		for(int i=1;i<=count;i++)
		{							//取数
			System.out.print("请输入第"+i+"个数:");
			arr1[i-1]=sc.nextInt();
		}
		System.out.print("您输入的数分别为:");
		for(int num:arr1)
		{						//增强for循环，打印所有数
			System.out.print(num+"\t");
		}
		System.out.println();					//换行
		int max=arrayMax(arr1);
		int min=arrayMin(arr1);
		System.out.println("您输入的最大值为:"+max);	
		System.out.println("您输入的最小值为:"+min);
		
		System.out.println("========分割线==============");
		System.out.println("练习2：数组的查询");
		System.out.println("请您选择要查寻的索引值");
		System.out.print("可选的索引范围是:");
		for(int i=0;i<count;i++)
		{
			System.out.print(i+"\t");
			if (i==count-1)
			{
				System.out.println();
			}
		}
			//上面的代码给用户列出了可查询的索引范围；
		System.out.print("请输入查寻的索引值:");
		int index=sc.nextInt();
		System.out.println("索引为"+index+"处的值为:"+arr1[index]);
		//上面的代码反悔了指定索引的值
		//下面根据代码，给出索引；
		
		System.out.println("练习3：数组的查询-根据输入值，返回索引!");
		System.out.print("可选的值范围是:");
		for(int num: arr1)
		{
			System.out.print(num+"\t");
		}
		System.out.println( );
		//上面的代码给出可选值并换行；
		//下面让用户选择要查询的值；
		System.out.print("您想知道哪个值对应的索引呢？");
		int value = sc.nextInt();
		getIndex(value,arr1);  //调用方法获取
		
		
		
	}
	//获取最大值的方法
	public static int arrayMax(int arr[])
	{
		int max=0;
		//int index=0; 暂时没实力返回多个值
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]>max)
			{
				max=arr[i];
				//index=i;
			}
		
		}
		return max;	
	}
	//获取最小值的方法
	public static int arrayMin(int arr [])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	
	//获取索引值的方法
	public static void getIndex(int value, int arr[])
	{
	//value 是查询值，数组arr是查询的范围；
	for(int i=0;i<arr.length;i++)
	{
	if(value==arr[i])
	{
		System.out.println("您查询的值:"+value+"对应的索引值有:"+i+"\t");
	}	
	}
	
	
	}
}