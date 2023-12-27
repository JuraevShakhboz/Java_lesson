package MohirDev.Java_Core;

import java.util.ArrayList;

public class Topshiriq4 {
    public static void main(String[] args) {
        int[] array = {100, 50, 75, 200, 150, 50, 100};
        ArrayList<Integer> st = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            for (int j = i+1; j < array.length; j++) {
                if(a == array[j]){
                    st.add(a);
                }
            }
        }

        System.out.println(st.toString());
    }
}
