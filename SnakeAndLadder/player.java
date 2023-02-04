public class player {
    String name;
    int location;

    player(String name, int location) {
        this.name = name;
        this.location = location;
    }

    public void setlocation(int newLoc) {
        location = newLoc;
    }

    public int getLocation() {
        return location;
    }
}
