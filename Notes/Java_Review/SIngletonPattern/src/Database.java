public class Database {
    private String name;
    private static Database instance;


    /**
     * A Function that synchoniziously creates a database- as to prevent 2 instance from being instantiated from
     * parallel threads simultaneously
     * @param name
     * @return
     */
    public static synchronized Database getInstance(String name){
        if (null == instance) {
            instance = new Database(name);
            return instance;
        }; return instance;
    }
    private Database(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}
