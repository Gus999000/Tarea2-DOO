/**Confirmación de asistencia a la reunión
 * @author Gustavo González
 * @version versión 1, 14 de mayo 2024*/
public class Asistencia {
    /**Boolean que confirma la asistencia a la reunión*/
    private boolean Asistencia;
    /**Constructor de Asistencia, "true" o "false"*/
    public Asistencia(Empleado E) {
        if(E.getPresencia() == true) {
            this.Asistencia = true;
        }
        else {
            this.Asistencia = false;
        }
    }
    /**Getter de la asistencia
     * @return "true" si ha estado en la reunión, "false" si no ha estado en la reunión*/
    public boolean getAsistencia() {
        return Asistencia;
    }
    /**Setter de asistencia
     * @param A boolean*/
    public void setAsistencia(boolean A) {
        this.Asistencia = A;
    }
    @Override
    public String toString() {
        return Boolean.toString(Asistencia);
    }
}
