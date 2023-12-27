package Uchinchi_Oy.dars_42;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) throws FileNotFoundException {
        String x = "dars43";

        try(FileInputStream file = new FileInputStream("files/"+x+".txt")){
            String s = new String(file.readAllBytes());
            System.out.println(s);
        }catch (IOException e){
            System.out.println("Bunday file topilmadi !");
        }
        catch (Exception e){
            System.out.println("Filedan o'qishni imkoni bo'lmadi !");
        }
    }
}
