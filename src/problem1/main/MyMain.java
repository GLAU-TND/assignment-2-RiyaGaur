/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(3);
        obj.insert(1);
        obj.insert(5);
        obj.insert(2);
        obj.insert(4);
        System.out.print("All Left Nodes: ");
        obj.printLeftNode();
        System.out.println();
        System.out.print("Count of without left node Nodes: ");
        obj.NotLeftcount();
    }

}
