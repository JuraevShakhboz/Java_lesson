package Uchinchi_Oy.dars_45;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Clients {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("fe80::d886:8ea1:f9f4:a789%8",8082);
        while (true) {
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            String s = inputStream.readUTF();
            System.out.println(s);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            dataOutputStream.writeUTF(sc.nextLine());
            dataOutputStream.flush();
        }
    }
}
