import java.util.Scanner;
import javax.swing.JOptionPane;

public class CicloWhile{
    private static final Scanner teclado = new Scanner(System.in);

    public static int obtenerNumero(String mensaje){
        int numeroTemporal = 0;

        while(numeroTemporal <= 0){
           String numero = JOptionPane.showInputDialog(null, mensaje + ":");
            numeroTemporal = Integer.parseInt(numero);
        }
        return numeroTemporal;
    }

    public static void main(String[] args){
        int numero = obtenerNumero("Ingresa un numero");
        int numero2 = obtenerNumero("ingresa un numero");
        int resultado = numero / numero2;
       
       JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
   
    }

}