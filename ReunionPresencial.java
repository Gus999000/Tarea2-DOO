/**Reunión presencial en una sala
 * @author Gustavo González
 * @version versión 6, 14 de mayo 2024
 * @see java.io.IOException*/
import java.util.Date;
import java.time.Instant;
import java.time.Duration;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class ReunionPresencial extends Reunion {
    /**String para almacenar la sala de la reunión*/
    private String sala;
    /**Constructor de ReunionPresencial, recibe y asigna; el organizador, el tipo de reunión, la fecha de la reunión, la hora prevista, la duración prevista y la sala de la reunión
     * @param organizador Empleado
     * @param tipoReunion tipoReunion
     * @param fecha Date
     * @param horaPrevista Instant
     * @param duracionPrevista Duration
     * @param sala String*/
    public ReunionPresencial(Empleado organizador, tipoReunion tipoReunion, Date fecha, Instant horaPrevista, Duration duracionPrevista, String sala) {
        super(organizador, tipoReunion, fecha, horaPrevista, duracionPrevista);
        this.sala = sala;
    }
    /**Método para crear el Informe como un archivo de texto
     * @throws IOException lanza esta excepción si ocurre un error al crear el archivo*/
    public void crearInforme() throws IOException {
        try {
            File Informe = new File("Informe.txt");
            FileWriter escrituraArchivo = new FileWriter(Informe);
            BufferedWriter escrituraBuffer = new BufferedWriter(escrituraArchivo);
            escrituraBuffer.write("Fecha: " + fecha.toString() + "\n" + "Hora de la reunión: " + horaPrevista.toString() + "\n" + "Hora de inicio: " + horaInicio.toString() + "\n" + "Hora de fin: " + horaFin.toString() + "\n" + "Duración total: " + this.calcularTiempoReal() + "\n" + tipoReunion.toString() + "\n" + "Sala: " + sala + "\n");
            for(int i = 0; i < Invitados.size(); i = i + 1) {
                escrituraBuffer.write(Invitados.get(i).toString() + "\n");
            }
            for(int i = 0; i < Notas.size(); i = i + 1) {
                escrituraBuffer.write(Notas.get(i).getContenido() + "\n");
            }
            escrituraBuffer.close();
        }
        catch(IOException exception) {
            System.out.println("Error al crear archivo");
        }
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
