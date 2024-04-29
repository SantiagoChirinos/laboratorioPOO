
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
    
    
}
