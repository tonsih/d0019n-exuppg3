package game.general;

import game.data.ValueManager;

/**
 * This class represents a door which holds attributes such as its position
 * (direction), if the door is locked or not, if the door leads to an exit.
 *
 * <p>A Door-instance can also be connected to a Room.
 *
 * @author Toni Sihvola
 * @author Ludwig Ahnqvist
 */
public class Door
{
    /**
     * The position/direction in which the door resides in a room.
     */
    private final char position;

    /**
     * Stores the state of the door. True if locked, false otherwise.
     */
    private final boolean locked;

    /**
     * True if the door leads to an exit. False otherwise.
     */
    private final boolean exit;

    /**
     * To which room the door leads to.
     */
    private Room pointsToRoom;

    /**
     * Constructor for a Door-instance.
     *
     * @param pos The position of the door inside a room.
     * @param locked If the door is either locked or not.
     * @param exit If the door leads to an exit or not.
     * @throws Exception If the door has an invalid position.
     */
    public Door(char pos, boolean locked, boolean exit) throws Exception
    {
        if (ValueManager.charIsDirection(pos)) this.position = pos;
        else throw new IllegalArgumentException(
                "A door was not defined to be in a valid " + "position [" +
                        ValueManager.directionCommandsToString() + "]");

        this.locked = locked;
        this.exit = exit;
    }

    public Door(char pos) throws Exception
    {
        this(pos, false, false);
    }

    public Door(char pos, boolean locked) throws Exception
    {
        this(pos, locked, false);
    }

    /**
     * @return the position in which the door is in inside a room.
     */
    public char getPosition()
    {
        return this.position;
    }

    /**
     * @return "true" if door is locked, otherwise "false".
     */
    public boolean isLocked()
    {
        return this.locked;
    }

    /**
     * @return "true" if door leads to an exit, otherwise "false".
     */
    public boolean isExit()
    {
        return this.exit;
    }

    /**
     * @return A room which the door leads to.
     */
    public Room getPointsToRoom()
    {
        return this.pointsToRoom;
    }

    /**
     * A setter for connecting the door with a room.
     *
     * @param room The room to which the door is connected.
     */
    public void setPointsToRoom(Room room)
    {
        this.pointsToRoom = room;
    }
}
