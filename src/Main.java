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

    public static void task1() {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то он он не достиг совершеннолетия, нужно немного подождать");
        }

        // Пишем код для задачи 1
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 11;

        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градуса нужно надеть шапку");
        }
        // Пишем код для задачи 2
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 40;
        if (speed > 60) {

            System.out.println("Если скорость " + speed + ",придется заплатить штраф");
        } else
            System.out.println("Если скорость " + speed + ",можно ездить спокойно");
    }


    public static void task4() {
        System.out.println("Задача 4");
        int michaelAge = 21;

        if (michaelAge <= 2) {
            System.out.println("Если возраст человека равен " + michaelAge + ", то ему пора спать.");
        }
        if (michaelAge >= 2 && michaelAge <= 6) {
            System.out.println("Если  возраст человека равен " + michaelAge + " ,то ему нужно ходить в детский сад");
        }
        if (michaelAge >= 7 && michaelAge <= 18) {
            System.out.println("Если возраст человека равен " + michaelAge + ", то ему нужно ходить в школу.");
        }
        if (michaelAge > 18 || michaelAge < 24) {
            System.out.println("Если возраст человека равен " + michaelAge + ", то его место в университете.");
        }
        if (michaelAge > 24) {
            System.out.println("Если возраст человека равен " + michaelAge + ", то ему пора ходить на работу.");
        }
        if (michaelAge > 60) {
            System.out.println("Если возраст человека равен " + michaelAge + ", то он может отдохнуть.");
        }
        // Пишем код для задачи 4
    }

    public static void task5() {
        System.out.println("Задача 5");
        int childrenAge = 7;
        if (childrenAge < 5) {
            System.out.println("Если возраст ребенка равен " + childrenAge + " ,то ему нельзя кататься на аттракционе");
        }
        if (childrenAge >= 5) {
            System.out.println("Если возраст ребенка равен " + childrenAge + " ,то ему можно кататься на аттракционе в сопровождении");
        }
        if (childrenAge > 14) {
            System.out.println("Если возраст ребенка равен " + childrenAge + " ,то ему можно кататься на аттракционе без сопровождения взрослого");

        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int seatPlace = 60;
        int standingPlaces = 42;
        int passengersSeats = 31;
        int passengersStanding = 18;
        int freeSeatingPlace = seatPlace - passengersSeats;
        int freeStandingPlaces = standingPlaces - passengersStanding;

        if (freeStandingPlaces >= 1 || freeStandingPlaces <= freeStandingPlaces && freeSeatingPlace >= 1 || freeSeatingPlace <= freeSeatingPlace) {
            System.out.println("Стоячих мест осталось " + freeStandingPlaces+ ",сидячих мест осталось " +freeSeatingPlace);
        } else {
            System.out.println("Вагон забит");

        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one >= two && one >= three && one >= one) {
            System.out.println("Наибольшее число = " + one);
        } else {
            if (two >= one && two >= three && two >= two) {
                System.out.println("Наибольшее число = " + two);
            } else {
                if (three >= one && three >= two && three >= three) {
                    System.out.println("Наибольшее число = " + three);
                }
            }
        }
        }
    }









