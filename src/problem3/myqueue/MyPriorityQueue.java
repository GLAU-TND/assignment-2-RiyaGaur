/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    Node head;

    public MyPriorityQueue(){
        head = null;
    }

    public void insert(String name,int roll){
        Node nd = new Node();
        nd.setName(name);
        nd.setRoll(roll);
        Node temp = head;
        if(head==null){
            head = nd;
        }
        else{
            if(head.getRoll()>roll){
                nd.setNext(head);
                head = temp;
            }
            else{
                while(temp.getNext()!=null && temp.getNext().getRoll()<roll){
                    temp = temp.getNext();
                }
                nd.setNext(temp.getNext());
                temp.setNext(nd);
            }
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.getRoll()+"\t"+temp.getName());
            temp = temp.getNext();
        }
    }
}
