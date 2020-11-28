package el.salvador.fun.facts;

import edu.smu.tspell.wordnet.Synset;
import edu.smu.tspell.wordnet.WordNetDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

@SpringBootApplication

public class FunFactsApplication {

	public static void main(String[] args) {
		System.setProperty("wordnet.database.dir", "src/main/resources/thurs/");

		SpringApplication.run(FunFactsApplication.class, args);
	}

}
