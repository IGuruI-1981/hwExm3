

public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello SkyPRO!");
        System.out.println("Задание 1..");

            int clientOS = 1;                  // Выбор ОС: 0- iOS, 1- Android
            if ( clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        System.out.println("Задание 2..");

            int clientDeviceYear = 2007;
            if ( clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        System.out.println("Задание 3..");

            int Year = 1981;
            int yearOnFour = Year % 4;                            //остаток от деления года на 4
            int yearOnHundred = Year % 100;                       //остаток от деления года на 100
            int yearOnFourHundred = Year % 400;                   //остаток от деления года на 400
            if ( yearOnFour == 0 && yearOnHundred != 0) {
                System.out.println("Год " + Year + " високосный");
            } else if (yearOnFour == 0 && yearOnHundred == 0 && yearOnFourHundred == 0 ) {
                System.out.println("Год " + Year + " високосный");
            } else {
                System.out.println("Год " + Year + " не високосный");
            }

        System.out.println("Задание 4..");

            int deliveryDistance = 95;
            int deliveryDay = 1;
            if (deliveryDistance < 20) {
                System.out.println("Потребуется дней: " + deliveryDay);
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней: " + (deliveryDay + 1));
            } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("Потребуется дней: " + (deliveryDay + 2));
            } else {
                System.out.println("Потребуется дней: " + (deliveryDay + 3));
            }

        System.out.println("Задание 5..");

            int monthNumber = 12;
            switch (monthNumber){
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Такого месяца не существует");

            }


    }
}