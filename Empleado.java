/**Clase empleado
 * @author Gustavo González
 * @version versión 2, 14 de mayo 2024*/
public class Empleado implements Invitable {
    /**String para almacenar la identificación del empleado*/
    private String id;
    /**String para almacenar ambos apellidos del empleado*/
    private String apellidos;
    /**String para almacenar el nombre del empleado*/
    private String nombre;
    /**String para almacenar el correo del empleado*/
    private String correo;
    /**Boolean para verificar la presencia del empleado*/
    private boolean presencia;
    /**Constructor de Empleado
     * @param id String
     * @param apellidos String
     * @param nombre String
     * @param correo String
     * @param presencia boolean*/
    public Empleado(String id, String apellidos, String nombre, String correo, boolean presencia) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.correo = correo;
        this.presencia = presencia;
    }
    @Override
    public Invitacion invitar(Reunion X) {
        Invitacion I = new Invitacion(this);
        X.Invitados.add(this);
        return I;
    }
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
    /**Getter de la presencia del empleado
     * @return presencia del empleado*/
    public boolean getPresencia() {
        return presencia;
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
    /**Setter de la presencia del empleado
     * @param presencia boolean*/
    public void setPresencia(boolean presencia) {
        this.presencia = presencia;
    }
    @Override
    public String toString() {
        return "Id :" + id + "Apellidos: " + apellidos + "Nombre: " + nombre + "Correo: " + correo + "Presencia: " + Boolean.toString(presencia);
    }
}
