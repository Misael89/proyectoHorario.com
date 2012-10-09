package proyectohorario.com;
import java.util.LinkedList;
import java.util.Scanner;
public class ProyectoHorarioCom {
      public static void main(String[] args) {
          System.out.println("Igrese Nombre del Profesor: ");
          Scanner entradaProfesor=new Scanner(System.in);               
          String profesorAdentro= entradaProfesor.nextLine();
          
          System.out.println("Ingrese Asignatura: ");
          Scanner entradaAsignatura= new Scanner(System.in);
          String asignaturaAdentro=entradaAsignatura.nextLine();                 
          
          System.out.println("Ingrese Creditos de la Agignatura: ");
          Scanner entradaCreditos=new Scanner(System.in);
          int creditosAdentro=Integer.parseInt(entradaCreditos.nextLine());       
                   
          HorarioProfesores infoprofesor= new HorarioProfesores(profesorAdentro, asignaturaAdentro, creditosAdentro);        
         
          LinkedList<HorarioProfesores> horarioDeProfesores = new LinkedList<HorarioProfesores>();
          horarioDeProfesores.add(infoprofesor);
          
          for(int i=0; i ! = horarioDeProfesores.size();i++ ){
              HorarioProfesores contenedor= horarioDeProfesores.get(i);
              
              
              System.out.println("Estes es el horario de este profesor: " + contenedor.getNombre());
              System.out.println("Esta es La Agignatura: " + contenedor.getMateria());
              System.out.println("Estas Son las horas de la Agignaturas: " + contenedor.getCreditos());
              
          }
         
                 
                     
          
     
    }
}
