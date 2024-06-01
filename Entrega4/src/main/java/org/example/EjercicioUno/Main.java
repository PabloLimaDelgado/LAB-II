package org.example.EjercicioUno;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.Configurator;

public class Main {

    private static final Logger logger = LogManager.getLogger(org.example.Main.class);

    public static void main(String[] args) {
        String xmlFileName = "log4j2.xml";
        Configurator.initialize(null, xmlFileName);
                logger.error("esto es un error");
                logger.info("Ingresando a la aplicación.");
                logger.debug("esto es debug!");
    }
}