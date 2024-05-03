// autores: Santiago Chirinos, Eros dos Ramos, Adel Suarez
package main;
import java.util.Scanner;
import persona.*;


public class Main {
    
    public static void main(String[] args) {
        int caso=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese 1 para crear una persona con parametros predeterminados");
        System.out.println("ingrese 2 para crear una persona con parametros ingresados por usted");
        System.out.println("ingrese 3 para crear un deportista con parametros predeterminados");
        System.out.println("ingrese 4 para crear un deportista con parametros predeterminados");
        System.out.println("ingrese 5 para crear un entrenador con parametros predeterminados");
        System.out.println("ingrese 6 para crear un entrenador con parametros predeterminados");
        System.out.println("ingrese 7 para salir");
        
        while(caso!=7){
            caso=scanner.nextInt();
            switch(caso){
                case 1:
                    System.out.println("La clase persona ahora es abstracta, esta opcion ya no es posible");
                    break;
                case 2:
                    System.out.println("La clase persona ahora es abstracta, esta opcion ya no es posible");
                    break;
                case 3:
                    Deportista deportista1= new Deportista();
            } 
        }
    }
}
