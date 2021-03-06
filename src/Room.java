import puzzles.Puzzle;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

public class Room implements Serializable {
    /**
     * Author: Kelan McNally
     */
    @Serial
    private static final long serialVersionUID = 638851069751677125L;
    //Author: Kelan McNally
    public ArrayList<Item> items = new ArrayList<>();
    private int roomID = -1;
    private String roomName = "Empty";
    private String roomDesc = "This is an empty Rooms class";
    private int north = -1;
    private int east = -1;
    private int south = -1;
    private int west = -1;
    private boolean visitedRoom = false;
    private Puzzle puzzle = null;
    private Monster monster;


    public Room(int roomID, String roomName, String roomDesc, int north, int east, int south, int west) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomDesc = roomDesc;
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }

    public Room() {

    }

    public void addItem(Item temp) {
        items.add(temp);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }

    public int getNorth() {
        return north;
    }

    public void setNorth(int north) {
        this.north = north;
    }

    public int getSouth() {
        return south;
    }

    public void setSouth(int south) {
        this.south = south;
    }

    public int getEast() {
        return east;
    }

    public void setEast(int east) {
        this.east = east;
    }

    public int getWest() {
        return west;
    }

    public void setWest(int west) {
        this.west = west;
    }

    public boolean getVisitedRoom() {
        return visitedRoom;
    }

    public void setVisitedRoom(boolean visitedRoom) {
        this.visitedRoom = visitedRoom;
    }

    //Jeremy Stiff
    public Monster getMonster() {
        return monster;
    }

    //Jeremy Stiff
    public void addMonster(Monster monster) {
        this.monster = monster;
    }

    // SK
    public Puzzle getPuzzle() {
        return puzzle;
    }

    // SK
    public void setPuzzle(Puzzle puzzle) {
        this.puzzle = puzzle;
    }

    // SK
    public void resetPuzzle() {
        if (this.getPuzzle() != null) {
            this.puzzle.reset();
        }
    }

    @Override
    public String toString() {
        return getRoomID() + " " + getRoomName() + "\n" + getRoomDesc();
    }

    //Jeremy Stiff
    public boolean hasMonster() {
        return monster != null;
    }

    public boolean hasPuzzle() {
        return this.getPuzzle() != null && this.getPuzzle().getAttemptLeft() > 0;
    }

    public boolean hasItem() {
        // TODO is item here?
        return !items.isEmpty();
    }

    public void displayItems() {
        System.out.println(items.toString());
    }


}
