package Phase2.Day21_0_IO_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/20 - 07 - 20 - 21:40
 * @Description: Phase2.Day21_IO_practice
 * @version: 1.0
 */
public class TestSystem {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        InputStream in=System.in;
        int n=in.read();
        int n1=2;
        System.out.println((char)n);
        System.out.println((char)n1);


        Scanner sc1=new Scanner(System.in);
        int i=sc1.nextInt();
        System.out.println(i);


        Scanner sc=new Scanner(new FileInputStream(new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt")));
        while (sc.hasNext()){
            System.out.println(sc.next());
        }


    }
}
