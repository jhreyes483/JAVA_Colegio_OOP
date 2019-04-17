
package colegio;

public class Principal {
    int nStudent;
    
public static void main(String[] args) {
    
    
    
    Escritura.presentacion();
    Escritura.espacio();
    Colegio.Opera();
    
    
    Estudiante estudiante1 = new Estudiante ("Daniel","Cardenas",4,4,"Septimo");
    
    estudiante1.mostrarDatos();
    
    
    
    
}
}