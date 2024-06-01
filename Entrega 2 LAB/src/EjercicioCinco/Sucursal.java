package EjercicioCinco;

public class Sucursal {
    private PlatoComida[] platosComida = new PlatoComida[20];
    private String direccion;

    public Sucursal() {
    }
    public Sucursal(String direccion) {
        this.direccion = direccion;
    }

    public PlatoComida[] getPlatosComida() {
        return platosComida;
    }

    public void setPlatosComida(PlatoComida[] platosComida) {
        this.platosComida = platosComida;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarComida(PlatoComida platoComida){
        for (int i = 0; i < (platosComida.length-1); i++) {
            if(platosComida[i] == null){
                platosComida[i] = platoComida;
                break;
            }
        }
    }
    public int servir(PlatoComida platoComida, Persona persona, int estrellasRestaurante) {
        for (int i = 0; i < (platosComida.length-1); i++) {
            if (platosComida[i] != null && persona.getSucursalesVisita().get(i).getDireccion().equals(this.direccion)) {
                if (platosComida[i].getNombre().equals(platoComida.getNombre())) {
                    return platoComida.getPuntajePlato() + estrellasRestaurante;
                }
            }
        }
        return 0;
    }
}
