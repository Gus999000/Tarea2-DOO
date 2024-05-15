/**Clase para registrar retrasos
 * @author Gustavo González
 * @version versión 5, 15 de mayo 2024*/
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Retraso extends Asistencia {
    /**Instant para almacenar la hora del retraso*/
    private Instant hora;
    /**Constructor de Retraso, deja al empleado presente y usa Instant.now() para definir la hora del retraso*/
    public Retraso(Empleado E) {
        super(E);
        this.hora = Instant.now();
    }
    /**Getter de la hora del retraso
     * @return hora del retraso*/
    public Instant getHora() {
        return hora;
    }
    /**Setter de la hora del retraso
     * @param hora Instant*/
    public void setHora(Instant hora) {
        this.hora = hora;
    }
    @Override
    public String toString() {
        return "Asistencia: " + Boolean.toString(super.getAsistencia()) + "\n" + "Hora del retraso: " + DateTimeFormatter.ofPattern("yyyy-MM-ddHH:mm:ss").format(hora);
    }
}
