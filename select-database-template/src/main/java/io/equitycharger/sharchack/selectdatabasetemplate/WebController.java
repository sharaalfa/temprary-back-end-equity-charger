

package io.equitycharger.sharchack.selectdatabasetemplate;

import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
public class WebController {

	private final JdbcTemplate jdbcTemplate;
	private static final Log log = LogFactory.getLog(WebController.class);
	private Timer timer;

	public WebController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@GetMapping("/getTuples")
	public List getTuples() {
		log.info("It is select a data.");
		return this.jdbcTemplate.queryForList("SELECT * FROM productbc");//.stream()
				//.map(Map::values)
				//.collect(Collectors.toList());
	}
	/*@GetMapping("/postTuples")
	public void insert() {
		timer.schedule(new ShedulerForInsert(jdbcTemplate), 0, 60*500);
		//jdbcTemplate.execute("INSERT INTO users VALUES (" + house.getAddress() + ")");
		//jdbcTemplate.execute("INSERT INTO users VALUES ('l23r@example.com', 'Anderson13', 'Silva')");
	}*/

}
