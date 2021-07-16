package Phase2.Day19_3_UseFileReader_Writer;

import java.util.Scanner;

import java.io.*;
import java.util.Scanner;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/16 - 07 - 16 - 22:23
 * @Description: Phase2.Day19_3_UseFileReader_Writer
 * @version: 1.0
 */
public class TestFileReader_Writer {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt");
        File f2=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test1.txt");
        FileReader fr=new FileReader(f1);
        FileWriter fw=new FileWriter(f2);
        BufferedReader br=new BufferedReader(fr);
        BufferedWriter bw= new BufferedWriter(fw);
        Scanner sc=new Scanner(System.in);

        System.out.println("请选择生成方式：1-挨个字符生成；2-使用缓冲数组；3-读取String");
        int order=sc.nextInt();
        switch (order){
            case 1: {
                System.out.println("这是使用挨个字节");
                int n = br.read();
                while (n!=-1){
                    bw.write(n);
                    n = br.read();
                }
                bw.close();
                br.close();
                break;
            }

            case 2: {
                System.out.println("这是使用缓冲数组");
                char[] b=new char[30];
                int len=br.read(b);
                while (len!=-1){
                    bw.write(b,0,len);
                    len=br.read(b);
                }
                bw.close();
                br.close();
                break;
            }

            case 3: {
                System.out.println("这是使用String");
                String s = br.readLine();
                while (s!=null){
                    bw.write(s);
                    bw.newLine();
                    s =br.readLine();
                }
                bw.close();
                br.close();
                break;
            }


            default:
                throw new IllegalStateException("Unexpected value: " + order);
        }




    }
}
