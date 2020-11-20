package school;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> teachers = new ArrayList<>();
        teachers.add(10);
        teachers.add(7);
        teachers.add(4);
        teachers.add(5);
//        System.out.println(teachers);
        HashSet<Integer> set = new HashSet<>();


        int value;
        for (Integer integer : teachers) {
            System.out.println(integer);
             value = scanner.nextInt();
            if (value == 1) {
                set.add(integer);
                System.out.println(set);
            }
        }
    }
}
