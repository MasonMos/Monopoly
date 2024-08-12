public class Player {
    Integer location;
    String name;
    public Integer getLocation() {
        return location;
    }
    public String getName() {
        return name;
    }
    public void movePiece(Integer numSpaces) {
        location += numSpaces;
    }
}
