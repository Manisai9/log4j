package org.example;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.sql.Timestamp;

public class App {
    final static Logger logger = Logger.getLogger(App.class);
    public static int a = 20;
    public static int b = 10;

    public static void main(String[] args) {
        String log4jConfPath = "D:\\Projects\\Log4j\\src\\main\\java\\resources\\log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);

        logger.debug("DEBUG Message");
        logger.warn("WARN Message");
        logger.fatal("FATAL Message");
        logger.error("ERROR Message");
        logger.trace("TRACE Message");

        while (true) {
            try {
                Thread.sleep(5000l);
                sendNotification();
                add();
                multiply();
                divide();
                logger.info("Running");
                System.out.println("Running at " + new Timestamp(System.currentTimeMillis()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void sendNotification() {
        logger.info("Notification Sent");
    }
    public static void add() {
        logger.debug("Adding numbers");
        System.out.println(a + b);
    }

    public static void multiply() {
        logger.error("this method is incomplited");

    }

    public static void divide() {
        logger.warn("Dividing the numbers");
        System.out.println(a/b);
    }

}
