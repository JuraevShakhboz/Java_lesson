package Uchinchi_Oy.dars_41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("files/ismlar.txt");
        HashMap<String, String> hashMap = new HashMap<>();
        String stringBuffer = new String();

        int i = 0;
        while ((i=file.read())!=-1){
            stringBuffer+=(char) i;
        }

        for (String string : stringBuffer.split("\n")) {
            hashMap.put(string.split(" ")[0], string.split(" ")[1]);
        }
        hashMap.forEach((x,y)->{
            System.out.print(x);
            System.out.println(" " + y);
        });

    }
}
