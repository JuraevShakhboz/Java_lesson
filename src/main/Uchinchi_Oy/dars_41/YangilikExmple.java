package Uchinchi_Oy.dars_41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class YangilikExmple {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("sarlovha.txt");
        FileInputStream f2 = new FileInputStream("yangilik.txt");
        ArrayList<String> list = new ArrayList<>();
        String s = new String();

        int i = 0;
        int j = 0;
        while ((i = f1.read())!=-1){
                s += (char) i;
        }

        System.out.println(s);

    }
}
