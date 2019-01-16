package boletin_18_1;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin_18 {

    /**
     * @param args the command line arguments
     */
    /**
     * inicio
     */
    public class Persoal {
    private String telefono;
    private String correo;

    public Persoal() {
    }

    public Persoal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "telefono=" + telefono + ", correo=" + correo;
    }
    
    
    
}
    }
    
