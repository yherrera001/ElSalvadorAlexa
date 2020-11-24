package el.salvador.fun.facts.model;

public enum IntentEnum {

    LocationIntent("LocationIntent");

    private final String intentName;

    IntentEnum(String intentName){
        this.intentName = intentName;
    }

    public String getValue(){
        return intentName;
    }
}
