package org.example.Persona;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class UsuarioTest {

    //@BeforeAll: Cuando necesitas realizar una configuración que será utilizada por
    // todas las pruebas y que solo necesitas hacer una vez. Por ejemplo, la configuración
    // de un entorno de prueba compartido.

    //@AfterAll: Cuando necesitas limpiar recursos que fueron configurados en @BeforeAll y que deben ser
    // liberados después de que todas las pruebas se hayan ejecutado. Por ejemplo, cerrar conexiones
    // de base de datos o limpiar datos de prueba.

    //@BeforeAll
    //static void setup() {
        // Configuración global antes de todas las pruebas
    //    System.out.println("Ejecución antes de todas las pruebas");
        // Por ejemplo, inicializar una base de datos
    //}

    @AfterAll
    static void tearDown() {
        // Limpieza global después de todas las pruebas
        System.out.println("Ejecución después de todas las pruebas");
        // Por ejemplo, cerrar conexiones de base de datos
    }

    @Test
    @DisplayName("probando el nombre")
    void testNombreUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pablo");
        assertNotNull(usuario.getNombre(), "El nombre no deberia ser null");
    }

    @Test
    @DisplayName("probando la edad")
    void testEdadUsuario() throws Exception{
        Usuario usuario = new Usuario();
        usuario.setEdad(18);

        assertNotNull(usuario.getEdad(), "La edad no debe ser null");
        assertTrue(usuario.getEdad() > 17, "La edad debe ser mayor a 18");
    }
}
