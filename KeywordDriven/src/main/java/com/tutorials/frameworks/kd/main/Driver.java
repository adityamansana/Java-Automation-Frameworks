package com.tutorials.frameworks.kd.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Driver {
    private static final Logger LOGGER = LoggerFactory.getLogger(Driver.class);

    public static void main(String args[]){
        new TestExecutor().execute("TestSuite.xlsx");
    }
}
