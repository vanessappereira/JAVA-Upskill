package IndependentWork6.ex1_playlist;

public class Music {
    //Criteria
    private String name;
    private int duration;

    public Music(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    /*      SETS    */
    public void setName(String name) {
        this.name = name;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    /*      GETS    */
    public String getName() {
        return name;
    }
    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return  "Music: \n" +
                "Name: " + getName() + "| Duration: "+ getDuration();
    }
}
