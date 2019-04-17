
package colegio;

import java.util.Scanner;



public class Colegio {


    
    public static void Opera() {
 
    Scanner leer = new Scanner (System.in);
  
          
     int NumNotas=0, matter=1,nota=1, nStudent, student=1,NumMaterias=1 ;
     //Definicion de contadores
     float counterSumerNote=0,counterQuentityNote=0, counterSumerNote1=0 ;
     // Defnicion de variables de entrada
     float inNote=0 ;
     // definicion de varibles de pormedio
     float averageNote, averageMatter;
     
     
     Escritura.ScreeDateStudent();
    
        
       
       
        //FOR ESTUDIANTES
    for(student=1;student<=nStudent;student++) {
      
            
        System.out.println("Ingrese cantidad de materias :");
        NumMaterias = leer.nextInt();
       Escritura.espacio();
        
             //FOR MATERIAS
             for(matter=1;matter<=NumMaterias;matter++){
                 System.out.println("Materia: "+matter+". Estudiante: "+student+".");
                 
                 
                  System.out.println("Ingrese cantidad de notas");
                  NumNotas=leer.nextInt(); ///////////a///////////////hacer contador de notas      
                  Escritura.espacio();
                  
                 //FOR NOTAS
                 for(nota=1;nota<=NumNotas;nota++){
                     counterSumerNote1=0; //inicialisando count de suma notas a 0
                     
                     System.out.println("Nota: "+nota+". Materia: "+matter+". Estuduante: "+student+".");
                     System.out.println("Ingrese nota ");
                  //contador suma el valor de notas
                    inNote = leer.nextFloat();
                     counterSumerNote = counterSumerNote + inNote; 
                 }
                 
                 
                counterSumerNote1 = counterSumerNote  ;//cambio de variable contador de nota para iniciarla
                  System.out.println("");

                 //Contador de notas
                 counterQuentityNote = counterQuentityNote + NumNotas;
                 //Muestra en pantalla las notas
                 System.out.println("La suma de las notas es "+counterSumerNote);
                 //Operacion de promedio y impresion en pantalla
                 averageNote = (counterSumerNote1/counterQuentityNote); /// aca estaba el error

                     
                 //Nuestra el promedio del estudiante en pantalla 
                 System.out.println("El promedio por notas del estudiante "+student+" es: "+averageNote);
                 // inicialisando contador de suma notas
                 System.out.println(""); 
                 
                 
             }      

                // Promedio por materias
             averageMatter =(counterSumerNote/counterQuentityNote);
           
             System.out.println("El promedio del estudiante por materia "+student+" es: "+averageMatter);
                                
            }



    
            }
           
     
    }
    