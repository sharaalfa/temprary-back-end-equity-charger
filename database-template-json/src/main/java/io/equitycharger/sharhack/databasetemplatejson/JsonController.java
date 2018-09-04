package io.equitycharger.sharhack.databasetemplatejson;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class JsonController {
    private static final Log log = LogFactory.getLog(JsonController.class);
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    ProductRepository productRepository;

    public JsonController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @RequestMapping("/")
    public List getTuples() {
        log.info("It is select a data.");

        return this.jdbcTemplate.queryForList("SELECT * FROM productsss");//.stream()
        //.map(Map::values)
        //.collect(Collectors.toList());
    }


    @RequestMapping(value = "/_ah/insert", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public void create(@RequestBody String body) {
        log.info(" productId " + body.split("%3A")[0]);
        log.info( body.split("%3A")[12].split("%2C")[0]);
        log.info(body.split("%3A")[13].split("%2C")[0]);
        String imageBrand = body.split("%3A")[13].split("%2C")[0].split("%2F%2F")[1];
        String imageProduct = body.split("%3A")[11].split("%2C")[0].split("%2F%2F")[1];
        //String[] parts = imageUrl.split("%2F");
        productRepository.save(new Productsss(body.split("%3A")[1], body.split("%3A")[2].split("%2C")[0],
                body.split("%3A")[3].split("%2C")[0], body.split("%3A")[4].split("%2C")[0],
                body.split("%3A")[5].split("%2C")[0], body.split("%3A")[6].split("%2C")[0],
                body.split("%3A")[7].split("%2C")[0], body.split("%3A")[8]
                .split("%2C")[0].split("%2F")[0] + "/" + body.split("%3A")[8].split("%2C")[0]
                .split("%2F")[1] + "/" + body.split("%3A")[8].split("%2C")[0].split("%2F")[2],
                body.split("%3A")[9].split("%2C")[0], body.split("%3A")[10] + ":/" +
                path(imageProduct), body.split("%3A")[12] + ":/" + path(imageBrand)));
        log.info("Number of products is " + productRepository.count());
        productRepository.findAll().forEach(house -> log.info(house.getImageBrand()));

        //return productRepository.save(productbc);
    }
    private String path (String image) {
        String path = "";
        String parts[] = image.split("%2F");
        for (String part : parts) {
            path += "/" + part;
        }
        return path;
    }
}
