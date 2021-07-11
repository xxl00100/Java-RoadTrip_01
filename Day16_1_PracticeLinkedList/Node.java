package com.Day16_1_PracticeLinkedList;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 15:09
 * @Description: com.Day16_1_PracticeLinkedList
 * @version: 1.0
 */
public  class Node{
    //定义一个节点类，用来存放每个节点的内容：前一个节点地址，值，后一个节点地址
    private Node firstAddress;
    private Object value;
    private Node lastAddress;
    //上面已经定义了三个属性，下面需要提供set和get方法

    public Node getFirstAddress() {
        return firstAddress;
    }

    public void setFirstAddress(Node firstAddress) {
        this.firstAddress = firstAddress;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getLastAddress() {
        return lastAddress;
    }

    public void setLastAddress(Node lastAddress) {
        this.lastAddress = lastAddress;
    }


    //提供一个空参构造器


    public Node() {
    }

    //重写toString方法


    @Override
    public String toString() {
        return "Node{" +
                "firstAddress=" + firstAddress +
                ", value=" + value +
                ", lastAddress=" + lastAddress +
                '}';
    }
}
