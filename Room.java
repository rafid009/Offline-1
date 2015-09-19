package TestStudent;

/**
 * Created by MdRafid on 9/18/2015.
 */
public class Room {
    private String hallName;
    private int roomNo;
    private boolean status;

    public Room()
    {
        hallName = "";
        roomNo = 0;
        status = false;
    }

    public Room(String hall, int no)
    {

        hallName = hall;

        roomNo = no;

        status = false;

    }

    public Room(String hall, int no, boolean stat)
    {

        hallName = hall;

        roomNo = no;

        status = stat;

    }

    public String getHallName()
    {

        return hallName;

    }

    public void setHallName(String hall)
    {

        hallName = hall;

    }

    public int getRoomNo()
    {

        return roomNo;

    }

    public void setRoomNo(int no)
    {

        roomNo = no;

    }

    public boolean getStatus()

    {
        return status;
    }

    public void setStatus(boolean stat)

    {
        status = stat;
    }

    public void print()
    {
        if(getStatus())
        {
           System.out.println("Room No, "+ getRoomNo()+" of "+getHallName()+" Hall is currently alloted.");
        }
        else
        {
            System.out.println("Room No, " + getRoomNo() + " of " + getHallName() + " Hall is currently available for allotment.");
        }
    }


}
