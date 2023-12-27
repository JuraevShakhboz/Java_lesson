package Uchinchi_Oy.dars_41;

import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        int i = 0;
        while((i = in.read())!=-1){
            System.out.print((char) i);
        }

        in.close();
    }
}
