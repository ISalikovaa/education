public class TranslationFromBinary {

    public static int calcbinary(int bin2) {
        int result = 0;
        int count = 0;


         while (bin2 >= 1) {
             int digitValue = bin2 % 10;
             if (digitValue == 1) {
                 result = result + (int) Math.pow(2, count);
             }
             count++;
             bin2 = bin2 / 10;
         }
        System.out.print("Десятичное число: ");
        return result;

    }

}






