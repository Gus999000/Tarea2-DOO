/**Invitación a una reunión
 * @author Gustavo Benítez
 * @version versión 3, 14 de mayo 2024*/
import java.time.Instant;
import java.time.format.DateTimeFormatter;
public class Invitacion {
    /**Empleado al que va dirigida la invitación*/
    private Empleado invitado;
    /**Hora de creación de la invitación*/
    private Instant hora;
    public Invitacion(Empleado invitado) {
        this.invitado = invitado;
        this.hora = Instant.now();
    }
    /**Getter de la hora de la invitación
     * @return hora a la que fue enviada*/
    public Instant getHora() {
        return hora;
    }
    /**Getter del invitado en cuestion
     * @return empleado invitado*/
    public Empleado getInvitado() {
        return invitado;
    }
    /**Setter de la hora de la invitación
     * @param hora Instant*/
    public void setHora(Instant hora) {
        this.hora = hora;
    }
    /**Setter de la hora de la invitación
     * @param invitado Empleado*/
    public void setInvitado(Empleado invitado) {
        this.invitado = invitado;
    }
    @Override
    public String toString() {
        return "Empleado: " + invitado.toString() + "\n" + "Hora de la invitación: " + DateTimeFormatter.ofPattern("yyyy-MM-ddHH:mm:ss").format(hora);
    }
}
