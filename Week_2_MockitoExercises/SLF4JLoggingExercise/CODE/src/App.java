package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.warn(" Warning: Memory usage is high.");
        logger.error(" Error: Unable to write to disk.");
    }
}
