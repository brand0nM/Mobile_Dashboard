public class Eye extends Organ {
    // Attributes
    private String side;
    private boolean open;
    private String color;


    // Constructor
    public Eye(java.lang.String side, java.lang.String medicalCondition, boolean open, java.lang.String color) {
        super();
        this.setOpen(open);
        this.setColor(color);
        this.setOrganName(side+" Eye");
        this.setMedicalCondition(medicalCondition);
        this.setDescription(this.getDescription(open));
    }


    // Methods
    /** Gets this classes updated description- using the super classes method, getDescription() and appending changes
     * @return
     */
    public String getDescription(boolean open) {
        return this.getDescription()+"\nColor: "+this.getColor()+"\n 1) "
                +((open)? "Close":"Open")+" The "+this.getSide()+" Eye?";
    }
    public void changedTheEye() {
        if (this.isOpen()) {
            System.out.println("This Eye was Closed");
        } else {
            System.out.println("This Eye was Opened");
        }
        this.setOpen(!this.isOpen());
        this.setDescription(this.getDescription(!this.isOpen()));
    }
    public java.lang.String getSide() {
        return side;
    }
    public void setSide(java.lang.String side) {
        this.side = side;
    }
    public boolean isOpen() {
        return open;
    }
    public void setOpen(boolean open) {
        this.open = open;
    }
    public java.lang.String getColor() {
        return color;
    }
    public void setColor(java.lang.String color) {
        this.color = color;
    }
}
