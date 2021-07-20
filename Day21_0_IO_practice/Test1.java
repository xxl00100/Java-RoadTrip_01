package Phase2.Day21_0_IO_practice;



import java.io.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/20 - 07 - 20 - 22:05
 * @Description: Phase2.Day21_IO_practice
 * @version: 1.0
 *
 * 从程序中输入内容到文件中保存
 */
public class Test1 {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
//        1.写入方向
        InputStream in=System.in;
        InputStreamReader isr=new InputStreamReader(in);
        BufferedReader br=new BufferedReader(isr);
//2.输出方向
        File f=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\demo1.txt");
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(fw);

//        3.执行写入动作
        String s=br.readLine();
        while (!s.equals("exit")){
            bw.write(s);
            bw.newLine();  //用于换行
            s=br.readLine();
        }

        bw.close();
        br.close();





    }
}
