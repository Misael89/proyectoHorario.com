package proyectohorario.com;

/**
 *
 * @author Misael Mena
 */
public class HorarioProfesores {
     private String profesor;
     private String Materia;
     private int creditos;

    public HorarioProfesores(String nombre, String Materia, int creditos) {
        this.profesor = nombre;
        this.Materia = Materia;
        this.creditos = creditos;
    }

    
    public String getNombre() {
        return profesor;
    }

    public void setNombre(String nombre) {
        this.profesor = nombre;
    }
    public String getMateria() {
        return Materia;
    }
    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
    
}
