package el.salvador.fun.facts.model;


public class AlexaRequest {


    private String intentType;


    public AlexaRequest() {
    }

    public AlexaRequest(String intentType) {
        this.intentType = intentType;
    }

    public String getIntentType() {
        return intentType;
    }

    public void setIntentType(String intentType) {
        this.intentType = intentType;
    }
}
