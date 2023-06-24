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
        int Age = 16, Age2 = 27;
        if (Age >= 18) {
            System.out.println("Если возраст человека равен " + Age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + Age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        if (Age2 >= 18) {
            System.out.println("Если возраст человека равен " + Age2 + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + Age2 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Пишем код для задачи 1
    }

    public static void task2() {
        System.out.println("Задача 2");
        int Temperature = 11, Temperature2 = 2;

        if (Temperature >= 5) {
            System.out.println("На улице " + Temperature + " градусов можно идти без шапки");
        }

        if (Temperature2 <= 5) {
            System.out.println("На улице " + Temperature2 + " градуса нужно надеть шапку");
        }
        // Пишем код для задачи 2
    }

    public static void task3() {
        System.out.println("Задача 3");
        int Speed = 60, Speed2 = 90;
        if (Speed > 60) ;
        {
            System.out.println("Если скорость " + Speed + ",то можно ездить спокойно");
        }

        if (Speed2 > 60) ;
        {
            System.out.println("Если скорость " + Speed2 + ",придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int MichaelAge = 21;

        if (MichaelAge <= 2) {
            System.out.println("Если возраст человека равен " + MichaelAge + ", то ему пора спать.");
        }
        if (MichaelAge >= 2 && MichaelAge <= 6) {
            System.out.println("Если  возраст человека равен " + MichaelAge + " ,то ему нужно ходить в детский сад");
        }
        if (MichaelAge >= 7 && MichaelAge <= 18) {
            System.out.println("Если возраст человека равен " + MichaelAge + ", то ему нужно ходить в школу.");
        }
        if (MichaelAge > 18 || MichaelAge < 24) {
            System.out.println("Если возраст человека равен " + MichaelAge + ", то его место в университете.");
        }
        if (MichaelAge > 24) {
            System.out.println("Если возраст человека равен " + MichaelAge + ", то ему пора ходить на работу.");
        }
        if (MichaelAge > 60) {
            System.out.println("Если возраст человека равен " + MichaelAge + ", то он может отдохнуть.");
        }
        // Пишем код для задачи 4
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ChildrenAge = 7;
        if (ChildrenAge < 5) {
            System.out.println("Если возраст ребенка равен" + ChildrenAge + " ,то ему нельзя кататься на аттракционе");
        } else
            System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе.");
        if (ChildrenAge >= 5 && ChildrenAge < 14) {
            System.out.println("Если возраст ребенка равен" + ChildrenAge + " ,то ему можно кататься на аттракционе в сопровождении");
        }
        if (ChildrenAge > 14) {
            System.out.println("Если возраст ребенка равен " + ChildrenAge + " ,то ему можно кататься без сопровождения взрослого");
        } else {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.");

        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int RailwayCarriageCapacity = 102;
        int SeatPlace = 60;
        int StandingPlaces = 42;
        int PassengersSeats = 31;
        int PassengersStanding = 18;
        int FreeSeatingPlace = SeatPlace - PassengersSeats;
        int FreeStandingPlaces = StandingPlaces - PassengersStanding;
        int PassengersInTheCar = RailwayCarriageCapacity - FreeStandingPlaces - FreeSeatingPlace;

        if (FreeStandingPlaces >= 1 || FreeStandingPlaces <= FreeStandingPlaces) {
            System.out.println("Стоячих мест осталось " + FreeStandingPlaces);
        }
        if (FreeSeatingPlace >= 1 || FreeSeatingPlace <= FreeSeatingPlace) {
            System.out.println("Сидячих мест осталось " + FreeSeatingPlace);
        }
        if (PassengersInTheCar < RailwayCarriageCapacity) {
            System.out.println("Мест в вагоне осталось: " + PassengersInTheCar);
        } else {
            System.out.println("Вагон забит");

        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one >= three && one > one) {
            System.out.println("Наибольшее число = " + one);
        } else {
            if (two > one && two >= three && two > two) {
                System.out.println("Наибольшее число = " + two);
            } else {
                if (three > one && three > two && three >= three) {
                    System.out.println("Наибольшее число = " + three);
                }
            }
        }
        }
    }









