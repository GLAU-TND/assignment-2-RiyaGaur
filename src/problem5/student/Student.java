/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    int roll;
    int count;
    int backlog;

    public Student(int roll, int backlog, int count) {
        this.roll = roll;
        this.count = count;
        this.backlog = backlog;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", backlog=" + backlog +
                ", count=" + count +
                '}';
    }

    public int getRoll() {
        return roll;
    }

    public int getcount() {
        return count;
    }

    public int getBacklog() {
        return backlog;
    }
}