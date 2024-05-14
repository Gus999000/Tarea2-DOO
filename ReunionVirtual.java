import java.util.Date;
import java.time.Instant;
import java.time.Duration;
/**Reunión virtual asociada a un enlace
 * @author Gustavo González
 * @version versión 4, 14 de mayo 2024*/
public class ReunionVirtual extends Reunion {
    /**String para almacenar el enlace de la reunión*/
    private String enlace;
    /**Constructor de ReunionVirtual, recibe y asigna; el organizador, el tipo de reunión, la fecha de la reunión, la hora prevista, la duración prevista y el enlace de la reunión
     * @param organizador Empleado
     * @param tipoReunion String
     * @param fecha Date
     * @param horaPrevista Instant
     * @param duracionPrevista Duration
     * @param enlace String*/
    public ReunionVirtual(Empleado organizador, String tipoReunion, Date fecha, Instant horaPrevista, Duration duracionPrevista, String enlace) {
        super(organizador, tipoReunion, fecha, horaPrevista, duracionPrevista);
        this.enlace = enlace;
    }
    /**Getter del enlace de la reunión
     * @return enlace de la reunión*/
    public String getEnlace() {
        return enlace;
    }
    /**Setter del enlace de la reunión
     * @param enlace String*/
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
    @Override
    public String toString() {
        return "Enlace de la reunión: " + enlace;
    }
}
