package Homework;

public class Operators {
    public static void main(String[] args) {

        //Напишите программу для умножения 10 на 5 и вывода результата в консоль.

        int a = 10, b = 5;
        int c = a * b;
        System.out.println(c);

        //Напишите программу для деления 20 на 2.5 и вывода результата в консоль.

        int e = 20;
        float f = 2.5f;
        float g = e / f;
        int h = e / (int) f;
        float i = e % f;
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        //Длина и ширина прямоугольника равны 15 и 9 соответственно. Напишите программу
        //для вычисления площади и периметра прямоугольника.

        int length = 15, width = 9;
        int area = length * width;
        System.out.println(area);
        int perimeter = (length + width) * 2;
        System.out.println(perimeter);

        //Используйте правильный оператор, чтобы увеличить значение переменной x на 1 с помощью
        // префиксной и постфиксной форм. Выведите на экран результат.

        int x = 5;

        System.out.println(x++); //вывод на экран переменной x = 5

        System.out.println(x--); //результат предыдущего вывода на экран постфиксной формы увеличения на 1 переменной х,
        //вывод на экран 6

        System.out.println(--x); //результат предыдущего вывода на экран постфиксной формы уменьшения на 1 переменной х, а также
        //уменьшение на 1 префискной формы переменной х до следующего выводы на экран, вывод на экран 4

        System.out.println(++x); //результат увеличение на 1 префискной формы переменной х до следующего выводы на экран, вывод на экран 5


        //Используйте оператор присваивания сложения, чтобы добавить значение 5 к переменной x.
        int z = +5;
        System.out.println(z);


        //Напишите программу для проверки равенства двух чисел 25 и 43

        int q = 25, r = 43;
        System.out.println("25==43: " + (25 == 43));


        //Даны две переменные a и b, значения которых равны 10 и 5 соответственно. Напишите программу для сложения,
        // вычитания, умножения, деления, деления по модулю двух переменных.

        int s = 10, t = 5;
        System.out.println("10 + 5 = " + (s + t));
        System.out.println("10 - 5 = " + (s - t));
        System.out.println("10 * 5 = " + (s * t));
        System.out.println("10 / 5 = " + (s / t));
        System.out.println("10 % 5 = " + (s % t));


        //Напишите программу для преобразования градусов Фаренгейта в градусы Цельсия.

        int F = 100;
        System.out.println(F + " градусов Фаренгейта равно " + (F - 32) * (5d / 9d) + " в градусах Цельсия");


        //Напишите программу, которая прибавляет 10 к числу 451, а затем делит его на 3.
        // Теперь к модулю результата прибавляется 5, а затем полученное значение умножается на 5.
        // Выведите на экран окончательный результат.

        System.out.println((((10 + 451) % 3) + 5) * 5);


        //Даны две переменные a и b, значения которых равны 65 и 80 соответственно.
        // Напишите программу, чтобы проверить, верны ли оба условия 'a < 50' и 'a < b'.

        int u = 65, v = 80;

        System.out.println(u < 50 && u < v);


    }
}
