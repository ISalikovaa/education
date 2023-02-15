public class NumberComparison {

    public static int calcequals(int a, int b) {
        if (a > b) {
            System.out.printf("Первое число больше второго: %d > %d\n", a, b);
            return 1;
        } else if (b > a) {
            System.out.printf("Второе число больше больше: %d > %d\n", b, a);
            return -1;
        } else {
            System.out.printf("Первое и второе чилсло равны: %d = %d\n", a, b);
            return 0;
        }
    }
}
