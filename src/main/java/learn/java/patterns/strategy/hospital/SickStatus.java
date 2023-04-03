package learn.java.patterns.strategy.hospital;

public class SickStatus implements DiseaseStatus{
    @Override
    public String getStatus() {
        return "Болен";
    }
}
