public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("");
        System.out.println("Задание 2");
        int yearOS = 2012;
        if (clientOS == 0) {
            if (yearOS < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (yearOS < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        System.out.println("");
        System.out.println("Задание 3");
        int year = 2022;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
                System.out.println(year + " год не является високосным");
        }

        System.out.println("");
        System.out.println("Задание 4");
        int deliveryDistance = 30;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else {
            int time = 2 + (deliveryDistance - 20) / 40;
            System.out.println("Потребуется дней: " + time);
        }

        System.out.println("");
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
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
                System.out.println("Сентябрь");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }



    }
}