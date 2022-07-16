

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
        System.out.println("Задание 6..");

            int age = 19;
            int salary = 58_000;
            if (age < 23) {
                if (salary < 50_000) {
                    System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary *2) + " рублей");
                } else if (salary >= 50000 && salary < 80_000) {
                    System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 *1.2) + " рублей");
                } else {
                    System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 *1.5) + " рублей");
                }
            } else {
                if (salary < 50_000) {
                    System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary *3) + " рублей");
                } else if (salary >= 50000 && salary < 80_000) {
                    System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 *1.2) + " рублей");
                } else {
                    System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 *1.5) + " рублей");
                }
            }

        System.out.println("Задание 7..");

            int age1 = 45;
            int salary1 = 80_000;
            int wantedSum = 330_000;
            double baseBet;                             // базовая ставка
            double maxPayment = salary1 / 2;
            double payment;
            if (salary1 > 80_000) {
                baseBet = 10 - 0.7;                    //Если зарплата больше 80000, базовая ставка -0,7
                if ( age1 < 23){
                    baseBet = baseBet + 1;
                    payment = (wantedSum + (wantedSum * baseBet / 100)) / 12;
                    System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей.");
                    if (maxPayment > payment) {
                        System.out.println("Одобрено");
                    } else {
                        System.out.println("Отказано");
                    }
                } else if (age1 >= 23 && age1 < 30) {
                    baseBet = baseBet + 0.5;
                    payment = (wantedSum + (wantedSum * baseBet / 100)) / 12;
                    System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей.");
                    if (maxPayment > payment) {
                        System.out.println("Одобрено");
                    } else {
                        System.out.println("Отказано");
                    }
                }else {
                    payment = (wantedSum + (wantedSum * baseBet / 100)) / 12;
                    System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей.");
                    if (maxPayment > payment) {
                        System.out.println("Одобрено");
                    } else {
                        System.out.println("Отказано");
                    }
                }
            } else  {
                baseBet = 10;
                if ( age1 < 23){
                    baseBet = baseBet + 1;
                    payment = (wantedSum + (wantedSum * baseBet / 100)) / 12;
                    System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей.");
                    if (maxPayment > payment) {
                        System.out.println("Одобрено");
                    } else {
                        System.out.println("Отказано");
                    }
                } else if (age1 >= 23 && age1 < 30) {
                    baseBet = baseBet + 0.5;
                    payment = (wantedSum + (wantedSum * baseBet / 100)) / 12;
                    System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей.");
                    if (maxPayment > payment) {
                        System.out.println("Одобрено");
                    } else {
                        System.out.println("Отказано");
                    }
                }else {
                    payment = (wantedSum + (wantedSum * baseBet / 100)) / 12;
                    System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей.");
                    if (maxPayment > payment) {
                        System.out.println("Одобрено");
                    } else {
                        System.out.println("Отказано");
                    }
                }

            }


    }
}