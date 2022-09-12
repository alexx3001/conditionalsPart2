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
        if (year % 4 != 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
                System.out.println(year + " год является високосным");
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
        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }



    }
}