import java.util.Scanner;

public class Heart extends Organ{
    // Attributes
    private int bpm;


    // Constructors
    public Heart(java.lang.String medicalCondition, int bpm) {
        super();
        this.bpm = bpm;
        this.setOrganName("Heart");
        this.setMedicalCondition(medicalCondition);
        this.setDescription(this.getDescription()+"Heart Rate: "
                +this.bpm+"\n 1) Change The Heart Rate?");
    }


    // Methods
    public void changedBpm(int bpm){
        this.setBpm(bpm);
        System.out.println("Heart Rate Changed To: "+ bpm);
    }
    public int getBpm() {
        return bpm;
    }
    public void setBpm(int bpm) {
        this.bpm = bpm;
    }
}
