package el.salvador.fun.facts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FunFacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;

    private String FactType;
    private String Fact;


    public FunFacts() {
    }

    public FunFacts(String ID, String factType, String fact) {
        this.ID = ID;
        FactType = factType;
        Fact = fact;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFactType() {
        return FactType;
    }

    public void setFactType(String factType) {
        FactType = factType;
    }

    public String getFact() {
        return Fact;
    }

    public void setFact(String fact) {
        Fact = fact;
    }

    @Override
    public String toString() {
        return "FunFacts{" +
                "ID='" + ID + '\'' +
                ", FactType='" + FactType + '\'' +
                ", Fact='" + Fact + '\'' +
                '}';
    }
}
