package org.example;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.error("esto es un error");
        logger.info("Ingresando a la aplicación.");
        logger.debug("esto es debug!");
    }
}