package el.salvador.fun.facts.config;

import edu.smu.tspell.wordnet.Synset;
import edu.smu.tspell.wordnet.WordNetDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class WordNetConfiguration {

    //CANNOT USE FOR THIS PROJECT

    @Bean
    public WordNetDatabase wordNetDatabase(){
        return WordNetDatabase.getFileInstance();
    }

    @Bean
    public Set<String> synsetsForLocation(WordNetDatabase wordNetDatabase){
        Synset[] synsets = wordNetDatabase.getSynsets("location");
        Set<String> allSynonyms = new HashSet<>();
        for (Synset synset : synsets) {
            String[] wordForms = synset.getWordForms();
            allSynonyms.addAll(Arrays.asList(wordForms));
        }
        return allSynonyms;
    }

    @Bean
    public Set<String> synsetsForFood(WordNetDatabase wordNetDatabase){
        Synset[] synsets = wordNetDatabase.getSynsets("food");
        Set<String> allSynonyms = new HashSet<>();
        for (Synset synset : synsets) {
            String[] wordForms = synset.getWordForms();
            allSynonyms.addAll(Arrays.asList(wordForms));
        }
        return allSynonyms;
    }
}
