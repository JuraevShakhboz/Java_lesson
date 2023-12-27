package Uchinchi_Oy.dars_42;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {

        try(FileInputStream fileInputStream = new FileInputStream("files/dars43.txt")){
            String s = new String(fileInputStream.readAllBytes());
            System.out.println(s);
        }catch (FileNotFoundException e){
            System.out.println("Bu nomdagi file yo'q");
        }catch (Exception e){
            System.out.println("Fayldan o'qishni iloji yo'q");
        }
    }
}
