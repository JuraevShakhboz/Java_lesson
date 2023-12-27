package MohirDev.ArrayList;

import java.util.ArrayList;

public class Topshiriq4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Green");
        list1.add("Red");
        list1.add("Yellow");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Green");
        list2.add("Black");
        list2.add("Yellow");

        ArrayList<String> subList = getSubList(list1, list2);

        System.out.println(list1 + " & " + list2 + " -> result: " + subList);
    }

    public static ArrayList<String> getSubList(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) == list2.get(i)){
                result.add("Yes");
            }
            else{
                result.add("No");
            }
        }

        return result;
    }
}
