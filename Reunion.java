/*Clase abstracta Reunion
 * @author Gustavo González
 * @version versión 1, 03 de mayo 2024*/
import java.util.Date;
import java.time.Instant;
import java.time.Duration;
import java.util.List;
abstract class Reunion {
    /*Date para almacenar la fecha*/
    private Date fecha;
    /*Instant para almacenar la hora prevista de inicio*/
    private Instant horaPrevista;
    /*Duration para almacenar el tiempo previsto de duración*/
    private Duration duracionPrevista;
    /*Instant para almacenar la hora real de inicio*/
    private Instant horaInicio;
    /*Instant para almacenar la hora real de fin*/
    private Instant horaFin;
    public List obtenerAsistencias() {
    }
    public List obtenerAusencias() {
    }
    public List obtenerRetrasos() {
    }
    public int obtenerTotalAsistencia() {
    }
    public float obtenerPorcentajeAsistencia() {
    }
    public float calcularTiempoReal(){
    }
    public void iniciar() {
    }
    public void finalizar() {
    }
}
