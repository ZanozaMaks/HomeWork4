
    public class Main {
        public static void main(String[] args) {
            task1();
            task2();
            task3();
        }

        public static void task1 () {
            System.out.println("Задача 1");
            int Age = 16 , Age2 = 27;
            if (Age >= 18) {
                System.out.println("Если возраст человека равен " +Age+ ", то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " +Age+ ", то он не достиг совершеннолетия, нужно немного подождать");
            }

            if (Age2 >= 18) {
                System.out.println("Если возраст человека равен " +Age2+ ", то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " +Age2+ ", то он не достиг совершеннолетия, нужно немного подождать");
            }

         // Пишем код для задачи 1
        }

        public static void task2 () {
            System.out.println("Задача 2");
            int Temperature = 11, Temperature2 = 2;

            if (Temperature >= 5) {
                System.out.println("На улице " +Temperature+ " градусов можно идти без шапки");
            }

            if (Temperature2 <= 5) {
                System.out.println("На улице " +Temperature2+ " градуса нужно надеть шапку");
            }
         // Пишем код для задачи 2
        }

        public static void task3 () {
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
            // Пишем код для задачи 3

    }

