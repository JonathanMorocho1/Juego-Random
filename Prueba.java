package prueba;

import java.util.Random;
import java.util.Scanner;

public class Prueba {

    int num = 0, aux = 0;
    boolean incog;
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];

    public void arrays() {

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese el numero " + i + " del arreglo: ");
            num = sc.nextInt();
            incog = true;
            for (int j = 0; j < numeros.length; j++) {
                if (num == numeros[j]) {
                    i--;
                    incog = false;
                    System.out.println("Error ingresaste un número repetido");
                }
            }
            if (incog == true) {
                numeros[i] = num;
            }
        }

    }
    int ram = 0;
    public void random() {
        if (incog == true) {
            Random r = new Random();
            ram = r.nextInt(10) + 1;
            System.out.println("El Random es: " + ram);
            for (int i = 0; i < numeros.length; i++) {
                if (ram == numeros[i]) {
                    System.out.println("Ganaste");
                    aux = numeros[i];
                }
            }
        }
        if(ram != aux){
            System.out.println("Perdiste");
        }
    }

    public static void main(String[] args) {

        Prueba ajem = new Prueba();
        ajem.arrays();
        ajem.random();
    }
}
