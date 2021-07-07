public class Day4_Testfor04{
	public static void main(String[] args){
		//打印各种形状
		System.out.println("练习1：打印一个9*5的矩形");
		for(int j=0;j<=4;j++){
			for(int i=1;i<10;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("练习2：打印一个9*5的矩形,距离前方有2个制表位");
		for(int j=0;j<=4;j++){
			System.out.print("\t\t");
			for(int i=1;i<10;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("练习3：打印一个9*5的平行四边形,距离前方有2个制表位");
		for(int j=0;j<=4;j++){
			for(int k=8;k-j>0;k--){
				System.out.print(" ");
			}		
			for(int i=1;i<10;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("========分割线==============");
		System.out.println("练习4：用三重循环解决百钱白鸡问题");
		System.out.println("========分割线==============");
		for(int i =1;i<99;i++){
			for(int j=1;j<99;j++){
				for(int k=1;k<99;k++){
					if((i+k+j==100)&(5*i+3*j+k/3==100)&(k%3==0)){
						System.out.println("公鸡:"+i+"只;"+"母鸡:"+j+"只;"+"小鸡:"+k+"只");
					}
				}
			}
			
		}
		
		
		
		
		
		
		
	}
}