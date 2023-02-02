package Homework;

public class Variables {

    public static void main(String[] args) {

        //Создайте переменную с именем flowersName и присвойте ей значение Roses.
        String flowersName = "Roses";

        //Создайте переменную с именем flowersNumber и присвойте ей значение 101.
        int flowersNumber=101;

        //Выведите значения переменных flowersName и flowersNumber в консоль.
        System.out.println(flowersName);
        System.out.println(flowersNumber);


        //Выведите на экран сумму 15 + 10, используя две переменные: a и b.
        int a=15;
        int b=10;
        System.out.println("Sum = "+ (a+b));


        //Создайте переменную c, присвойте ей a + b и выведите результат.
        int c=a+b;
        System.out.println(c);


        //Создайте три переменные одного типа, используя список, разделенный запятыми,
        // и присвойте им разными значения. Выведите сумму трех переменных в консоль.
        double x=12.34, y=34.12, z=35.13;
        System.out.println("Sum = "+ (x+y+z));


        //Создайте четыре переменных одного типа, используя список, разделенный запятыми, и присвойте им одно значение.
        // Выведите сумму четырех переменных в консоль.
        short j=15, k=25, l=30, m=33;
        System.out.println("Sum = " +(j+k+l+m));


        //Объявите переменную типа double, но не инициализируйте ее.
        double q;
        //Присвойте ей значение позже.
        q=33.3;
        // Перезапишите существующее значение переменной.
        q=56.76;


        //Создайте константы со значениями числа PI,
        final double PI = 3.14;
        //ускорения свободного падения,
        final double g = 9.80665;
        //наименования родного города.
        final String birth_city = "Petropavlovsk";

        //Создайте переменные типа byte, short, int, long, double, float, boolean, char, String,
        // и выведите каждое значение в консоль.
        byte by = 14;
        System.out.println(by);
        short sh = 15;
        System.out.println(sh);
        int in = 176;
        System.out.println(in);
        long lo = 23213;
        System.out.println(lo);
        double dou = 89.345d;
        System.out.println(dou);
        float flo = 8.53f;
        System.out.println(flo);
        boolean boo = false;
        System.out.println(boo);
        char ch = 'B';
        System.out.println(ch);
        String str = "Good sentence";
        System.out.println(str);



        //Приведите пример расширяющего приведения
        int var2 = 3434324;
        long var3 = var2;

        System.out.println(var3);

        double var4 = 111999.9000;
        int var5 = (int)var4;

        System.out.println(var5);

        //Приведите пример сужающего приведения
        double var6 = 2.78339999;
        float var7 = (float) var6;

        System.out.println(var7);















    }
}
