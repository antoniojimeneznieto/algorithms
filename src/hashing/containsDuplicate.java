package hashing;

import Linkedlist.reverseList;

import java.util.HashSet;

public class containsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(containsDuplicate(nums));

    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n: nums) {
            if (set.contains(n)) return true;
            set.add(n);
        }

        return false;
    }
}
