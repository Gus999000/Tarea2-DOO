/**Clase abstracta Reunion
 * @author Gustavo González
 * @version versión 4, 14 de mayo 2024*/
import java.util.Date;
import java.time.Instant;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.time.temporal.ChronoField;
abstract class Reunion {
    /**Empleado organizador de la reunión*/
    protected Empleado organizador;
    /**Tipo de reunión*/
    protected String tipoReunion;
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
    /**Lista de invitados a la reunión*/
    public List<Empleado> Invitados = new ArrayList<>();
    /**Lista de notas de la reunión*/
    public List<Nota> Notas = new ArrayList<>();
    /**Constructor de reunion, recibe y asigna las variables previstas
     * @param organizador Empleado
     * @param tipoReunion String
     * @param fecha Date
     * @param horaPrevista Instant
     * @param duracionPrevista Duration*/
    public Reunion(Empleado organizador, String tipoReunion, Date fecha, Instant horaPrevista, Duration duracionPrevista) {
        this.organizador = organizador;
        this.tipoReunion = tipoReunion;
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
    }
    /**Método que crea una lista con las asistencias a la reunión
     * @return lista de asistencias*/
    public List obtenerAsistencias() {
        List<Empleado> Asistencias = new ArrayList<>();
        for(int i = 0; i < Invitados.size(); i = i + 1) {
            Asistencia A = new Asistencia(Invitados.get(i));
            if(A.getAsistencia() == true) {
                Asistencias.add(Invitados.get(i));
            }
        }
        return Asistencias;
    }
    /**Método que crea una lista con las ausencias a la reunión
     * @return lista de ausencias*/
    public List obtenerAusencias() {
        List<Empleado> Ausencias = new ArrayList<>();
        for(int i = 0; i < Invitados.size(); i = i + 1) {
            Asistencia A = new Asistencia(Invitados.get(i));
            if(A.getAsistencia() == false) {
                Ausencias.add(Invitados.get(i));
            }
        }
        return Ausencias;
    }
    /**Método que crea una lista con los retrasos a la reunión
     * @return lista de retrasos*/
    public List obtenerRetrasos() {
        List<Empleado> Ausencias = this.obtenerAusencias();
        List<Empleado> Retrasos = new ArrayList<>();
        List<Retraso> RR = new ArrayList<>();
        for(int i = 0; i < Ausencias.size(); i = i + 1) {
            Asistencia A = new Asistencia(Ausencias.get(i));
            if(A.getAsistencia() == true) {
                Retraso R = new Retraso(Ausencias.get(i));
                RR.add(R);
                Retrasos.add(Ausencias.get(i));
            }
        }
        return Retrasos;
    }
    /**Método que obtiene la cantidad total de asistencias aplicando size() a la lista
     * @return el número total de asistencias a la reunión*/
    public int obtenerTotalAsistencia() {
        List<Empleado> Asistencias = this.obtenerAsistencias();
        int TotalAsistencia = Asistencias.size();
        return TotalAsistencia;
    }
    /**Método que divide en 100 el total de asistencia para obtener el valor float equivalente al porcentaje
     * @return valor float equivalente al porcentaje*/
    public float obtenerPorcentajeAsistencia() {
        float PorcentajeAsistencia = this.obtenerTotalAsistencia() / 100;
        return PorcentajeAsistencia;
    }
    /**Transforma la hora de inicio y la hora de fin a segundos y los resta para dar los segundos de duración real de la reunión, luego los pasa a minutos
     * @return el tiempo real de la reunión en minutos*/
    public float calcularTiempoReal(){
        float TiempoReal;
        TiempoReal = horaFin.get(ChronoField.INSTANT_SECONDS) - horaInicio.get(ChronoField.INSTANT_SECONDS);
        TiempoReal = TiempoReal / 60;
        return TiempoReal;
    }
    /**Inicia la reunión*/
    public void iniciar() {
        this.horaInicio = Instant.now();
    }
    /**Finaliza la reunión*/
    public void finalizar() {
        this.horaFin = Instant.now();
    }
    /**Método para crear una nota y guardarla en las notas de la reunión
     * @param contenido String
     * @return nota con el contenido escrito*/
    public Nota crearNota(String contenido) {
        Nota N = new Nota(contenido);
        Notas.add(N);
        return N;
    }
    /**Getter del organizador
     * @return organizador de la reunión*/
    public Empleado getOrganizador() {
        return organizador;
    }
    /**Getter del tipo de la reunión
     * @return tipo de la reunión*/
    public String getTipoReunion() {
        return tipoReunion;
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
    /**Getter de la lista de invitados
     * @param i int
     * @return el invitado correspondiente al index(i)*/
    public Empleado getInvitados(int i) {
        return Invitados.get(i);
    }
    /**Getter de la lista de notas
     * @param i int
     * @return la nota correspondiente al index(i)*/
    public Nota getNotas(int i) {
        return Notas.get(i);
    }
    /**Setter del organizdor de la reunión
     * @param organizador Empleado*/
    public void setOrganizador(Empleado organizador) {
        this.organizador = organizador;
    }
    /**Setter del tipo de reunión
     * @param tipoReunion String*/
    public void setTipoReunion(String tipoReunion) {
        this.tipoReunion = tipoReunion;
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
    /**Setter de la lista de invitados
     * @param i int
     * @param E Empleado*/
    public void setInvitados(int i, Empleado E) {
        Invitados.set(i, E);
    }
    /**Setter de la lista de notas
     * @param i int
     * @param N Nota*/
    public void setNotas(int i, Nota N) {
        Notas.set(i, N);
    }
}
