package org.example.Banco;

public class Banco {
    private String numeroCuenta;
    private Double saldo;

    public Banco() {}

    public Banco(String numeroCuenta, Double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void agregarCuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public double consultarSaldo(String numeroCuenta) throws Exception {
        if (numeroCuenta == null || !numeroCuenta.equals(this.numeroCuenta)) {
            throw new Exception("La cuenta no coincide");
        }
        return this.getSaldo();
    }

    public void depositar(String numeroCuenta, double monto) throws Exception {
        if (numeroCuenta == null) {
            throw new Exception("El numero de cuenta no puede ser null");
        }
        if (monto <= 0) {
            throw new Exception("El monto no puede ser negativo");
        }
        if (!numeroCuenta.equals(this.numeroCuenta)) {
            throw new Exception("El numero de cuenta no coincide");
        }
        this.setSaldo(this.getSaldo() + monto);
    }

    public void retirar(String numeroCuenta, double monto) throws Exception {
        if (numeroCuenta == null) {
            throw new Exception("El numero de cuenta no puede ser null");
        }
        if (monto <= 0) {
            throw new Exception("El monto no puede ser negativo");
        }
        if (!numeroCuenta.equals(this.numeroCuenta)) {
            throw new Exception("El numero de cuenta no coincide");
        }
        if (this.getSaldo() < monto) {
            throw new Exception("Saldo insuficiente");
        }
        this.setSaldo(this.getSaldo() - monto);
    }
}
