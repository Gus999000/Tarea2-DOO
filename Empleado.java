/**Empleados
 * @author Gustavo González
 * @version versión 1, 13 de mayo 2024*/
public class Empleado {
    /**String para almacenar la identificación del empleado*/
    private String id;
    /**String para almacenar ambos apellidos del empleado*/
    private String apellidos;
    /**String para almacenar el nombre del empleado*/
    private String nombre;
    /**String para almacenar el correo del empleado*/
    private String correo;
    /**Getter del id del empleado
     * @return id del empleado*/
    public String getId() {
        return id;
    }
    /**Getter de los apellidos del empleado
     * @return apellidos del empleado*/
    public String getApellidos() {
        return apellidos;
    }
    /**Getter del nombre del empleado
     * @return nombre del empleado*/
    public String getNombre() {
        return nombre;
    }
    /**Getter del correo del empleado
     * @return correo del empleado*/
    public String getCorreo() {
        return correo;
    }
    /**Setter del id del empleado
     * @param id String*/
    public void setId(String id) {
        this.id = id;
    }
    /**Setter de los apellidos del empleado
     * @param apellidos String*/
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**Setter del nombre de los empleados
     * @param nombre String*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**Setter del correo de los empleados
     * @param correo String*/
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
