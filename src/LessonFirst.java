public class LessonFirst {

    public static void main(String[] args){

        System.out.println(f( 1,2,3,4)); // Задание 1.

        System.out.println(f2(5,3));          // Задание 2.
        System.out.println(f2(6,5));
        System.out.println(f2(10,10));
        System.out.println(f2(1,20));

        System.out.println(positiveNumber(6));   // Задание 3.
        System.out.println(positiveNumber(-6));

        whatIsNumber(-11);
        whatIsNumber(0);

        hello("Саша");          // Задание 4.
        hello("Павел");
        hello("Коля");

        isLeapYear(2001);          // Задание 5 *
        isLeapYear(1875);
        isLeapYear(1600);
        isLeapYear(1900);
        isLeapYear(1960);
    }

    /*
    1) Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий
    результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;
 */
    public static float f(float a, float b, float c, float d){
        return (a * (b + (c / d)));
    }


    /*
    2) Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в
    пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
     */
    public static boolean f2(int a, int b){
        int sum = a+b;
        return 10 < sum && sum <= 20;
    }

    /*
3) Написать метод, которому в качестве параметра
передается целое число, метод должен проверить положительное ли число
передали, или отрицательное. Замечание: ноль считаем положительным числом.
 */
    public static boolean positiveNumber(int x) {
        return (x >= 0);
    }
    public static void whatIsNumber(int x) {
        if (x >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }


    /*
    4) Написать метод, которому в качестве параметра передается строка, обозначающая
    имя, метод должен вернуть приветственное сообщение «Привет, переданное_имя!»
     */
    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }


    /*
    5)*Написать метод, который определяет является ли год високосным. Каждый 4-й год является
    високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static void isLeapYear(int i) {
        if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }
}
