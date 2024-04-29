// autores: Santiago Chirinos, Eros dos Ramos, Adel Suarez
package main;
import persona.Persona;

public class Main {
    
    public static void main(String[] args) {
        int caso;
        Scanner scanner= new Scanner();
        System.out.println("ingrese 1 para crear una persona con parametros predeterminados");
        System.out.println("ingrese 2 para crear una persona con parametros ingresados por usted");
        System.out.println("ingrese 3 para crear un deportista con parametros predeterminados");
        System.out.println("ingrese 4 para crear un deportista con parametros predeterminados");
        System.out.println("ingrese 5 para crear un entrenador con parametros predeterminados");
        System.out.println("ingrese 6 para crear un entrenador con parametros predeterminados");
        System.out.println("ingrese 7 para salir");
        
        while(caso!=7){
            caso=scanner.nextInt();
            switch(caso)
                case 1:
                    Persona persona2= new Persona();
                    System.out.println("---------------------------------------------");
                    persona2.setAltura(1.73f);
                    persona2.setCedula(32435623);
                    persona2.setDireccion("Avenida principal de los Cortijos");
                    persona2.setEdad(17);
                    persona2.setNombre("Juan Perez");
                    persona2.setPeso(73.5f);
                    persona2.setSexo('M');
                    System.out.println(" ");
                    System.out.println("---------------------------------------------");
                    System.out.println("-Clase con constructor sin parametros-");
                    persona2.imprimirDatosPer();
                    persona2.calcularIMC();
                    if(persona2.esMayorDeEdad()){
                        System.out.println("Es mayor de edad");
                    } else{
                        System.out.println("Es menor de edad");
                    }
                    break;
                case 2:
                    Persona personaAux= new Persona();
                    System.out.println("---------------------------------------------");
                    Persona persona1 = personaAux.pedidaDeDatos();        
                    persona1.imprimirDatosPer();
                    persona1.calcularIMC();
                    if(persona1.esMayorDeEdad()){
                        System.out.println("Es mayor de edad");
                    } else{
                        System.out.println("Es menor de edad");
                    }
                    break;
                case 3:
                    Deportista deportista1= new Deportista();
            }                
        
        
        
        
        
    }
    
    
    
    


}
