package learn.java.patterns.strategy.hospital;

public class Human {
    private String name;
    private String surname;
    private DiseaseStatus diseaseStatus;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
        diseaseStatus = new HealthyStatus();
    }

    public void setDiseaseStatus(DiseaseStatus diseaseStatus) {
        this.diseaseStatus = diseaseStatus;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", diseaseStatus=" + diseaseStatus.getStatus() +
                '}';
    }
}
