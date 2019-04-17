
package colegio;


public class Estudiante extends Persona {
    
    
    private float promedioMatter;
    private float promedioNote;
    private String curso;

    public Estudiante(String nombre, String apellido , float promedioMatter, float promedioNote, String curso) {
        super(nombre, apellido);
         this.curso = curso;
          this.promedioMatter =  promedioMatter;
           this.promedioNote = promedioNote;
 }

    
    public void mostrarDatos(){
        
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nCurso"+curso+
                "\nPromedio por nota"+promedioNote+
                "\nPromedio por materia"+promedioMatter);
    } 


}
    
    
    
    

