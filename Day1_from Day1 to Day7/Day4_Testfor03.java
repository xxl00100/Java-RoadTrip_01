import java.util.Scanner;
public class Day4_Testfor03{
	public static void main(String[] args){
		/*实现一个功能：
		1.录入十个整数，当输入数字是666时，程序会退出；
		2.判断其中录入正数的个数并将其打印；
		3.判断系统的退出状态。若正确录入十个数则为正常退出，其余情况为异常；
		
		*/
		System.out.println("练习1:录入十个数并判断");
		Scanner sc=new Scanner(System.in);
		int count=0;
		boolean status=true;
		for(int i=1;i<11;i++){
			System.out.print("请输入第"+i+"个整数:");
			int num=sc.nextInt();
			if(num==666){
				status=false;
				System.out.println("您输入了中止数666,程序异常退出");
				break;
			}
			if(num>0){
				count++;
			}
		}
		if(status){
			System.out.println("程序正常退出，您一共录入了"+count+"个正整数");
		}
		else {
			System.out.println("程序异常退出!" );
		}
		
	}
}