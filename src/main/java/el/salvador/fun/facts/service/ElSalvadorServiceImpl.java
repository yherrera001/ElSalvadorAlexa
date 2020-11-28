package el.salvador.fun.facts.service;
import el.salvador.fun.facts.model.AlexaRequest;
import el.salvador.fun.facts.model.IntentEnum;
import el.salvador.fun.facts.repo.AlexaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElSalvadorServiceImpl implements ElSalvadorService {

    private final AlexaRepo alexaRepo;

    @Autowired
    public ElSalvadorServiceImpl(AlexaRepo alexaRepo) {
        this.alexaRepo = alexaRepo;
    }


    @Override
    public String getFunFact(AlexaRequest alexaRequest) {

        if (IntentEnum.LocationIntent.getValue().equals(alexaRequest.getIntentType())) { //
            return alexaRepo.getAllFacts(alexaRequest.getIntentType());
        } else if (IntentEnum.FoodIntent.getValue().equals(alexaRequest.getIntentType())) {
            return alexaRepo.getAllFacts(alexaRequest.getIntentType());
        } else if (IntentEnum.CultureIntent.getValue().equals(alexaRequest.getIntentType())) {
            return alexaRepo.getAllFacts(alexaRequest.getIntentType());
        } else {
            return null;
        }
    }

}
