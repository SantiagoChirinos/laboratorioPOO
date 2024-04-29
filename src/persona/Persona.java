// autores: Santiago Chirinos, Eros dos Ramos, Adel Suarez
package persona;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
    protected int cedula;
    protected String nombre;
    protected int edad;
    protected char sexo;
    protected float peso;
    protected float altura;
    protected String direccion;
    
    
    
    public Persona(int cedula,String nombre, int edad, char sexo,float peso, float altura, String direccion){
        this.cedula = cedula;
        this.altura = altura;
        this.sexo = sexo;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.direccion = direccion;
    }
    
    public Persona(){
        this.cedula = 0;
        this.altura = 0;
        this.sexo = ' ';
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
        this.direccion = "";
    }
    
    public String calcularEstadoSalud(){
        float IMC=this.obtenerValorIMC();
        if(IMC<16){
            return "Criterio de ingreso al hostital";
        }else if(IMC<18){
            return "infrapeso";
        }else if(IMC<25){
            return "bajo peso";
        }else if(IMC<30){
            return "peso normal";
        }else if(IMC<35){
            return "sobrepeso cronico";
        }else if(IMC<40){
           return "obesidad premorbida"; 
        }else{
            return "Obesidad morbida";
        }
    }
    
    public int calcularIMC(){
        float IMC=this.obtenerValorIMC();
        System.out.println(this.calcularEstadoSalud());
        if(IMC<18){
            return -1;
        } else if(IMC<25){
            return 0;
        }else if(IMC<35){
            return 1;
        }else{
            return 2;
        }
    }
    
    public float obtenerValorIMC(){
        float IMC=(float) (this.peso/(Math.pow(this.altura, 2)));
        return IMC;
    }
    
    public boolean esMayorDeEdad(){
        boolean estadoDeEdad = (this.edad >= 18);
        return estadoDeEdad;
    }
    
    public void comprobarSexo(char sexo){ 
        if (sexo == 'F' || sexo == 'M'){
            System.out.println("El sexo es: " + sexo);
        } else {
            System.out.println("El sexo es incorrecto");
        }
    }
    
    public static boolean validarDireccion(String direccion){
            // Expresión regular que acepta letras de la A a la Z (mayúsculas y minúsculas), números del 0 al 9, y los símbolos # y .
       String expresionRegular = "^[a-zA-Z0-9#.]*$";

       // Compila la expresión regular
       Pattern pattern = Pattern.compile(expresionRegular);

       // Crea un matcher que comprobará la dirección contra la expresión regular
       Matcher matcher = pattern.matcher(direccion);

       // Retorna true si la dirección es válida, false en caso contrario
       return matcher.matches();
    }

    public void imprimirDatosPer(){
        System.out.println("-Datos de persona-");
        System.out.println("-Cedula: " + getCedula());
        System.out.println("-Nombre: "+ getNombre());
        System.out.println("-Edad: " + getEdad());
        System.out.println("-Sexo: " + getSexo());
        System.out.println("-Peso: " + getPeso());
        System.out.println("-Altura: " + getAltura());
        System.out.println("-Direccion: " + getDireccion());
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public int validarInt(Scanner scanner, int limiteSuperior, int limiteInferior){
        while(true){
            int dato=scanner.nextInt();
            if(dato>=limiteInferior && dato<=limiteSuperior){
                return dato;
            } else{
                System.out.println("Dato fuera de rango!");
            }
        }
    }
    
    
    
    public float validarFloat(Scanner scanner, float limiteSuperior, float limiteInferior){
        while(true){
            float dato=(float)scanner.nextFloat();
            if(dato>=limiteInferior && dato<=limiteSuperior){
                return dato;
            } else{
                System.out.println("Dato fuera de rango!");
            }
        }
    }
    
    public char validarSexo(Scanner scanner){
        while(true){
            System.out.print("Introduce la sexo (F:femenino, M:masculino): ");
            char sexo=scanner.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            if(sexo=='F' || sexo=='M'){
                return sexo;
            } else{
                System.out.println("Sexo invalido");
            }
        }
    }
    
    public String validarDireccion(Scanner scanner){
        while(true){
            System.out.print("Introduce la direccion: ");

            String direccion=scanner.nextLine();
            if(validarDireccion(direccion)){
                return direccion;
            } else{
                System.out.println("Direccion invalida!");
            }
        }
    }
    
    public String validarNombre(Scanner scanner){
        
        while (true){
            System.out.print("Introduce el nombre (no puede estar vacio): ");

            String nombreValidado = scanner.nextLine();
            if (!nombreValidado.equals("")){
                return  nombreValidado;
            } else {
                System.out.println("Nombre no puede estar vacio!");
            }

        }
          
    }
    

    public  Persona pedidaDeDatos(){
        Scanner scanner= new Scanner(System.in);
        
        String nombre = validarNombre(scanner);
        
        System.out.println("Ingrese la cedula de la persona (entre 1 y 50 millones)");
        int cedula = validarInt(scanner,50000000,1);
        
        System.out.println("Ingrese la edad de la persona (entre 12 y 80)");
        int edad = validarInt(scanner,80,12);
       
        char sexo = validarSexo(scanner);
        
        System.out.println("Ingrese el peso de la persona (Entre 25 y 635)");
        float peso = (float)validarFloat(scanner,635f,25f);
        
        System.out.println("Ingrese la altura de la persona (entre 0,8 y 2,72)");
        float altura = (float)validarFloat(scanner,2.72f,0.8f);
        scanner.nextLine();
        
        String direccion = validarDireccion(scanner);
        
        return new Persona (cedula, nombre, edad, sexo, peso, altura, direccion);
    }
}