import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        try {
            // Writing primitive data to a file
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));
            
            dos.writeInt(25);           // writing an int
            dos.writeDouble(99.75);     // writing a double
            dos.writeBoolean(true);     // writing a boolean
            dos.writeUTF("Hello Java"); // writing a string
            
            dos.close();
            System.out.println("Data written successfully.\n");

            // Reading primitive data from the file
            DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"));
            
            int age = dis.readInt();
            double score = dis.readDouble();
            boolean status = dis.readBoolean();
            String message = dis.readUTF();
            
            dis.close();  

            // Displaying data
            System.out.println("Reading data from file:");
            System.out.println("Int: " + age);
            System.out.println("Double: " + score);
            System.out.println("Boolean: " + status);
            System.out.println("String: " + message);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

