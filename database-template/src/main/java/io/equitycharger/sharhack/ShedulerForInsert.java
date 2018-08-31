package io.equitycharger.sharhack;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class ShedulerForInsert extends TimerTask {

    private static final Log log = LogFactory.getLog(ShedulerForInsert.class);



    @Override
    @SuppressWarnings("unchecked")
    public void run() {

        try {
            String rootPath = System.getProperty("user.home");
            if (rootPath.contains("\\")) {
                String[] parts = rootPath.split("\\\\");
                log.info("insert-database--template-0.0.1-SNAPSHOT.jar");
                Runtime rt = Runtime.getRuntime();
                String command = "java -jar " + System.getProperty("user.home")  + "\\insert-database-template-0.0.1-SNAPSHOT.jar";
                log.info(command);
                Process process = rt.exec(command);
            }

        } catch (Exception e) {
            log.error(e.getMessage());
        }

    }
}
