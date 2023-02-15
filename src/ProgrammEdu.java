import java.util.Scanner;

public class ProgrammEdu {

    public static void main(String args[]) {


         System.out.println(TranslationFromBinary.calcbinary(111000)); ///1. Необходимо перевести двоичное число в десятеричную систему.

        NumberComparison.calcequals(5, 89); ///2.Напишите программу на Java для сравнения двух чисел.

        ListDivision.calclist(); // 3.Выведите три списка,  числа от 1 до 100, которые делятся на3,  5 и оба

        ArithmeticProgression.calcprogression(15, 63, 0);   //4. Напишите программу, которая считает Возрастающую! арифметическую прогрессию a - число начала, b - число окончания, с -  коэффициент (с>0)

        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше Имя: "); // Реализовать программу, которая считает индекс массы тела.
        String name = in.nextLine();
        System.out.print("Введите Ваш рост (в см): ");
        float height = in.nextFloat();
        System.out.print("Введите Ваш вес (в кг): ");
        float weight = in.nextFloat();

        double imt = Сalculator.culc(height, weight);

        System.out.printf("Ваше Имя: %s ; Ваш рост (в см): %.2f ; Ваш вес (в кг): %.2f .\n", name, height, weight);
        System.out.printf("Индекс массы тела %s  -  %.3f .\n", name, imt);
        in.close();

    }
}
