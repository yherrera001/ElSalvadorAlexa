package el.salvador.fun.facts.repo;

import el.salvador.fun.facts.model.FunFacts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlexaRepo extends CrudRepository<FunFacts, String> {

    //We can use also native SQL to define our query.
    //All we have to do is set the value of the nativeQuery attribute to true and define the native SQL query in the value attribute of the annotation:
    //You can also add a parameter of type Sort to your method definition. Spring Data JPA will then generate the required ORDER BY clause
    @Query(value = "SELECT TOP 1 Fact FROM FUNFACTS WHERE FactType = ?1 ORDER BY RAND()", nativeQuery = true)
    public String getAllFacts(String intentType);


}
