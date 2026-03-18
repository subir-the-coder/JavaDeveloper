import java.io.*;
import java.util.Scanner;

// Serializable Student class
class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    long rollNo;
    double marks;

    Student(String name, long rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class ObjectStreamExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
     
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            long rollNo = sc.nextLong();

            System.out.print("Enter marks: ");
            double marks = sc.nextDouble();

        
            Student s1 = new Student(name, rollNo, marks);

        
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
            oos.writeObject(s1);
            oos.close();
            System.out.println("\nObject has been serialized to student.dat\n");

        
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"));
            Student s2 = (Student) ois.readObject();
            ois.close();

         
            System.out.println("Deserialized Object:");
            s2.display();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}

