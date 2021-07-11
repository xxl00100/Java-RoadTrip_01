package com.Day16_1_PracticeLinkedList;

import java.util.LinkedList;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 14:15
 * @Description: com.Day16_1_PracticeLinkedList
 * @version: 1.0
 *         LinkedList常用方法：
 *         增加 addFirst(E e) addLast(E e)
 *              offer(E e) offerFirst(E e) offerLast(E e)
 *         删除 poll()
 *             pollFirst() pollLast()  ---》JDK1.6以后新出的方法，提高了代码的健壮性
 *             removeFirst() removeLast()
 *         修改
 *         查看 element()
 *              getFirst()  getLast()
 *              indexOf(Object o)   lastIndexOf(Object o)
 *              peek()
 *              peekFirst() peekLast()
 *         判断
 *
 */
public class Methods_Of_LinkedList {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
        list.add("aaaa");
        list.add("eeee");
        System.out.println(list);
//       addFirst、addlast
        list.addFirst("ffff");
        list.addLast("GGGg");
        System.out.println(list);
        System.out.println(list.offer("HHHH"));
        System.out.println(list.offerFirst("III"));
        System.out.println(list.offerLast("JJJ"));
        for(String s:list){
            System.out.println(s);
        }
//        上面是使用增强for进行一次遍历
//        下面使用poll方法
        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list);
        System.out.println(list.element());
        System.out.println(list.peek());


    }
}
