import java.util.Date;
import java.time.Instant;
import java.time.Duration;
/**Reunión presencial en una sala
 * @author Gustavo González
 * @version versión 5, 14 de mayo 2024*/
public class ReunionPresencial extends Reunion {
    /**String para almacenar la sala de la reunión*/
    private String sala;
    /**Constructor de ReunionPresencial, recibe y asigna; el organizador, el tipo de reunión, la fecha de la reunión, la hora prevista, la duración prevista y la sala de la reunión
     * @param organizador Empleado
     * @param tipoReunion String
     * @param fecha Date
     * @param horaPrevista Instant
     * @param duracionPrevista Duration
     * @param sala String*/
    public ReunionPresencial(Empleado organizador, String tipoReunion, Date fecha, Instant horaPrevista, Duration duracionPrevista, String sala) {
        super(organizador, tipoReunion, fecha, horaPrevista, duracionPrevista);
        this.sala = sala;
    }
    /**Getter de la sala de la reunión
     * @return sala de la reunión*/
    public String getSala() {
        return sala;
    }
    /**Setter de la sala de la reunión
     * @param sala String*/
    public void setSala(String sala) {
        this.sala = sala;
    }
    @Override
    public String toString() {
        return "Sala de la reunión: " + sala;
    }
}
