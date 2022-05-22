package Exercicio02;

public class Main {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2: " + (b1 && b2)); // False
        System.out.println("b1 && b3: " + (b1 && b3)); // True

        System.out.println("b2 || b3: " + (b2 || b3)); // True
        System.out.println("b2 || b4: " + (b2 || b4)); // False

        System.out.println("b1 ^ b3: " + (b1 ^ b3)); // False
        System.out.println("b4 ^ b1: " + (b4 ^ b1)); // True

        System.out.println(!b1); // False
        System.out.println(!b2); // True

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + i2) < (f2 - f1)) && true: " + (((i1 + i2) < (f2 - f1)) && true)); // True
        System.out.println("(i1 > i2) || (f2 < f1): " + ((i1 > i2) || (f2 < f1))); // True

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;
        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)); // False

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        System.out.println(salarioBaixo && muitosDependentes); // False

        boolean recebeAuxilio = (salarioBaixo && muitosDependentes);
        System.out.println("Recebe auxílio: " + recebeAuxilio); // False
    }
}
