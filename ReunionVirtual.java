/**Reunión virtual asociada a un enlace
 * @author Gustavo González
 * @version versión 2, 13 de mayo 2024*/
public class ReunionVirtual extends Reunion {
    /**String para almacenar el enlace de la reunión*/
    private String enlace;
    /**Constructor de ReunionVirtual, recibe el enlace de la reunión y lo asigna al parámetro
     * @param enlace String*/
    public ReunionVirtual(String enlace) {
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
