package com.Day16_2_MyLinkedlist;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/11 - 07 - 11 - 21:16
 * @Description: com.Day16_2_MyLinkedlist
 * @version: 1.0
 * 再练习实现一次linkedlist的原理
 * Node有三个属性，
 */
public class Node {
    private Node  preNodeAddress;
    private Object thisNodeValue;
    private Node   nextNodeAddress;
    //上面为三个属性，分别存储上一个节点的地址，该节点的值；下一个节点的地址
    //下面提供set和get方法


    public Node getPreNodeAddress() {
        return preNodeAddress;
    }

    public void setPreNodeAddress(Node preNodeAddress) {
        this.preNodeAddress = preNodeAddress;
    }

    public Object getThisNodeValue() {
        return thisNodeValue;
    }

    public void setThisNodeValue(Object thisNodeValue) {
        this.thisNodeValue = thisNodeValue;
    }

    public Node getNextNodeAddress() {
        return nextNodeAddress;
    }

    public void setNextNodeAddress(Node nextNodeAddress) {
        this.nextNodeAddress = nextNodeAddress;
    }

    //提供一个空参构造器


    public Node() {
    }

    //重写toString方法

    @Override
    public String toString() {
        return "Node{" +
                "preNodeAddress=" + preNodeAddress +
                ", thisNodeValue=" + thisNodeValue +
                ", nextNodeAddress=" + nextNodeAddress +
                '}';
    }
}
