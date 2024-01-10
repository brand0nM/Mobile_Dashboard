public class Shepard extends Dog{
    boolean gotPull;

    public Shepard(java.lang.String name, java.lang.String color, int legs, boolean hasTail, boolean gotPull) {
        super(name, color, legs, hasTail);
        this.gotPull = gotPull;
    }

    public boolean isGotPull() {return gotPull;}
    public void setGotPull(boolean gotPull) {this.gotPull = gotPull;}
}
