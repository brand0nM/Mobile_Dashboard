public class Stomach extends Organ{
    // Attributes
    private boolean needsFood = false;


    // Constructor
    public Stomach(java.lang.String medicalCondition) {
        super();
        this.setOrganName("Stomach");
        this.setMedicalCondition(medicalCondition);
        this.setDescription(this.getDescription()+"\n    1) Need to be Fed?");
    }


    // Methods
    public void diguest(){
        System.out.println("Monnnnnnch");
    }
    public java.lang.Boolean getNeedsFood() {
        return needsFood;
    }
    public void setNeedsFood(java.lang.Boolean needsFood) {
        this.needsFood = needsFood;
    }
}
