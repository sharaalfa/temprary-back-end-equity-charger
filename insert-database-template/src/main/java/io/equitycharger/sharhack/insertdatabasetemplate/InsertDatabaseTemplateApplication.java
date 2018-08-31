package io.equitycharger.sharhack.insertdatabasetemplate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.FileReader;
import java.util.stream.Stream;

@SpringBootApplication
public class InsertDatabaseTemplateApplication {
    private static final Log log = LogFactory.getLog(InsertDatabaseTemplateApplication.class);

    public static void main(String[] args) {
        log.info("It is running to insert in the database.");
        SpringApplication.run(InsertDatabaseTemplateApplication.class, args);

    }

    @Bean
    public CommandLineRunner productbcs(ProductRepository productRepository) {
        return args -> {
            //houseRepository.deleteAll();
            JSONParser jsonParser = new JSONParser();
            try {
                log.info("It is insert a new data.");
                Object obj = jsonParser.parse(new FileReader(System.getProperty("user.home")+ "\\temp.json"));
                JSONObject jsonObject = (JSONObject) obj;
                String productId = (String) jsonObject.get("productId");
                String nameProduct = (String) jsonObject.get("nameProduct");
                String brand = (String) jsonObject.get("brand");
                String modelProduct = (String) jsonObject.get("modelProduct");
                String categoryProduct = (String) jsonObject.get("categoryProduct");
                String fullCategoryProduct = (String) jsonObject.get("fullCategoryProduct");
                String country = (String) jsonObject.get("country");
                String productDate = (String) jsonObject.get("productDate");
                String description = (String) jsonObject.get("description");
                String imageProduct = (String) jsonObject.get("imageProduct");
                String imageBrand = (String) jsonObject.get("imageBrand");

                Stream.of(new Productbc(productId, nameProduct, brand, modelProduct, categoryProduct, fullCategoryProduct,
                                country, productDate, description, imageProduct, imageBrand)
                        ).forEach(productRepository::save);
                log.info("Number of houses is " + productRepository.count());
                productRepository.findAll().forEach(house -> log.info(house.getImageBrand()));

            } catch (Exception e) {
                log.error(e.getMessage());
            }
            // log.info("Number of houses is " + houseRepository.count());
            //  houseRepository.findAll().forEach(house -> log.info(house.getAddress()));
        };
    }
}
