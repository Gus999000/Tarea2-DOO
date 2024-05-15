/**Departamento de empleados
 * @author Gustavo González
 * @version versión 4, 14 de mayo 2024*/
import java.util.List;
import java.util.ArrayList;
public class Departamento implements Invitable {
    /**Nombre del departamento*/
    private String nombre;
    /**Lista de miembros del departamento*/
    private List<Empleado> miembros = new ArrayList<>();
    /**Constructor de departamento, le asigna el nombre
     * @param nombre String*/
    public Departamento(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public Invitacion invitar(Reunion X) {
        Invitacion I = new Invitacion(null);
        for (int i = 0; i < miembros.size(); i = i + 1) {
            Invitacion II = new Invitacion(miembros.get(i));
            X.Invitados.add(miembros.get(i));
        }
        return I;
    }
    /**Getter del nombre del departamento
     * @return nombre del departamento*/
    public String getNombre() {
        return nombre;
    }
    /**Getter de la lista de miembros*/
    public Empleado getMiembros(int i) {
        return miembros.get(i);
    }
    /**Setter del nombre del departamento
     * @param nombre String*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**Setter de la lista de miembros
     * @param i int
     * @param E Empleado*/
    public void setMiembros(int i, Empleado E) {
        miembros.set(i, E);
    }
    @Override
    public String toString() {
        String X = new String();
        for(int i = 0; i < miembros.size(); i = i + 1) {
            X = X + miembros.get(i).toString();
        }
        return "Nombre del departamento: " + nombre + "\n" + "Miembros: " + X;
    }
}
