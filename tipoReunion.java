/**Enumeración de los 3 tipos principales de reuniones
 * @author Gustavo González
 * @version versión 3, 14 de mayo 2024*/
enum tipoReunion {
    TECNICAS("técnicas"),
    MARKETING("marketing"),
    OTROS("otros");
    /**String indicando el tipo de reunión*/
    private final String tipoReunion;
    /**Constructor de la enumeración
     * @param tipoReunion String*/
    tipoReunion(String tipoReunion) {
        this.tipoReunion = tipoReunion;
    }
    /**Getter del tipo de reunión
     * @return tipo de reunión*/
    public String getTipoReunion() {
        return tipoReunion;
    }
    @Override
    public String toString() {
        return "Tipo de la reunión: " + tipoReunion;
    }
}
