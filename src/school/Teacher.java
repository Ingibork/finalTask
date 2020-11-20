package school;

import java.util.Random;

public class Teacher {

    String initialTeacher;
    String since;
    String category;
    int diplom;
    int factorStady;
    boolean potentialT;
    int costDays;

    public Teacher(String initialTeacher, String since, String category, int diplom, int factorStady, boolean potentialT, int costDays) {
        this.initialTeacher = initialTeacher;
        this.since = since;
        this.category = category;
        this.diplom = diplom;
        this.factorStady = factorStady;
        this.potentialT = potentialT;
        this.costDays = costDays;
    }

    @Override
    public String
    toString() {
        return "Teacher{" +
                "initialTeacher='" + initialTeacher + '\'' +
                ", since='" + since + '\'' +
                ", category='" + category + '\'' +
                ", diplom=" + diplom +
                ", factorStady=" + factorStady +
                ", potentialT=" + potentialT +
                ", costDays=" + costDays +
                '}';
    }

    static String initialTeacher() {
        String[] name = {"Алексеева Мария Мироновна", "Кац Юлия Фёдоровна", "Литвинова Алла Борисовна",
                "Пархоменко Юлия Петровна", "Черепко Генадий Викторович", "Чижик Иван Иванович",
                "Василенко Ирина Васильевна", "Гацко Алла Валерьевна", "Кед Лидия Ивановна",
                "Матвиенко Сергей Леонидович", "Карп Генадий Серьгеевич", "Галкин Сергей Яковлевич", "Воробьёв Павел Вениаминович",
                "Котов Корней Романович", "Фадеев Степан Авдеевич", "Мельников Феликс Дмитриевич",
                "Николаев Леонид Владимирович", "Соболев Дональд Геннадьевич",
                "Дмитриев Роберт Антонович", "Сазонов Болеслав Натанович",
                "Голубев Лаврентий Антонович", "Цветков Климент Онисимович",
                "Крюков Максимилиан Еремеевич", "Зыков Михаил Вадимович",
                "Щукин Наум Геннадиевич", "Капустин Терентий Филиппович", "Денисова Римма Геннадиевна",
                "Михеева Версавия Максимовна", "Логинова Томила Валентиновна",
                "Цветкова Инара Арсеньевна", "Андреева Мелитта Богуславовна",
                "Боброва Сима Дмитрьевна", "Мартынова Полина Созоновна",
                "Шестакова Номи Кимовна", "Некрасова Альберта Валерьяновна",
                "Филатова Ангелина Станиславовна", "Горшкова Сима Тимофеевна",
                "Калашникова Иветта Якуновна", "Лукина Амелия Федоровна",
                "Кузьмина Джема Протасьевна"};
        Random random = new Random();
        int a = random.nextInt(name.length);
        return name[a];
    }

    static String since() {
        String[] since = {"Математика", "Русский язык", "Русская Литература", "Беларуский язык", "Бел. Литература", "Физическая культура",
                "Английский язык", "Химия", "Физика", "Труды", "Информатика"};
        Random random = new Random();
        int a = random.nextInt(since.length);
        return since[a];
    }

    static String category() {
        String[] category = {"Начинающий специалист",
                "Преподаватель 1-ой категории",
                "Преподаватель 2-ой категории",
                "Преподаватель высшей категории"};
        Random random = new Random();
        int a = random.nextInt(category.length);
        return category[a];
    }

    static int diplom() {
        int[] diplom = {4, 5, 6, 7, 8, 9, 10};
        Random random = new Random();
        int b = random.nextInt(diplom.length);
        return diplom[b];
    }

    static int factorStady() {
        int[] factorStady = {3, 4, 5, 6, 7, 8, 9, 10};
        Random random = new Random();
        int b = random.nextInt(factorStady.length);
        return factorStady[b];
    }

    static boolean potentialT() {
        Random random = new Random();
        boolean b = random.nextBoolean();
        return b;
    }

    static int costDays() {
        int[] costDays = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random random = new Random();
        int b = random.nextInt(costDays.length);
        return costDays[b];
    }
}
