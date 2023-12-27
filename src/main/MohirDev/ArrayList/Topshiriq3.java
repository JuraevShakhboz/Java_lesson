package MohirDev.ArrayList;

import java.util.ArrayList;

public class Topshiriq3 {
    public static void main(String[] args) {
        ArrayList<String> sozlar = new ArrayList<>();
        sozlar.add("apple");
        sozlar.add("banana");
        sozlar.add("cherry");
        sozlar.add("date");
        sozlar.add("fig");
        sozlar.add("day");

        // Berilgan chegaralarga qarab ArrayListni kesib olish
        ArrayList<String> subList = getSubList(sozlar, 3, 5);

        // Natijani chiqarish
        for (String word : subList) {
            System.out.println(word);
        }
    }

    public static ArrayList<String> getSubList(ArrayList<String> list, int firstIndex, int lastIndex) {
        if (firstIndex < 0 || lastIndex >= list.size() || firstIndex > lastIndex) {
            throw new IllegalArgumentException("Not'g'ri indeks");
        }

        return new ArrayList<>(list.subList(firstIndex-1, lastIndex));
    }
}