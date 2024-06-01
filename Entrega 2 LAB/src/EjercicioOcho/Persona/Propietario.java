package EjercicioOcho.Persona;

public class Propietario extends Persona{
    private int fondoBancario;

    public Propietario() {
    }

    public Propietario(int direccion, String nombre, String seguridadSocial, int telefono, int fondoBancario) {
        super(direccion, nombre, seguridadSocial, telefono);
        this.fondoBancario = fondoBancario;
    }

    public int getFondoBancario() {
        return fondoBancario;
    }

    public void setFondoBancario(int fondoBancario) {
        this.fondoBancario = fondoBancario;
    }
}
