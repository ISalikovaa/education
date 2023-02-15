public class ArithmeticProgression {

    public static void calcprogression(int a, int b, int c) {

        if (c == 0) {
            System.out.println("\n Коэффициент равен нулю!!! Введите значение коэффициента больше нуля!");
        }

        else {

            System.out.println("\n Арифметическая прогрессия: "); /// a - число начала, b - число окончания, с -  коэффициент (с>0)

            do {
                System.out.print(a + " ");
                a = a + c;
            }
            while (a <= b);

        }

    }
}


