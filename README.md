# Java-RoadTrip
This repository includes all files and demos on my way to Java
/*
本注释内容写于2021年7月五日下午17:28分；
本来最开始自学的时候，决定把每天的内容更新到git是想保存自己的痕迹，但是突然想起来，这样记录是不是也能证明我的确是在自学不断前进呢？
以后以后找工作面试的时候，能够通过面试官查询今天的更新内容，证明我确实是自己自学不断前进的吧！

现阶段，我在某国企从事国际管理工作，本来的确挺高大上的，但是升职加薪的人能力也就那样，靠着关系却一直扶摇直上；没有关系却干得好努力干活的人只能一直呆在最开始的位置上当老黄牛，看不到晋升希望...
我还年轻，一辈子呆在这个位置是我怎么也接受不了的，跟着自己的兴趣自学转行，离开这里给自己一个交代吧！！！冲冲冲！！！

*/

第一天入门；HelloJavaAgain
Day2：数字类型等内容；
Day3：运算符等内容：
                重点是Scanner;
                step1： import java.util.Scanner;              导入包
                Step2:Scanner sc = new Scanner(System.in);      创建scanner
                Step2: sc.nextInt();                            开始使用scanner的方法
Day4：首先再一次实现昨天的代码；完成循环语句；开始接触方法，知道方法的 定义；
Day5：方法的使用及重载；数组的使用-查询-通过索引返回值Or根据值返回索引；
Day6:数组的使用，二位数组，Arrays工具类的使用；配置IDEA；
Day7：IDEA配置，快捷键；面向对象引入
Day8: 构造器+构造器重载
Day9:内存分析;this的使用;static关键字;代码块;包;
Day10: 在网站上做习题,巩固前几天的知识点;封装;
Day11: 继承;super;权限修饰符private-default-protected-public;继承条件下的方法重载;
Day11:toString方法,equals方法;类和类的三种关系-继承-实现-关联;
Day11:多态-继承;重写方法;父类指向子类的具体实力对象;向上转型-向下转型;简单工厂设计模式;
Day11:final修饰符;抽象abstract;接口interface;内部类;
Day11：练习面向对象的习题。利用了继承、多态、抽象。错误发生最多的地方是拼写错误，导致debug很长时间都没有发现；铭记多态是方法的多态，和属性没关系。自己写的拓展性不强，需要再打磨几次。
Day12_1：练习面向对象习题。注意拼写
Day12_2：再练习面向对象习题，自助点饮料系统--Day12_1_PracticeOOP。    每写完一个case一定要在后面加break， 不然最后一个case会覆盖前面的内容，debug了半天....
Day12_3:异常；try-catch-finally;多重catch；throw和throws；重写--与异常无关；重载--之类的异常小于等于父类的异常；异常自定义-继承异常即可自定义；
Day12_4:明天学习包装类+日期
Day13-0:包装类、自动装箱、自动拆箱、常用包装类方法；
Day13_0:日期相关内容.重点是打印日期的习题.明天再练习几遍;
Day13_1:计划明天String\math\random类;
Day13_2:本条写于2021-7-6暂停一天
Day14_0:复习calendar习题
Day14_1:Sting\math\random类；不可变string和可变StringBuilder、StringBuffer
Day14_2:重新组织了一下文件结构
Day15_0:集合Collection、list接口常用方法；泛型引入；泛型类和泛型接口；
Day16_0:复习泛型；
Day16_1:实现linkedlist;
Day16_2:上传Day16_2_MyLinkedlist，再一次复习实现linkedlist;
Day16_3:上传Day16_3_Iterator_Of_List，练习itterator和listIterator;并发修改异常；
Day17_0:复习一下itterator和listIterator;并发修改异常；由于最近比较忙无法保证每天都在学习，必须得研究一下，让自己能够每天投入到学习中
Day17_1:练习hashset
Day17_2:练习内部外部比较器；内部比较器是自己实现Comparable接口并重写compareTo方法，健壮性不强；外部比较器是新建一个实现了comparator接口并重写了compare方法的外部类，健壮性好，推荐。
Day17_3:练习treeSet，特点不重复，自动升序排列；升序的依据根据比较器确定、如果是内部比较器需要实现comparable接口并重写CompareTo方法；如果是外部比较器需要实现Comparator接口，重写Compare方法；
         可以通过TressSet<> ts=new TreeSet<>(外部比较器）; 对集合进行制定比较器；
Day17_4:练习treeMap；Map常用方法；比较器；使用匿名内部类制定外部比较器
Day17_5:学习HashMap、hashset;Treeset,TreeMap,collections工具类
Day18_0：复习Collections工具类ReviewCollections；addAll、sort、binarySearch、copy、fill
Day18_1:引入file类，进行练习。
Day19_0:Filereader and Filewriter
Day19_1: fileInputstream  fileoutputstream
Day19_2: BufferedInputStream  BufferedoutputStream
Day19_3:Filereader  filewriter
Day19_4:InputStreamReader OutputStreamReader
Day20_0:复习Day19，学习完io剩下的基础，还没练习。
Day21_0:复习IO。
Day21_1:序列化、反序列化、结束IO的内容。明天开始学习线程。
Day22_0:线程的三种创建方式-继承Thread，实现Runable，实现Callable（有返回值，可抛异常，但是创建麻烦）。
Day23_0:线程复习；线程常用方法
Day24_0~4:复习线程内容;线程安全lock和synchronized;线程通信
Day24_5~6:网络通信.InetAddress和InetSocketAddress;实现tcp的双向通信;
Day25_0: 复习day24
Day25_1: TCP通信优化
Day25_2:UDP引入,单向通信.
Day26_0:复习Day25
Day26_1:UDP双向通信；Annotation相关内容
Day27_0_:完成注解和枚举类,但是练习javadoc把以前的.java文件全部弄成了.html,搞了半天没有解决只能新建一个project; 还好每天都上传了,不然就惨了
Day28_0:反射引入+注解练习
Day29_0:反射完成;下一阶段是数据库,本周先复习巩固已经学习的知识;已经提前完成自己的订的31号之前完成阶段5的目标.yeah!
Day30_0:安装数据库软件mysql+navicat  开始进行第六阶段. 冲

Day31_0:完成数据库mysql的的基础知识, 快速过了一遍
