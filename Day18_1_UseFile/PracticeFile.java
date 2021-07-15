package Phase2.Day18_1_UseFile;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/15 - 07 - 15 - 22:17
 * @Description: Phase2.Day18_1_UseFile
 * @version: 1.0
 */
public class PracticeFile {
    //这是main方法,是程序的入口
    public static void main(String[] args) throws IOException {
        System.out.println(66666);
        File f=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test.txt");
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.isHidden());
        System.out.println(f.exists());
        System.out.println(f.length());
        File f1=new File("D:\\Asofts\\JavaDemos\\src\\Phase2\\test2.txt");
        if (f1.exists()){
            f1.delete();
        }
        else {
            System.out.println(f1.createNewFile());
        }
        System.out.println("比较f和f1内存地址：:"+(f==f1));
        System.out.println("比较f和f1文件路径：:"+f.equals(f1));
        System.out.println("绝对路径："+f1.getAbsolutePath());
        System.out.println("相对路径："+f1.getPath());
        System.out.println("toStrign："+f1.toString());

    }
}
