package school;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        try {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Суть приложения: Создать эффективную школу " + "\n" +
                "в которой требуется добиться максимального количества " + "\n" +
                "учеников, максимального среднего балла по успеваемости " + "\n" +
                "и максимального среднего балла по поведению. После запуска" + "\n" +
                " создаётся школа. Вы в этой школе директор и на старте вы " + "\n" +
                "должны нанять пед. состав с которым вы будете открывать " + "\n" +
                "школу и сформировать классы для учащихся. После открытия " + "\n" +
                "школы у вас будет 1 учебный год за который вы должны " + "\n" +
                "достичь максимальных показателей.");
        System.out.println();
        System.out.print("Выберите уровень сложности: 1 Легко, 2 Средне, 3 Сложно: - ");
        int difficult = scanner.nextInt();



        if (difficult == 1) {
            System.out.println("Легко - выбрано");


//            for (Teacher teacher : Easy()) {
//                System.out.println(" " + teacher.initialTeacher + "\n" + "* Предмет: " + teacher.since + "\n" +
//                        "* Категория: " + teacher.category
//                        + "\n" + "* Оценка: " + teacher.diplom + "\n" + "* Стоимость в сутки: " + teacher.costDays);
//                System.out.println();
//
//            }

            int i;
            int a;
            System.out.println(" ");
            System.out.println("Из списка приведённого ниже, вы можете выбрать лишь 2 учителей");
            System.out.println("(5 для выбора, 2 для пропуска)");
            System.out.println("введи любую цифру чтобы продолжить");
            a = scanner.nextInt();
            Set<Teacher> teacherSet = Easy();
            int t =1;
            for (Teacher teacher : teacherSet) {
                System.out.println(t + ") " + teacher.initialTeacher + "\n" + "* Предмет: " + teacher.since + "\n" +
                        "* Категория: " + teacher.category
                        + "\n" + "* Оценка: " + teacher.diplom + "\n" + "* Стоимость в сутки: " + teacher.costDays);
                t++;
            }

            i = 1;
// Преподы
            Set<Teacher> teamTeachers = sortedd(teacherSet);
            for (Teacher teamTeacher : teamTeachers) {
                System.out.println(i + ") " + teamTeacher.initialTeacher + "\n" + "* Предмет: " + teamTeacher.since + "\n" +
                        "* Категория: " + teamTeacher.category
                        + "\n" + "* Оценка: " + teamTeacher.diplom + "\n" + "* Стоимость в сутки: " + teamTeacher.costDays
                        + "\n" + "* Скрытый потенциал: " + teamTeacher.potentialT);
                System.out.println();
                i++;
            }
            System.out.println();
            System.out.println("Учительский состав сформирован.");
            System.out.println("any key to continue");
            a = scanner.nextInt();


            //Студенты

            i = 1;
            Set<Student> studentSetA = studentGroupClassA();
            Set<Student> studentSetB = studentGroupClassB();
            Set<Student> studentSetV = studentGroupClassV();
            Set<Student> studentSetG = studentGroupClassG();
            System.out.println();
            System.out.println("Классы сформированы.");

            System.out.println("Показать класс 7А нажми - 1, показать класс 7Б нажми - 2, " +
                    "показать класс 7В нажми - 3, показать класс 7Г нажми - 4, пропустить 0");
            int value = scanner.nextInt();
            if (value == 1) {
                for (Student student : studentSetA) {
                    System.out.println(i + ") " + student.randomName + "\n" + "* Класс: " + student.randomClasses + "\n" +
                            "* Поведение: " + student.averageScore1 + "\n" + "* Успеваемость: " + student.averageScore2 + "\n" +
                            "* Склонность к опозданиям: " + student.late + "\n" + "* Базоый IQ: " + student.iq
                            + "\n" + "* Потенциал: " + student.potencial + "\n" + "* Сумма дохода в сутки: " + student.budgetDay);
                    System.out.println();
                    i++;
                }
                System.out.println("Хотите просмотреть подробнее какого либо ученика?");
                System.out.print("5 enter, 2 next: ");
                a = scanner.nextInt();
                if (a == 5) {
                    sortedStudent(studentSetA);
                    System.out.println(sortedStudent(studentSetA));
                }
            }
            if (value == 2) {
                for (Student student : studentSetB) {
                    System.out.println(i + ") " + student.randomName + "\n" + "* Класс: " + student.randomClasses + "\n" +
                            "* Поведение: " + student.averageScore1 + "\n" + "* Успеваемость: " + student.averageScore2 + "\n" +
                            "* Склонность к опозданиям: " + student.late + "\n" + "* Базоый IQ: " + student.iq
                            + "\n" + "* Потенциал: " + student.potencial + "\n" + "* Сумма дохода в сутки: " + student.budgetDay);
                    System.out.println();
                    i++;
                }

            }
            if (value == 3) {
                for (Student student : studentSetV) {
                    System.out.println(i + ") " + student.randomName + "\n" + "* Класс: " + student.randomClasses + "\n" +
                            "* Поведение: " + student.averageScore1 + "\n" + "* Успеваемость: " + student.averageScore2 + "\n" +
                            "* Склонность к опозданиям: " + student.late + "\n" + "* Базоый IQ: " + student.iq
                            + "\n" + "* Потенциал: " + student.potencial + "\n" + "* Сумма дохода в сутки: " + student.budgetDay);
                    System.out.println();
                    i++;
                }
            }
            if (value == 4) {
                for (Student student : studentSetG) {
                    System.out.println(i + ") " + student.randomName + "\n" + "* Класс: " + student.randomClasses + "\n" +
                            "* Поведение: " + student.averageScore1 + "\n" + "* Успеваемость: " + student.averageScore2 + "\n" +
                            "* Склонность к опозданиям: " + student.late + "\n" + "* Базоый IQ: " + student.iq
                            + "\n" + "* Потенциал: " + student.potencial + "\n" + "* Сумма дохода в сутки: " + student.budgetDay);
                    System.out.println();
                    i++;
                }
            }
// --------->>>> Заглушка
            System.out.println("any key to continue");
            a = scanner.nextInt();
// ------------------->>>>> СТАРТ ГОДА
            System.out.println("Учебный год начался");
            System.out.println();
            Set<Student> students100 = allStudents(studentSetA,studentSetB, studentSetV,
                    studentSetG);
            workDay(teamTeachers, students100);
            System.out.println();
            randomSituation(students100);






        }
        if (difficult == 2) {
            System.out.println("Средне - выбрано");
        }
        if (difficult == 3) {
            System.out.println("Сложно - выбрано");
        }

        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
        }




    }

    public static Set<Teacher> Easy() {
        Set<Teacher> streamTeacher = Stream.generate(() -> new Teacher(Teacher.initialTeacher(),
                Teacher.since(), Teacher.category(),
                Teacher.diplom(), Teacher.factorStady(),
                Teacher.potentialT(), Teacher.costDays()))
        .limit(5)
        .collect(Collectors.toSet());
        System.out.println();

//        Set<Teacher> teacherSet = new HashSet<>();
//        for (int i = 0; i < 5; i++) {
//            Teacher teacher = new Teacher(Teacher.initialTeacher(),
//                    Teacher.since(), Teacher.category(),
//                    Teacher.diplom(), Teacher.factorStady(),
//                    Teacher.potentialT(), Teacher.costDays());
////            if (teacher.since.equals("Математика"))
//            teacherSet.add(teacher);
//
//        }
        return streamTeacher;

    }

    public static Set<Teacher> sortedd(Set<Teacher> teacherSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Teacher> teachers = new HashSet<>(teacherSet);
        Set<Teacher> teamTeachers = new HashSet<>();
        int value;
        int i = 1;
        System.out.println();
        System.out.println("any key to continue");
        int a = scanner.nextInt();
// Учителя
        for (Teacher teacher : teachers) {
            System.out.println(i + ") " + teacher.initialTeacher + "\n" + "* Предмет: " + teacher.since + "\n" +
                    "* Категория: " + teacher.category + "\n" + "* Оценка: " +
                    teacher.diplom + "\n" + "* Стоимость в сутки: " + teacher.costDays);
            System.out.println();
            i++;
            System.out.print("5 выбрать, 2 пропуск: ");
            value = scanner.nextInt();
            if (value == 5) {
                teamTeachers.add(teacher);
                System.out.println();
            }
            if (teamTeachers.size() == 2) {
                System.out.println("_________________________________");
                System.out.println();
                return teamTeachers;
            }
        }
//        if (teamTeachers.size() != 2){
//            sortedd(teacherSet);
//        }
        return teamTeachers;
    }

    /*
    КЛАССЫ
     */
    public static Set<Student> studentGroupClassA() {
//        Set<Student> streamStudent = Stream.generate(() -> new Student((Student.randomName()), Student.randomClasses(),
//                Student.averageScore1(), Student.averageScore2(), Student.late(), Student.iq(),
//                Student.potencial(), Student.budgetDay(), Student.mother(), Student.father(), Student.famalyBudget(),
//                Student.profit()))
//                .limit(1000)
//                .filter(student -> student.equals("7А"))
//                .limit(25)
//                .collect(Collectors.toSet());
//        for (Student stu : streamStudent) {
//            System.out.println(stu);
//        }
//        }
        Set<Student> students = new HashSet<>(5);
        for (int i = 0; i < 1000; i++) {
            Student stu = new Student((Student.randomName()), Student.randomClasses(),
                    Student.averageScore1(), Student.averageScore2(), Student.late(), Student.iq(),
                    Student.potencial(), Student.budgetDay(), Student.mother(), Student.father(), Student.famalyBudget(),
                    Student.profit());
            if (stu.randomClasses.equals("7А") && students.size() < 25) {
                students.add(stu);
            }
        }
        return students;
    }

    public static Set<Student> studentGroupClassB() {
        Set<Student> students = new HashSet<>(5);
        for (int i = 0; i < 1000; i++) {
            Student stu = new Student((Student.randomName()), Student.randomClasses(),
                    Student.averageScore1(), Student.averageScore2(), Student.late(), Student.iq(),
                    Student.potencial(), Student.budgetDay(), Student.mother(), Student.father(), Student.famalyBudget(),
                    Student.profit());
            if (stu.randomClasses.equals("7Б") && students.size() < 25) {
                students.add(stu);
            }
        }
        return students;
    }

    public static Set<Student> studentGroupClassV() {
        Set<Student> students = new HashSet<>(5);
        for (int i = 0; i < 1000; i++) {
            Student stu = new Student((Student.randomName()), Student.randomClasses(),
                    Student.averageScore1(), Student.averageScore2(), Student.late(), Student.iq(),
                    Student.potencial(), Student.budgetDay(), Student.mother(), Student.father(), Student.famalyBudget(),
                    Student.profit());
            if (stu.randomClasses.equals("7В") && students.size() < 25) {
                students.add(stu);
            }
        }
        return students;
    }

    public static Set<Student> studentGroupClassG() {
        Set<Student> students = new HashSet<>(5);
        for (int i = 0; i < 1000; i++) {
            Student stu = new Student((Student.randomName()), Student.randomClasses(),
                    Student.averageScore1(), Student.averageScore2(), Student.late(), Student.iq(),
                    Student.potencial(), Student.budgetDay(), Student.mother(), Student.father(), Student.famalyBudget(),
                    Student.profit());
            if (stu.randomClasses.equals("7Г") && students.size() < 25) {
                students.add(stu);
            }
        }
        return students;
    }

//    public static Set<Student> classRoom (Set<Student> studentSet) {
//
//    }

    public static Set<Student> sortedStudent(Set<Student> studentSetA) {
        Scanner scanner = new Scanner(System.in);
        Set<Student> student = new HashSet<>(studentSetA);
        Set<Student> student2 = new HashSet<>();
        int value;
        int i = 1;

        for (Student stu : student) {

            System.out.println(i + ") " + "\n" + "* Мать: " + stu.mother + "\n" +
                    "* Отец: " + stu.father + "\n" + "* Ребёнок: " + stu.randomName + "\n" +
                    "* Семейный бюджет: " + stu.famalyBudget + "\n" + "Прирост бюджета в день" + stu.profit);
            i++;
            System.out.print("5 enter, 2 skip: ");
            value = scanner.nextInt();
            if (value == 5) {

                student2.add(stu);
                System.out.println();
            }

        }
        return student2;
    }

    public static void workDay (Set<Teacher> teamTeacher, Set<Student> students100) {
//        for (int i = 0; i < 165; i++) {
            int day = 1;
            System.out.println(day +" день в Школе");
            System.out.println(teamTeacher.size() + " - количество учителей");
            System.out.println(students100.size() + " - количество учеников");
//        }
    }

    public static Set<Student> allStudents (Set<Student> studentSetA, Set<Student> studentSetB,
                                                Set<Student> studentSetV, Set<Student> studentSetG) {
        Set<Student> students100 = new HashSet<>();
        students100.addAll(studentSetA);
        students100.addAll(studentSetB);
        students100.addAll(studentSetV);
        students100.addAll(studentSetG);
        return students100;
    }

    public static Set<Student> randomSituation (Set<Student> students100) {
        Random random = new Random(10);
        for (Student student : students100) {
            int a = random.nextInt(100);
            if (a < 5) {
                System.out.println("Что-то разбили/сломали/кого-то ударили и прочее на занятии/" +
                        "вне занятия - -1 к баллу по поведению ученика");
//                System.out.println(student.randomName+ "\n"  + "* Класс: " + student.randomClasses + "\n" +
//                        "* Поведение: " + student.averageScore1 + "\n" + "* Успеваемость: " + student.averageScore2);

                int get = student.averageScore1;
                student.setAverageScore1(get - 1);
                System.out.println("Поведение ученика " +  student.randomClasses + " класса " +  student.randomName
                        + " уменьшилось на 1" + "\n" + "* Поведение: " + student.averageScore1 + "\n" + "* Успеваемость: " + student.averageScore2);
            }
        }
        return students100;
    }

//    public static Set<Student> ratingBall (Set<Student> students100) {
//
//    }

}


