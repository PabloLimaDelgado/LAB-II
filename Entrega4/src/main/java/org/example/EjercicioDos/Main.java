package org.example.EjercicioDos;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        String xmlFileName = "log4j2.xml";
        Configurator.initialize(null, xmlFileName);

        logger.log(Level.getLevel("MYLOGLEVEL"), "Mensaje");
    }
}
