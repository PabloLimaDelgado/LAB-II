package org.example.EjercicioOcho;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
public class Main {

    private static final Logger logger = LogManager.getLogger(org.example.Main.class);

    public static void main(String[] args) {
        String xmlFileName = "log4j2Ej8.xml";
        Configurator.initialize(null, xmlFileName);

        logger.info("LA APLICACIÓN SE HA INICIADO");
        logger.error("ERROR EN LA LINEA");
    }
}
