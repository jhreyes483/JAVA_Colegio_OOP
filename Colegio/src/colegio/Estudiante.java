
package colegio;


public class Estudiante extends Persona {
    
    
    private float promedioMatter;
    private float promedioNote;
    private String curso;

    public Estudiante(String nombre, String apellido, String edad, float promedioMatter, float promedioNote, String curso) {
        super(nombre, apellido, edad);
         this.curso = curso;
          this.promedioMatter =  promedioMatter;
           this.promedioNote = promedioNote;
 }

    
    public void mostraDatos(){
    
        
        
        
    } 


}
    
    
    
    

