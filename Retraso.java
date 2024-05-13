/**Clase para registrar retrasos
 * @author Gustavo González
 * @version versión 3, 12 de mayo 2024*/
import java.time.Instant;
public class Retraso {
    /**Instant para almacenar la hora del retraso*/
    private Instant hora;
    /**Constructor de Retraso, usa Instant.now() para definir la hora en el instante de tiempo*/
    public Retraso() {
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
    /**@Override*/
    public String toString() {
        return String.valueOf(hora);
    }
}