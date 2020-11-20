package school;

import java.util.Random;

public class RandomStudents {
    static String randomName () {
        String[] name = {"Иван", "Пётр", "Семён", "Оля", "Юля"};
        Random random = new Random();
        int a = random.nextInt(name.length);
        return name[a];
    }

    static String randomClasses() {
        String[] classes = {"7А", "7Б", "7В", "7Г", "7Д"};
        Random random = new Random();
        int b = random.nextInt(classes.length);
        return classes[b];
    }

    static int averageScore1() {
        int[] averageScore1 = {0,1,2,3,4,5,6,7,8,9,10};
        Random random = new Random();
        int b = random.nextInt(averageScore1.length);
        return averageScore1[b];
    }

    static int averageScore2() {
        int[] averageScore2 = {0,1,2,3,4,5,6,7,8,9,10};
        Random random = new Random();
        int b = random.nextInt(averageScore2.length);
        return averageScore2[b];
    }

    static boolean late() {
        Random random = new Random();
        boolean b = random.nextBoolean();
        return b;
    }

    static int iq() {
        Random random = new Random();
        int b = random.nextInt(150);
        return b;
    }

    static boolean potencial() {
        Random random = new Random();
        boolean b = random.nextBoolean();
        return b;
    }

    static int budgetDay() {
        Random random = new Random();
        int b = random.nextInt(150);
        return b;
    }
}
