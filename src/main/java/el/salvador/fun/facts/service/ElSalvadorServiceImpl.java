package el.salvador.fun.facts.service;
import el.salvador.fun.facts.model.AlexaRequest;
import el.salvador.fun.facts.model.IntentEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ElSalvadorServiceImpl implements ElSalvadorService {


    private final Set<String> synsetsForLocation;
    private final Set<String> synsetsForFood;

    @Autowired
    public ElSalvadorServiceImpl(Set<String> synsetsForLocation, Set<String> synsetsForFood) {
        this.synsetsForLocation = synsetsForLocation;
        this.synsetsForFood = synsetsForFood;
    }


    @Override
    public String getFunFact(AlexaRequest alexaRequest) {

        if (IntentEnum.LocationIntent.getValue().equals(alexaRequest.getUserRequest())) {
            return "Fun fact";
        } else if (alexaRequest.getUserRequest().toLowerCase().contains("food")) {
            return "Fun fact";
        } else {
            return null;
        }
    }

}
