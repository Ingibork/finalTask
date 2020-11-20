package school;

import java.util.Random;

public class Student {

    String randomName ;
    String randomClasses;
    int averageScore1 = 0; //Средний балл по поведению
    int averageScore2 = 0; //Средний балл по успеваемости
    boolean late; //Склонность к опозданиям
    int iq = 50;
    boolean potencial;
    int budgetDay;

    public String getRandomClasses() {
        return randomClasses;
    }

    public void setRandomClasses(String randomClasses) {
        this.randomClasses = randomClasses;
    }

    public int getAverageScore1() {
        return averageScore1;
    }

    public void setAverageScore1(int averageScore1) {
        this.averageScore1 = averageScore1;
    }

    public int getAverageScore2() {
        return averageScore2;
    }

    public void setAverageScore2(int averageScore2) {
        this.averageScore2 = averageScore2;
    }

    public boolean isLate() {
        return late;
    }

    public void setLate(boolean late) {
        this.late = late;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public boolean isPotencial() {
        return potencial;
    }

    public void setPotencial(boolean potencial) {
        this.potencial = potencial;
    }

    public int getBudgetDay() {
        return budgetDay;
    }

    public void setBudgetDay(int budgetDay) {
        this.budgetDay = budgetDay;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public int getFamalyBudget() {
        return famalyBudget;
    }

    public void setFamalyBudget(int famalyBudget) {
        this.famalyBudget = famalyBudget;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    String mother;
    String father;
    int famalyBudget=10; //Семейный бюджет
    int profit; // Прирост бюджета в день

//    public Student(String randomName, String randomClasses, int averageScore1, int averageScore2, boolean late, int iq, boolean potencial, int budgetDay) {
//        this.randomName = randomName;
//        this.randomClasses = randomClasses;
//        this.averageScore1 = averageScore1;
//        this.averageScore2 = averageScore2;
//        this.late = late;
//        this.iq = iq;
//        this.potencial = potencial;
//        this.budgetDay = budgetDay;
//    }

    public Student(String randomName, String randomClasses, int averageScore1, int averageScore2, boolean late, int iq, boolean potencial, int budgetDay, String mother, String father, int famalyBudget, int profit) {
        this.randomName = randomName;
        this.randomClasses = randomClasses;
        this.averageScore1 = averageScore1;
        this.averageScore2 = averageScore2;
        this.late = late;
        this.iq = iq;
        this.potencial = potencial;
        this.budgetDay = budgetDay;
        this.mother = mother;
        this.father = father;
        this.famalyBudget = famalyBudget;
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Student{" +
                "randomName='" + randomName + '\'' +
                ", randomClasses='" + randomClasses + '\'' +
                ", averageScore1=" + averageScore1 +
                ", averageScore2=" + averageScore2 +
                ", late=" + late +
                ", iq=" + iq +
                ", potencial=" + potencial +
                ", budgetDay=" + budgetDay +
                '}';
    }

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


    static String mother() {
        String[] mother = {"Ирина Олеговна Тихонова", "Мария Викторовна Кац", "Светлана Сергеевна Гацко", "Александрина Вячеславовна Липко",
                "Ксения Борисовна Грибоедова"};
        Random random = new Random();
        int b = random.nextInt(mother.length);
        return mother[b];
    }

    static String father() {
        String[] father = {"Олег Витальевич Махно", "Глеб Сидорович Манько",
                "Иван Дьяков Вадютин", "Евгений Яковлевич Жук", "Вадим Юрьевич Антонов"};
        Random random = new Random();
        int b = random.nextInt(father.length);
        return father[b];
    }

    static int famalyBudget() {
        Random random = new Random();
        int b = random.nextInt(150);
        return b;
    }

    static int profit() {
        Random random = new Random();
        int b = random.nextInt(25);
        return b;
    }




}
