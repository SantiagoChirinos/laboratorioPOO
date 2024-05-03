
package persona;


public class Entrenador extends Persona{
    private float experienciaLaboral; //En años
    private String especialidad;
    
    public Entrenador(){
        super();
        this.experienciaLaboral=0;
        this.especialidad="";
    }
    
    public Entrenador(int cedula,String nombre, int edad, char sexo,float peso, float altura, String direccion, float experienciaLaboral, String especialidad){
        super(cedula, nombre, edad, sexo, peso, altura, direccion);
        this.experienciaLaboral=experienciaLaboral;
        this.especialidad=especialidad;
    }

    public float getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setExperienciaLaboral(float experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public String determinarRutina(int grasaCorporal, String tipoEjercicio){
        //este metodo sugiere la rutina
        if("Reduccion de peso".equals(tipoEjercicio) || grasaCorporal>30){
            return("cardio");
        }if("Tonificacion".equals(tipoEjercicio)){
            return ("Aerobicos");
        }if("Flexibilidad".equals(tipoEjercicio)){
            return("Yoga");
        }else{
            return("Dia libre");
        }
    }
    
    public String determinarRutina(String tipoEjercicio,int grasaCorporal){
        //este metodo establece los objetivos a cumplir
        if("Reduccion de peso".equals(tipoEjercicio) || grasaCorporal>30){
            return("Correr 25km");
        }if("Tonificacion".equals(tipoEjercicio)){
            return("50 series de 10 repeticiones de levantamiento de pesas");
        }if("Flexibilidad".equals(tipoEjercicio)){
            return("15 minutos de yoga cada 3 horas");
        } else{
            return("descanso");
        }
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("-Datos de persona-");
        System.out.println("-Cedula: " + getCedula());
        System.out.println("-Nombre: "+ getNombre());
        System.out.println("-Edad: " + getEdad());
        System.out.println("-Sexo: " + getSexo());
        System.out.println("-Peso: " + getPeso());
        System.out.println("-Altura: " + getAltura());
        System.out.println("-Direccion: " + getDireccion());
        System.out.println("-Experencia laboral: " + this.getExperienciaLaboral());
        System.out.println("-Especialidad: " + this.getEspecialidad());
    }
    
    
}
