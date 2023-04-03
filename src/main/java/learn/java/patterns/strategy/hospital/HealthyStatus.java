package learn.java.patterns.strategy.hospital;

public class HealthyStatus implements DiseaseStatus{
    @Override
    public String getStatus() {
        return "Здоров";
    }
}
