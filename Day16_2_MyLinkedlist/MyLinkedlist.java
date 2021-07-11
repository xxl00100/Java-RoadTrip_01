package com.Day16_2_MyLinkedlist;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 21:21
 * @Description: com.Day16_2_MyLinkedlist
 * @version: 1.0
 *
 * //自己实现linkedlist的代码
 */
public class MyLinkedlist {
    //有三个属性，肯定有首节点、尾节点、和一个计数器
    Node firstNode;
    Node endNode;
    int count=0;
    //提供一个添加元素进去的方法
    public void add(Object obj){
        if(firstNode==null){
            Node n=new Node();
            n.setPreNodeAddress(null);
            n.setThisNodeValue(obj);
            n.setNextNodeAddress(null);
            //上面代码的含义：如果这是第一个节点，那么就把这个obj赋值给n，并且前后地址都是null
            firstNode=n;
            endNode=n;
            //上面代码的含义：因为这是第一个节点，那么它的首节点尾节点都是自己，所以把n分别赋值给首尾节点

        }
        else{//如果不是第一个节点的话，那么执行下面的语句
            Node n=new Node();
            n.setPreNodeAddress(endNode);  //把上一个节点的地址赋给这个节点的第一个地址，成功连接到上一个节点，但是上一个节点还不认识这个节点
            n.setThisNodeValue(obj);
            n.setNextNodeAddress(null);
            //上面的代码生成了一个新节点，并且成功把这个新节点链接到上一个节点
            endNode.setNextNodeAddress(n);//把上一个节点的尾地址指向这个新创建的地址，现在上一个节点也能找到这个新的节点了
            //然后需要把尾节点替换为这个新添加的节点
            endNode=n;

        }
        count++; //每添加一个新节点，那么数量应该加一
    }

    //提供一个获取集合大小的方法
    public void size(){
        System.out.println("该集合的大小为："+count);
    }

    //提供一个根据索引获取值得方法
    public Object get(int index){
        Node n=firstNode;//先定位到第一个节点
        for(int i=0;i<index;i++){
            n= n.getNextNodeAddress();//不断获取下一个节点，直到节点索引==index位置
        }
        return n.getThisNodeValue();


    }

    //提供一个空参构造器


    public MyLinkedlist() {
    }

    //重写toString方法

    @Override
    public String toString() {
        Object [] obj=new Object[this.count];
        for(int i=0;i<count;i++){
            obj[i]=this.get(i);
        }
        return obj.toString();
    }
}
