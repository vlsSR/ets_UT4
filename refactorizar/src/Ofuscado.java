import java.io.IOException;
import java.util.Scanner;

public class Ofuscado {
    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }

    public static int calcularFactorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            int total = 1;
            int numeroEntrada = numero;
            do {
                total *= numeroEntrada;
                numeroEntrada--;
            } while (numeroEntrada > 0);
            return total;
        }
    }

    public static String convertirPalindromo(String parametro1) {
        String palabraFinal = "";
        int contador = 0;
        do {
            palabraFinal = parametro1.charAt(contador) + palabraFinal;
            contador++;
        } while (contador < parametro1.length());
        palabraFinal = parametro1 + palabraFinal;
        return palabraFinal;
    }

    public static void main(String[] args) throws IOException {
        Scanner tec = new Scanner(System.in);
        int opcion;
        do {
            opcion = imprimirMenu(tec);
            if (opcion == 1) {
                imprimir("Inserte un número:");
                String texto = tec.nextLine();
                int numero = Integer.parseInt(texto);
                int resultado = calcularFactorial(numero);
                imprimir("El resultado es:");
                imprimir("" + resultado);
            } else {
                if (opcion == 2) {
                    imprimir("Inserte una palabra:");
                    String palabra = tec.nextLine();
                    String palindroma = convertirPalindromo(palabra);
                    imprimir("El resultado es:");
                    imprimir("" + palindroma);
                }
            }
        }
        while
        (opcion != 3);
    }

    private static int imprimirMenu(Scanner tec) {
        int opcion;
        imprimir("BIENVENIDO AL PROGRAMA OFUSCADO");
        imprimir("-------------------------------");
        imprimir("Elija una opcion:");
        imprimir("1) Cacular factorial");
        imprimir("2) Genera palindromo");
        imprimir("3) Salir");
        imprimir(">");
        String input = tec.nextLine();
        opcion = Integer.parseInt(input);
        return opcion;
    }
}