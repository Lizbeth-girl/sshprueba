/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.mavenproject2;

/**
 *
 * @author PERSONAL
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*double num1 = 5;
        double num2 = 7;

        int menu = 4;
        switch (menu) {
                   case 1:
                System.out.println("Estas sumando los dos números");
                System.out.println("Resultado:" + (num1 + num2));
                break;
            case 2:
                System.out.println("Estas restando los dos números");
                System.out.println("Resultado:" + (num1 - num2));
                break;
            case 3:
                System.out.println("Estas multiplicando los dos números");
                System.out.println("Resultado:" + " " + (num1 * num2));
                break;
            case 4:
                if (num2!=0){
                System.out.println("Estas di vición los dos números");
                System.out.println("Resultado:" + (num1 / num2));
                break;
                }else{
                    System.out.println("No se puede dividir");
                    break;
                }
            default:
                System.out.println("No hay opción matemáticas"); */

        System.out.println("Ejemplo for");
        for (int i = 1; i <= 8; i = i+5) {
            System.out.println("Numero: " + i);
            //Estructura Repetitiva:while
            System.out.println("Ejemplo de while");
            int contador = 1; 
            while (contador <=3){
                System.out.println("Contador" + contador);
                contador++;
                //Estructura repetitiva: do-while
                System.out.println("Ejemplo de do-while");
                int n = 0;
                        do{
                            System.out.println("valor de n:"+ n);
                          n++;  
                        } while (n < 2);
            }
        }

    }
}