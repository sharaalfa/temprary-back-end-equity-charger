package io.equitycharger.sharchack.selectdatabasetemplate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SelectDatabaseTemplateApplication {
    private static final Log log = LogFactory.getLog(SelectDatabaseTemplateApplication.class);

    public static void main(String[] args) {
        log.info("It is running to select in the database.");
        SpringApplication.run(SelectDatabaseTemplateApplication.class, args);
    }
}
