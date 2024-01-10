public class Phone {
    // Best practice to keep these tidy
//    // Don't want others modifiying certain attributes
//    private String name;
//    private int screenSize;
//    private int memoryRam;
//    private int camera;


    // Constructors,
    // Allows for multiple ways to create the class
    public Phone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }
    public Phone(String name, int memoryRam) {
        this.name = name;
        this.memoryRam = memoryRam;
    }


    // Phone User Methods
    static void playMusic(String trackName, String artistName) {
        System.out.println(trackName+", by "+artistName);
    }
    public void printName(){
        System.out.println(this.name);
    }


    // Getter and Setters, No need for setter if you don't want iPhones to be modified
    // after instantiation
    public String getName() {
        return name;
    }
    public int getScreenSize() {
        return screenSize;
    }
    public int getMemoryRam() {
        return memoryRam;
    }
    public int getCamera() {
        return camera;
    }

//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setScreenSize(int screenSize) {
//        this.screenSize = screenSize;
//    }
//
//    public void setMemoryRam(int memoryRam) {
//        this.memoryRam = memoryRam;
//    }
//
//    public void setCamera(int camera) {
//        this.camera = camera;
//    }
}
