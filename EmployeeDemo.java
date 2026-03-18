class Employee {
    String name;
    double salary;

    void setDetails(String n, double s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setDetails("Subir", 50000);
        e.display();
    }
}

/*
public class OperatorsDemo {
    public static void main(String[] args) {

        int a = 5;

        // Increment
        a++;
        System.out.println("After increment: " + a);

        // Decrement
        a--;
        System.out.println("After decrement: " + a);

        // If-Else
        if(a > 5){
            System.out.println("a is greater than 5");
        } else {
            System.out.println("a is less or equal to 5");
        }

        // While Loop
        int i = 1;
        while(i <= 5){
            System.out.println("Count: " + i);
            i++;
        }
    }
}

public class MatrixMultiplication {

    public static void main(String[] args) {

        int a[][] = {{1,2},{3,4}};
        int b[][] = {{5,6},{7,8}};
        int c[][] = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=0;

                for(int k=0;k<2;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }

                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

class Animal {

    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{

    void bark(){
        System.out.println("Dog is barking");
    }
}

public class InheritanceDemo{

    public static void main(String[] args){

        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

public class ExceptionDemo {

    public static void main(String[] args) {

        try{
            int a = 10;
            int b = 0;
            int c = a/b;

            System.out.println(c);
        }

        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        finally{
            System.out.println("Program Finished");
        }
    }
}

class Parent{

    void show(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent{

    void show(){
        System.out.println("This is child class");
    }
}

public class OverrideDemo{

    public static void main(String[] args){

        Child c = new Child();
        c.show();
    }
}

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamDemo {

    public static void main(String[] args) {

        try{

            FileInputStream fin = new FileInputStream("input.txt");
            FileOutputStream fout = new FileOutputStream("output.txt");

            int i;

            while((i = fin.read()) != -1){
                fout.write(i);
            }

            fin.close();
            fout.close();

            System.out.println("File copied successfully");
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}

class Counter {

    int count = 0;

    synchronized void increment(){
        count++;
    }
}

class MyThread extends Thread{

    Counter c;

    MyThread(Counter c){
        this.c = c;
    }

    public void run(){

        for(int i=0;i<1000;i++){
            c.increment();
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter: " + c.count);
    }
}
*/