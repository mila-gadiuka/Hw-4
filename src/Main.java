import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Первая задача");
        Scanner in = new Scanner(System.in);
        System.out.print("Ваш возраст: ");
        int age = in.nextInt();
        if (age>=18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Вторая задача");
        Scanner in = new Scanner(System.in);
        System.out.println("Ваша температура на улице по градусу цельсия: ");
        int degreeCelsius = in.nextInt();
        if (degreeCelsius<5) {
            System.out.println("На улице " + degreeCelsius + "° нужно надеть шапку");
        } else {
            System.out.println("На улице " + degreeCelsius + "° можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Третья задача");
        Scanner in = new Scanner(System.in);
        System.out.println("С какой скоростью вы ездите на авто: ");
        int vehicleSpeed = in.nextInt();
        if (vehicleSpeed>60) {
            System.out.println("Если скорость " + vehicleSpeed + "км/ч, то скорость превышена и вам придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + vehicleSpeed + "км/ч, то превышения скорости нет и можете ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Четвертая задача");
        Scanner in = new Scanner(System.in);
        System.out.println("Ваш возраст: ");
        int age = in.nextInt();
        if (age>=2 && age<=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский садик");
        } else if (age>=7 && age<=18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age>18 && age<=24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else if (age>24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Пятая задача");
        Scanner in = new Scanner(System.in);
        System.out.println("Возраст ребенка: ");
        int ageOfChild = in.nextInt();
        if (ageOfChild<5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему еще нельзя кататься на аттракционах");
        } else if (ageOfChild>=5 && ageOfChild<14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционах, но только в сопровождении взрослых");
        } else if (ageOfChild>=14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционах без сопровождения взрослых");
        }
    }
    public static void task6 () {
        System.out.println("Шестая задача");
        Scanner in = new Scanner(System.in);
        System.out.println("Количество пассажиров в вагоне: ");
        int theNumberOfPassengersInTheWagon = in.nextInt();
        int capacityPerWagon = 102;
        int numberOfSeatingPlaces = 60;
        if (theNumberOfPassengersInTheWagon<numberOfSeatingPlaces) {
            System.out.println("Если в вагоне " + theNumberOfPassengersInTheWagon + " пассажиров, то вы можете занять свободное/ые сидящее/ие место/а");
        } else
        if (theNumberOfPassengersInTheWagon>=numberOfSeatingPlaces && theNumberOfPassengersInTheWagon<capacityPerWagon) {
            System.out.println("Если в вагоне " + theNumberOfPassengersInTheWagon + " пассажиров, то вы можете занять свободное/ые стощее/ие место/а");
        } else {
            System.out.println("Если в вагоне " + theNumberOfPassengersInTheWagon + " пассажиров, то увы свободных мест нет, ждите новый вагон");
        }
    }
    public static void task7 () {
        System.out.println("Седьмая задача");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int one = in.nextInt();
        System.out.println("Введите второе число: ");
        int two = in.nextInt();
        System.out.println("Введите третье число: ");
        int free = in.nextInt();
        if (one>two && one>free) {
            System.out.println("БОльшее число из приведенных равно " + one);
        } else if (two>one && two>free) {
            System.out.println("БОльшее число из приведенных равно " + two);
        } else {
            System.out.println("БОльшее число из приведенных равно " + free);
        }
    }
}