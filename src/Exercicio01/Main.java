package Exercicio01;

public class Main {

    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Pessoa";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2: " + (i1 == i2)); // False
        System.out.println("i1 != i2: " + (i1 != i2)); // True
        System.out.println("i1 > i2: " + (i1 > i2)); // False
        System.out.println("i1 <= i2: " + (i1 <= i2)); // True

        System.out.println("f1 == f2: " + (f1 == f2)); // False
        System.out.println("f1 != f2: " + (f1 != f2)); // True
        System.out.println("f1 >= f2: " + (f1 >= f2)); // True
        System.out.println("f1 < f2: " + (f1 < f2)); // False

        System.out.println("c1 == c2: " + (c1 == c2)); // False
        System.out.println("c1 != c2: " + (c1 != c2)); // True
        System.out.println("c1 > c2: " + (c1 > c2)); // False
        System.out.println("c1 <= c2: " + (c1 <= c2)); // True

        System.out.println("s1 == s2: " + (s1 == s2)); // True
        System.out.println("s1 == s3: " + (s1 == s3)); // False
        System.out.println("s1 != s2: " + (s1 != s2)); // False
        // System.out.println(s1 >= s2); -- Comparação de tamanho entre Strings
        // System.out.println(s1 < s2); -- Comparação de tamanho entre Strings

        System.out.println("b1 == b2: " + (b1 == b2)); // False
        System.out.println("b1 != b2: " + (b1 != b2)); // True
        // System.out.println(b1 > b2); -- Comparação de tamanho entre booleanos
        // System.out.println(b1 <= b2); -- Comparação de tamanho entre booleanos

        System.out.println("i2 > f1: " + (i2 > f1)); // True
        System.out.println("d1 == h1: " + (d1 == h1)); // False
        // System.out.println(s2 != c1); -- Comparação entre tipos de dados diferentes
        // System.out.println(s3 != i1); -- Comparação entre tipos de dados diferentes

        System.out.println("l1 == i2: " + (l1 == i2)); // False
        System.out.println("l2 >= i1: " + (l2 >= i1)); // True
        System.out.println("y1 != h1: " + (y1 != h1)); // True
    }

}
