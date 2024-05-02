
package persona;


public class Deportista extends Persona {
    private int ritmoCardiaco;
    private String frecuenciaEntrenamiento;
    private String tipoEjercicio;
    
    public Deportista(){
        super();
        this.ritmoCardiaco=0;
        this.frecuenciaEntrenamiento="";
        this.tipoEjercicio="";
    }
    
    public Deportista(int cedula,String nombre, int edad, char sexo,float peso, float altura, String direccion, int ritmoCardiaco, String frecuenciaEntrenamiento, String tipoEjercicio){
        super(cedula, nombre, edad, sexo, peso, altura, direccion);
        this.ritmoCardiaco=ritmoCardiaco;
        this.frecuenciaEntrenamiento=frecuenciaEntrenamiento;
        this.tipoEjercicio=tipoEjercicio;
    }

    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public String getFrecuenciaEntrenamiento() {
        return frecuenciaEntrenamiento;
    }

    public void setFrecuenciaEntrenamiento(String frecuenciaEntrenamiento) {
        this.frecuenciaEntrenamiento = frecuenciaEntrenamiento;
    }

    public String getTipoEjercicio() {
        return tipoEjercicio;
    }

    public void setTipoEjercicio(String tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }
    
    @Override
    public int calcularIMC(){
        float IMC=super.obtenerValorIMC();
        int grasaCorporal;
        if(this.sexo=='F'){
            grasaCorporal=(int)((1.2*IMC)+(0.23*this.edad)-(5.4));
        } else{
            grasaCorporal=(int)((-10.8)+(1.2*IMC)+(0.23*this.edad)-(5.4));
        }
        return grasaCorporal;
    }
    
    public String determinarSaludPeso(){
        int grasaCorporal=this.calcularIMC();
            if((grasaCorporal<25 && this.sexo=='F')||(grasaCorporal<15 && this.sexo=='M')){
                return ("Delgado");
        }else if((grasaCorporal<=30 && this.sexo=='F')||(grasaCorporal<=20 && this.sexo=='M')){
                return ("Normal");
            } else{
            return("Exceso de grasa corporal");
        }
    }
    
    @Override
    public String calcularEstadoSalud(){
        if(this.ritmoCardiaco>100){
            return ("Ritmo cardicalo en reposo alto, se recomienda parar de hacer ejercicio");
        } else{
            return ("Ritmo cardiaco normal");
        }
    }
    
}
