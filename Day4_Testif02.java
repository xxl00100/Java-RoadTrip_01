import java.util.Scanner;
//重点使用了sc.hasNextInt()方法来判断输入的内容是否为整数，如果是再进行接收

public class Day4_Testif02{
	public static void main(String[] args){
	
	//让会员输入积分，根据积分多少享受折扣;
	System.out.println("练习1：根据积分的多少享受不同的折扣");
	Scanner sc=new Scanner(System.in);
	System.out.print("请输入您的会员积分:");
	if(sc.hasNextInt()==true){
		int num=sc.nextInt();
		if(num>=8000){System.out.println("您享受的折扣为0.6");}
		else if(5000<=num&num<8000){System.out.println("您享受的折扣为0.7");}
		else if(3000<=num&num<5000){System.out.println("您享受的折扣为0.8");}
		else{System.out.println("您享受的折扣为0.9");}
	}
	else{
		System.out.println("您输入的内容不是整数！！！");
	}

	System.out.println("==============我是分割线==============");
/*		实现功能：		    小朋友搬桌子：
							年龄大于7岁，可以搬桌子；
							如果年龄大于5岁，性别是男，可以搬桌子；
							否则不可以搬动桌子，提示：你还太小了
*/
	System.out.println("练习2:实现功能小孩子搬桌子");
	Scanner sc1=new Scanner(System.in);
	System.out.print("请选择您的性别：1.男；2.女：");
	int sex=sc1.nextInt();
	System.out.println(sex);
	if(sex==1|sex==2){
		System.out.print("请输入您的年龄：");
		int age = sc1.nextInt();
		if(age>7){System.out.println("你能够搬动桌子！");	}
		else if(5<age & sex==1){System.out.println("你能够搬动桌子！");	}
		else{System.out.println("你不能搬动桌子！");}
		
		
	}
	else{
		System.out.println("您的性别输入错误！请输入1或者2");
	}


	
	}
}