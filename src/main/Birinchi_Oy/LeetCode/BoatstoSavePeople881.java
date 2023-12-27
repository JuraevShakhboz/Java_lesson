package Birinchi_Oy.LeetCode;

import java.util.Arrays;

public class BoatstoSavePeople881 {
    public int numRescueBoats(int[] people, int limit) {
        int ans = 0;

        Arrays.sort(people);

        for (int i = 0, j = people.length - 1; i <= j; ++ans) {
            int qol = limit - people[j--];
            if (people[i] <= qol){
                ++i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        int limit = 3;

        BoatstoSavePeople881 ob = new BoatstoSavePeople881();

        System.out.println(ob.numRescueBoats(people, limit));
    }
}
