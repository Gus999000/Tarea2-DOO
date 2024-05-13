/**Clase abstracta Reunion
 * @author Gustavo González
 * @version versión 2, 12 de mayo 2024
 * @see IOException*/
import java.util.Date;
import java.time.Instant;
import java.time.Duration;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
abstract class Reunion {
    /**Date para almacenar la fecha*/
    protected Date fecha;
    /**Instant para almacenar la hora prevista de inicio*/
    protected Instant horaPrevista;
    /**Duration para almacenar el tiempo previsto de duración*/
    protected Duration duracionPrevista;
    /**Instant para almacenar la hora real de inicio*/
    protected Instant horaInicio;
    /**Instant para almacenar la hora real de fin*/
    protected Instant horaFin;
    /**Método que lista las asistencias a la reunion
     * @return */
    public List obtenerAsistencias() {
    }
    /***/
    public List obtenerAusencias() {
    }
    /***/
    public List obtenerRetrasos() {
    }
    /***/
    public int obtenerTotalAsistencia() {
        int TotalAsistencia;
        return TotalAsistencia;
    }
    /***/
    public float obtenerPorcentajeAsistencia() {
        float PorcentajeAsistencia;
        return PorcentajeAsistencia;
    }
    /***/
    public float calcularTiempoReal(){
        float TiempoReal;
        TiempoReal = horaFin - horaInicio;
        return TiempoReal;
    }
    /***/
    public void iniciar() {
    }
    /***/
    public void finalizar() {
    }
    /**Método para crear el Informe como un archivo de texto
     * @throws IOException lanza esta excepción si ocurre un error al crear el archivo*/
    public void crearInforme() throws IOException {
        try {
            File Informe = new File("Informe.txt");
            FileWriter escritura = new FileWriter(Informe);
            escritura.write("HOLA");
            escritura.close();
        }
        catch(IOException exception) {
            System.out.println("Error al crear archivo");
        }
    }
    /**Getter de la fecha
     * @return fecha de la reunión*/
    public Date getFecha() {
        return fecha;
    }
    /**Getter de la hora prevista
     * @return hora prevista de la reunión*/
    public Instant getHoraPrevista() {
        return horaPrevista;
    }
    /**Getter de la duración prevista de la reunión
     * @return duración prevista de la reunión*/
    public Duration getDuracionPrevista() {
        return duracionPrevista;
    }
    /**Getter de la hora de inicio de la reunión
     * @return hora de inicio de la reunión*/
    public Instant getHoraInicio() {
        return horaInicio;
    }
    /**Getter de la hora de fin de la reunión
     * @return hora de fin de la reunión*/
    public Instant getHoraFin() {
        return horaFin;
    }
    /**Setter de la fecha de la reunión
     * @param fecha Date*/
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    /**Setter de la hora prevista de la reunión
     * @param horaPrevista Instant*/
    public void setHoraPrevista(Instant horaPrevista) {
        this.horaPrevista = horaPrevista;
    }
    /**Setter de la duración prevista
     * @param duracionPrevista Duration*/
    public void setDuracionPrevista(Duration duracionPrevista) {
        this.duracionPrevista = duracionPrevista;
    }
    /**Setter de la hora de inicio
     * @param horaInicio Instant*/
    public void setHoraInicio(Instant horaInicio) {
        this.horaInicio = horaInicio;
    }
    /**Setter de la hora de fin
     * @param horaFin Instant*/
    public void setHoraFin(Instant horaFin) {
        this.horaFin = horaFin;
    }
}
