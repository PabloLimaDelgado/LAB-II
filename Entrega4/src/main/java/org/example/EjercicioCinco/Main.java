package org.example.EjercicioCinco;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.Configurator;

public class Main {

    private static final Logger logger = LogManager.getLogger(org.example.EjercicioCuatro.Main.class);

    public static void main(String[] args) {
        String xmlFileName = "log4j2Ej5.xml";
        Configurator.initialize(null, xmlFileName);

        for (int i = 0; i < 10; i++) {
            logger.info("Mensaje de registro de ejemplo número " + (i + 1));
            try {
                Thread.sleep(10000); // Espera 10 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
