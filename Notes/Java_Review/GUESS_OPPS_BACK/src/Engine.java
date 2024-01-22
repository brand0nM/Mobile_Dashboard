public class Engine {
    private String model;
    private int rpm;


    public Engine(java.lang.String model, int rpm) {
        this.model = model;
        this.rpm = rpm;
    }

    /**
     * Returns the Model of our Car
     * @return
     */
    public java.lang.String getModel() {
        return model;
    }
    public void setModel(java.lang.String model) {
        this.model = model;
    }
    public int getRpm() {
        return rpm;
    }
    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
}
