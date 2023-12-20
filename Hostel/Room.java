package Hostel;

public class Room {
    private int roomNum;
    private int roomType;
    private int nightsReserved;

    public int getRoomNum() {
        return roomNum;
    }
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
    public int getRoomType() {
        return roomType;
    }
    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }
    public int getNightsReserved() {
        return nightsReserved;
    }
    public void setNightsReserved(int nightsReserved) {
        this.nightsReserved = nightsReserved;
    }

    public int Income(){
        return this.nightsReserved * (this.roomType * 50);
    }
}
