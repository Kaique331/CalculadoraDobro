import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = entrada.nextInt();
        System.out.printf("O dobro de %1$d é %2$d", valor, 2*valor);
    }
}