import java.util.Scanner;

public class CicloWhile{
    private static final Scanner teclado = new Scanner(System.in);

    public static int obtenerNumero(String mensaje){
        int numeroTemporal = 0;

        while(numeroTemporal <= 0){
           System.out.println(mensaje + " :");
            numeroTemporal = teclado.nextInt();
        }
        return numeroTemporal;
    }

    public static void main(String[] args){
        int numero = obtenerNumero("Ingresa un numero");
        int numero2 = obtenerNumero("ingresa un numero");
        int resultado = numero / numero2;
        System.out.println("El resutado es "+ resultado);
   
    }

}