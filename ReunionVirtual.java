import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**Reunión virtual asociada a un enlace
 * @author Gustavo González
 * @version versión 3, 13 de mayo 2024*/
public class ReunionVirtual extends Reunion {
    /**String para almacenar el enlace de la reunión*/
    private String enlace;
    /**Constructor de ReunionVirtual, recibe y asigna; la fecha de la reunión, la hora prevista, la duración prevista y el enlace de la reunión
     * @param fecha Date
     * @param horaPrevista Instant
     * @param duracionPrevista Duration
     * @param enlace String*/
    public ReunionVirtual(Date fecha, Instant horaPrevista, Duration duracionPrevista, String enlace) {
        super(fecha, horaPrevista, duracionPrevista);
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
}
