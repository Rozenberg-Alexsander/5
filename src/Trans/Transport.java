package Trans;

public class Transport {
    String type = "none";
    public int publicVal = 0;
    protected int protectedVal = 0;
    int defVal = 0;
    private int privateVal = 0;

    public void someMetod() {
        publicVal = 10;
        protectedVal = 10;
        publicVal = 10;
        defVal = 10;
    }

}
