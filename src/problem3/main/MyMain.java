/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("Akanksha ",1);
        obj.insert("Riya",4);
        obj.insert("Pragya",3);
        obj.insert("Khushi",2);
        obj.insert("Sameeksha",5);
        obj.display();
    }
}
