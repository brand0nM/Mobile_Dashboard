// Keep Organ Abstract

public class Organ {
    // Attributes
    private String organName;
    private String medicalCondition;
    private String description;


    // Methods
    public void setOrganName(java.lang.String organName) {
        this.organName = organName;
        this.description = "Name: "+this.organName+"\nMedical Condition: "+this.medicalCondition;
    }
    public void setMedicalCondition(java.lang.String medicalCondition) {
        this.medicalCondition = medicalCondition;
        this.description = "Name: "+this.organName+"\nMedical Condition: "+this.medicalCondition;
    }
    public java.lang.String getDescription() {
        return description;
    }
    public void setDescription(java.lang.String description) {
        this.description = description;
    }
}
