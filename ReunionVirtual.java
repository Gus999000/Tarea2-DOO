/**Reunión virtual asociada a un enlace
 * @author Gustavo González
 * @version versión 6, 14 de mayo 2024
 * @see java.io.IOException*/
import java.io.BufferedWriter;
import java.util.Date;
import java.time.Instant;
import java.time.Duration;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ReunionVirtual extends Reunion {
    /**String para almacenar el enlace de la reunión*/
    private String enlace;
    /**Constructor de ReunionVirtual, recibe y asigna; el organizador, el tipo de reunión, la fecha de la reunión, la hora prevista, la duración prevista y el enlace de la reunión
     * @param organizador Empleado
     * @param tipoReunion tipoReunion
     * @param fecha Date
     * @param horaPrevista Instant
     * @param duracionPrevista Duration
     * @param enlace String*/
    public ReunionVirtual(Empleado organizador, tipoReunion tipoReunion, Date fecha, Instant horaPrevista, Duration duracionPrevista, String enlace) {
        super(organizador, tipoReunion, fecha, horaPrevista, duracionPrevista);
        this.enlace = enlace;
    }
    /**Método para crear el Informe como un archivo de texto
     * @throws IOException lanza esta excepción si ocurre un error al crear el archivo*/
    public void crearInforme() throws IOException {
        try {
            File Informe = new File("Informe.txt");
            FileWriter escrituraArchivo = new FileWriter(Informe);
            BufferedWriter escrituraBuffer = new BufferedWriter(escrituraArchivo);
            escrituraBuffer.write("Fecha: " + fecha.toString() + "\n" + "Hora de la reunión: " + horaPrevista.toString() + "\n" + "Hora de inicio: " + horaInicio.toString() + "\n" + "Hora de fin: " + horaFin.toString() + "\n" + "Duración total: " + this.calcularTiempoReal() + "\n" + tipoReunion.toString() + "\n" + "Enlace: " + enlace + "\n");
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
