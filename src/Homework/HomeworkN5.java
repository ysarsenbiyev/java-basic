package Homework;

public class HomeworkN5 {
    public static void main(String[] args) {
//Напишите программу, чтобы проверить значения длины и ширины прямоугольника и определить,
// является ли он квадратным или нет.
        int length = 6;
        int width = 7;

        if (length == width) {

            System.out.println("Прямоугольник квадратный");

        } else {

            System.out.println("Прямоугольник не квадратный");

        }

//Магазин предоставит скидку в 10%, если стоимость купленного товара будет больше 5000.
// Если стоимость товара ниже 5000, то стоимость остается без изменений.
// Вычислите и выведите итоговую стоимость покупки для пользователя.
        double cost = 5500;

        if (cost > 5000) {
            System.out.println("Стоимость купленного товара со скидкой 10% равна " + (cost - cost * 0.1));


        } else {
            System.out.println("Стоимость купленного товара равна " + cost);

        }


//Создайте переменную grade и напечатайте в консоль соответствующую оценку в зависимости от значения переменной
        int grade = 80;

        if (grade < 25) {
            System.out.println("Оценка F");
        } else if (grade <= 45) {
            System.out.println("Оценка E");
        } else if (grade <= 50) {
            System.out.println("Оценка D");
        } else if (grade <= 60) {
            System.out.println("Оценка C");
        } else if (grade <= 80) {
            System.out.println("Оценка B");
        } else {
            System.out.println("Оценка A");

        }

//Дано целое положительное число. Напишите программу, которая выводит это число в обратном порядке.
// Например, если дано число 12345, то вывод будет следующим: 54321.
        int number = 12345, reverse = 0;
        while (number != 0) {

            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;


        }
        System.out.println(reverse);

//Дано целое положительное число. Напишите программу, которая выводит сообщение о том, является ли это число простым.

        int simple = 6;

        for (int i = 2; i < simple; i++) {
            if (simple % i == 0) {
                System.out.println("не простое число");
                break;
            }
            System.out.println("простое число");
            break;

        }


//6. Напишите программу для печати следующего сообщения:

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }


        //7. Даны два целых числа a и b. Напишите программу для вычисления суммы натуральных чисел в диапазоне от a до b.

        int sum = 0;
        for (int i = 1; i < 6; i++) {

            sum += i;
        }
        System.out.println("Сумма элементов от 1 до 5 равна " + sum);
    }


}



    //Необходимо создать переменную со значением зарплаты сотрудника, вывести в консоль результирующую зарплату с премией.











