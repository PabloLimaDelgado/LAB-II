package EjercicioTres.Calculo;

import EjercicioTres.Impuestos.Impuesto;
import EjercicioTres.Impuestos.ImpuestoUno;

public class CalculoFiscal {
    private Gastos idGastos;
    private Impuesto idImpuestos;

    public CalculoFiscal() {
    }

    public CalculoFiscal(Gastos idGastos, Impuesto idImpuestos) {
        this.idGastos = idGastos;
        this.idImpuestos = idImpuestos;
    }

    public double calcularDeficit(){
        return this.idImpuestos.getMontoRecaudado() - this.idGastos.getInformeGastos();
    }
}
