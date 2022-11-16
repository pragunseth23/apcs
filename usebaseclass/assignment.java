package usebaseclass;

public class assignment {
    public static String hexref = "0123456789ABCDEF";

    public static void main(String[] args) {
        System.out.println(divideBinaryString("110111", "01110"));
        System.out.println(divideHexString("113AB", "34AF"));
    }

    public static double addNum(double a, double b) {
        return a + b;
    }

    public static double subNum(double a, double b) {
        return a - b;
    }

    public static double multiplyNum(double a, double b) {
        return a * b;
    }

    public static double divideBinaryString(String a, String b) {
        double decimal = 0;
        int n = 0;
        int abc = a.length();
        int bcd = b.length();
        int ab = Integer.parseInt(a);
        int bc = Integer.parseInt(b);
        for (int i = 0; i < abc; i++) {
            if (ab == 0) {
                System.out.println(" ");
            } else {
                int y = ab % 10;
                decimal += y * Math.pow(2, n);
                ab = ab / 10;
                n++;
            }
        }
        double decimal2 = 0;
        int m = 0;
        for (int j = 0; j < bcd; j++) {
            if (bc == 0) {
                break;
            } else {
                int x = bc % 10;
                decimal2 += x * Math.pow(2, m);
                bc = bc / 10;
                m++;
            }
        }
        return decimal / decimal2;
    }

    public static double divideDecimal(double a, double b) {
        return a / b;
    }

    public static double divideHexString(String hexString1, String hexString2) {
        double divNum1 = 0;
        double baseCount = 0;
        double a = 1;
        for (int i = hexString1.length() - 1; i > -1; i--) {
            a = 1;
            for (int x = 0; x < baseCount; x++) {
                a *= 16;
            }
            divNum1 += a * hexref.indexOf(hexString1.charAt(i));
            baseCount++;
        }

        double divNum2 = 0;
        double baseCount2 = 0;
        double b = 1;
        for (int j = hexString2.length() - 1; j > -1; j--) {
            b = 1;
            for (int y = 0; y < baseCount2; y++) {
                b *= 16;
            }
            divNum2 += b * hexref.indexOf(hexString2.charAt(j));
            baseCount2++;
        }

        return divNum1 / divNum2;
    }
}