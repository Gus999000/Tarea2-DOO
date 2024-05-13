/**Departamento de empleados
 * @author Gustavo González
 * @version versión 1, 13 de mayo 2024*/
public class Departamento {
    /**Nombre del departamento*/
    private String nombre;
    /**Constructor de departamento, le asigna el nombre
     * @param nombre String*/
    public Departamento(String nombre) {
        this.nombre = nombre;
    }
    /**Getter del nombre del departamento
     * @return nombre del departamento*/
    public String getNombre() {
        return nombre;
    }
    /**Setter del nombre del departamento
     * @param nombre String*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**@Override*/
    public String toString() {
        return nombre;
    }
}
