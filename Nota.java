/**Nota que se puede añadir a una reunión
 * @author Gustavo González
 * @version versión 3, 12 de mayo 2024*/
public class Nota {
    /**String para almacenar el contenido de la nota*/
    private String contenido;
    /**Constructor de Nota, el texto que recibe como String lo almacena en la Nota
     * @param contenido String*/
    public Nota(String contenido) {
        this.contenido = contenido;
    }
    /**Getter del contenido de la nota
     * @return contenido de la nota*/
    public String getContenido() {
        return contenido;
    }
    /**Setter del contenido de la nota
     * @param contenido String*/
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    /**@Override*/
    public String toString() {
        return contenido;
    }
}
