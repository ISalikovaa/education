public class ListDivision {

    public static void calclist() {

        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        int[] arr3 = new int[100];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                arr1[count1] = i;
                count1++;
            }
            if (i % 5 == 0) {
                arr2[count2] = i;
                count2++;
            }
            if (i % 5 == 0 && i % 3 == 0) {
                arr3[count3] = i;
                count3++;
            }
        }
        System.out.println("Числа делится на 3:");


        for (int a = 0; a < count1; a++) {
            System.out.print(arr1[a] + " ");
        }

        System.out.println("\n Числа делится на 5:");
        for (int a = 0; a < count2; a++) {
            System.out.print(arr2[a] + " ");
        }

        System.out.println("\n Числа делится на 3 и на 5:");
        for (int a = 0; a < count3; a++) {
            System.out.print(arr3[a] + " ");
        }

    }

}


