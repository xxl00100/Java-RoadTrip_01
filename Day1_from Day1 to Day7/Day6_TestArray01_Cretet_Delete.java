import java.util.Scanner;
public class Day6_TestArray01_Cretet_Delete{
	public static void main(String[] args){
		System.out.println("实现功能：体验数组的增加和删除");
		System.out.println("要求1：让用户输入一个数组");
		System.out.println("要求2：打印这个数组和对应的索引");
		System.out.println("要求3：让用户选择下一步是使用增加功能，还是删除功能");
		System.out.println("3.1:若为增加功能，确定增加的个数和，及其增加到的位置，然后输出");
		System.out.println("3.2:若为删除功能，确定删除的个数，及其删除的索引");
		System.out.println("===============分割线================");
		Scanner sc=new Scanner(System.in);
		System.out.print("您准备输入几个数呢？");
		int count0= sc.nextInt();
		int arr0 [] =new int[count0];
		for(int i=1;i<=arr0.length;i++)
		{
			System.out.print("请输入第"+i+"个数:");
			arr0[i-1]=sc.nextInt();
		}
		//上面的代码完成了原始数组的采集；
		System.out.print("您输入的内容为:");
		for(int num:arr0)
		{
			System.out.print(num+"\t");
		}
		System.out.println();
		//上面的代码实现数组的打印和换行
		System.out.print("对应的索引为:");
		for(int i=0;i<arr0.length;i++)
		{
			System.out.print("\t"+i);
		}
		System.out.println();
		//上面的代码实现索引的打印
		System.out.print("请选择功能:1.增加功能；2.删除功能:");
		int function = sc.nextInt();
		if(function==1)
		{
		
			System.out.print("您选择了增加功能:");
			//调用数组的增加方法
			System.out.print("请您确定要增加的位置:");
			int index=sc.nextInt();
			System.out.print("请您确定要增加数字:");
			int newly_add_value=sc.nextInt();
			System.out.print("增加后数组为:");
			addFunction(index,newly_add_value,arr0);
			

		}
		else if(function==2)
		{
			System.out.println("您选择了删除功能:");
			//调用数组的删除方法
			/*System.out.print("请您确定要增加的位置:");
			int index=sc.nextInt();
			System.out.print("\t"+"请您确定要增加数字:");
			int newlyadd=sc.nextInt();
			*/
		}
		else
		{
			System.out.print("请您选择1或者2！！！");
		}
		
	}
	
	//增加的方法
	 public static void addFunction(int index,int value,int arr[])
	{
		int arr1[]=new int[arr.length+1];
		//上面新建一个数组用于接收
		if(index==0)
			{
				arr1[0]=value;
				for(int i=0;i<arr1.length;i++)
				{
					arr1[i+1]=arr[i];
			    }
			}
		//先判断添加时候添加到第一个索引
		else
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(i<index)
				{
					arr1[i]=arr[i];
				}
				else if(i==index)
				{
					arr1[i]=value;
				}
				else 
				{
					arr1[i]=arr[i-1];
				}
			}
		}
				//在这里犯了一个错误:把语句放到方法外面的括号了，导致半天没找到原因
		//System.out.print("请您选择1或者2！！！");
		for(int i=0;i< arr1.length;i++)
		{
			
			System.out.print(arr1[i]+"\t");
			
		}
		//*/	
		}

	}	

	




















//Day6_TestArray01_Cretet_Delete.java