import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Zahlen
        byte a = 1; // 2 hoch 8 = 256
        short b = 280; // 2 hoch 16 -32768 bis 32767
        int c = 2147483647; // 2 hoch 32 -2.147.483.648 bis 2.147.483.647
        System.out.println(c + 1);
        long ms = 1000L
                * 60L
                * 60L
                * 24L
                * 30L
                * 12L;
        System.out.println(ms);
        float f = 3.14f; // 32 bit
        double d1 = 3.14; // 64 bit
        System.out.println(0.1 * 0.2);
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.1");
        boolean isAdmin = true;
        char a1 = '!';
        String str = " Hello aefsfhsiufghoiufdshgoidfhoidfjojkvpokidfikajrg";
        // Mathematische Operatoren: +, -, /, *, %
        int ia = 1;
        int ib = 2;
        double result = 1.0 * a / b; // double hack
        System.out.println(result);
        // Vergleichsoperatoren:
        boolean isEqual = 5 != 5;
        System.out.println(isEqual);

        // Logische Operatoren:
        int age = 17;
        boolean isTeenager = age >= 13 && age <= 18;
        System.out.println(isTeenager);

        int power = 50;
        int health = 20;
        boolean isGameOver = power <= 0 || health <= 0;
        System.out.println(!isGameOver);


    }
}