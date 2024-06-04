package org.example.Persona;

import org.example.Banco.Banco;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;;

class BancoTest {

    @Test
    @DisplayName("adicion con saldo inicial")
    void adicionCuentas(){
        Banco banco = new Banco();

        banco.setSaldo(0.1);

        assertTrue(banco.getSaldo() > 0, "El saldo no debe ser negativo");
    }

    @Test
    @DisplayName("La consulta de saldo")
    void consultaSaldo(){
        Banco banco = new Banco("A1", 1000.0);

        try {
            double saldo = banco.consultarSaldo("A1");  // Número de cuenta que coincide
        } catch (Exception e) {
            fail("No se esperaba una excepción: " + e.getMessage());
        }
    }

    @Test
    @DisplayName("Verificación de número de cuenta y monto depositar")
    void adicionDeCuentas() {
        Banco banco = new Banco("A1", 1000.0);

        // Verificar que se lanza una excepción cuando el número de cuenta es null
        Exception exception1 = assertThrows(Exception.class, () -> {
            banco.depositar(null, 0.1);
        });
        assertEquals("El numero de cuenta no puede ser null", exception1.getMessage());

        // Verificar que se lanza una excepción cuando el monto es negativo
        Exception exception2 = assertThrows(Exception.class, () -> {
            banco.depositar("A1", -0.1);
        });
        assertEquals("El monto no puede ser negativo", exception2.getMessage());
    }

    @Test
    @DisplayName("Retiro con número de cuenta inválido")
    void retiroNumeroCuentaInvalido() {
        Banco banco = new Banco("A1", 1000.0);

        Exception exception = assertThrows(Exception.class, () -> {
            banco.retirar("A2", 100.0);  // Número de cuenta que no coincide
        });
        assertEquals("El numero de cuenta no coincide", exception.getMessage());
    }

    @Test
    @DisplayName("Retiro con monto negativo")
    void retiroMontoNegativo() {
        Banco banco = new Banco("A1", 1000.0);

        Exception exception = assertThrows(Exception.class, () -> {
            banco.retirar("A1", -100.0);  // Monto negativo
        });
        assertEquals("El monto no puede ser negativo", exception.getMessage());
    }

    @Test
    @DisplayName("Retiro con saldo insuficiente")
    void retiroSaldoInsuficiente() {
        Banco banco = new Banco("A1", 1000.0);

        Exception exception = assertThrows(Exception.class, () -> {
            banco.retirar("A1", 2000.0);  // Monto mayor que el saldo
        });
        assertEquals("Saldo insuficiente", exception.getMessage());
    }

    @Test
    @DisplayName("Retiro exitoso")
    void retiroExitoso() {
        Banco banco = new Banco("A1", 1000.0);

        try {
            banco.retirar("A1", 500.0);  // Retiro exitoso
            assertEquals(500.0, banco.getSaldo());
        } catch (Exception e) {
            fail("No se esperaba una excepción: " + e.getMessage());
        }
    }
}
