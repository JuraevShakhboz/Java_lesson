package Uchinchi_Oy.dars_45;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class User {
    static Scanner sc = new Scanner(System.in);
    static String name;
    public static void main(String[] args) throws IOException, InterruptedException {
        user();
    }
    private static void user() throws IOException{

        System.out.println("Enter the username: ");
        name = sc.next() + sc.nextLine();
        Socket user = new Socket("10.10.1.19", 6666);
        DataOutputStream out = new DataOutputStream(user.getOutputStream());
        DataInputStream in = new DataInputStream(user.getInputStream());
        new Thread(() -> write(out)).start();
        new Thread(() -> read(in)).start();
    }
    private static void write(DataOutputStream out){
//        Scanner sc = new Scanner(System.in);
        while (true)
            try {
                out.writeUTF(name + ": " + sc.next() + sc.nextLine());
                out.flush();
            }catch (IOException e) {
                System.err.println("Yozishda qandaydir xatolik bo'ldi.");
                exit();
            }
    }
    private static void read(DataInputStream in){
        while (true)
            try {
                System.out.println("\nServer: " + in.readUTF() + "\n");
            } catch (IOException e) {
                System.err.println("O'qib olishda qandaydir xatolik bo'ldi.");
                exit();
            }
    }
    private static void exit(){
        Runtime.getRuntime().exit(0);
    }
}
