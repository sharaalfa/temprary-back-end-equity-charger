package io.equitycharger.sharhack;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Timer;

public class Main {
    private static final Log  log = LogFactory.getLog(Main.class);


    public static void main(String[] args) {

        try {
            log.info("try to run select-database-template-0.0.1-SNAPSHOT.jar");
            Runtime rt = Runtime.getRuntime();
            System.out.println(System.getProperty("java.runtime.name"));

            Process process = rt.exec("java -jar " + System.getProperty("user.home") + "/select-database-template-0.0.1-SNAPSHOT.jar");

        } catch (Exception e ){
            log.error(e.getMessage());
        }
        new Timer().scheduleAtFixedRate(new ShedulerForInsert(), 0, 60*3000);


    }
}
