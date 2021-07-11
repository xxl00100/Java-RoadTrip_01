package com.Day16_1_PracticeLinkedList;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 14:27
 * @Description: com.Day16_1_PracticeLinkedList
 * @version: 1.0
 */
public class Implement_Linkedlist {
    //    本类用于设置方法，
//    链中一定会有一个首节点和一个尾节点，还应该有一个计数器，用来判断有多少个原色
    Node firstNode;
    Node lastNode;
    int count = 0;

    //元素定义完毕，上面
    //提供一个空参构造器避免出错
    public Implement_Linkedlist() {
    }

    //提供一个添加元素的add方法
    public void add(Object o) {
        if (firstNode == null) {
            Node n = new Node();
            n.setFirstAddress(null);
            n.setValue(o);
            n.setLastAddress(null);
            firstNode = n;
            lastNode = n;
            //先判断第一个节点是否有值，若没有则把这个值添加到首节点,并把尾节点也设置为自己
        } else {
            Node n = new Node();
            n.setFirstAddress(lastNode);
            n.setValue(o);
            n.setLastAddress(null);
            //上面完成这个节点的赋值，下面需要把上一个的节点的尾地址指向这个节点
            lastNode.setLastAddress(n);  //上一个节点的尾地址指向这个节点
            lastNode = n;   //然后把这个新节点设置为最后一个节点

        }
        count++;  //每添加一个新结点计数加一
    }

    // 提供一个获取长度的方法
    public int size() {
        return count;
    }

    //    提供一个根据索引返回值得方案
    public Object get(int index) {
        //先获取这个集合的头部位置
        Node n=firstNode;
         //然后开始遍历
        for(int i=0;i<index;i++){
            n=n.getLastAddress();
        }
        return n.getValue();
    }


}


