/**Reunión presencial en una sala
 * @author Gustavo González
 * @version versión 1, 12 de mayo 2024*/
public class ReunionPresencial extends Reunion {
    /**String para almacenar la sala de la reunión*/
    private String sala;
    /**Constructor de ReunionPresencial, recibe la sala de la reunión y la asigna al parámetro
     * @param sala String*/
    public ReunionPresencial(String sala) {
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
    /**@Override*/
    public String toString() {
        return sala;
    }
}
