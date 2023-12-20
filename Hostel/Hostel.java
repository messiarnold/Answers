package Hostel;

public class Hostel {
    Room[] allRooms = new Room[200];


    public int orderRoom(int type,int nights){
        for(int i = 0;i < 200;i++){
            if(allRooms[i].getNightsReserved() == 0 && allRooms[i].getRoomType() == type){
                allRooms[i].setNightsReserved(nights);
                return allRooms[i].getRoomNum();
            }
        }
        return -1;
    }

    public int[] floorIncome(){
        int[] income = new int[3];
        for (int i = 0; i < 3; i++) {
            income[i] = 0;
        }
        for(int i = 0;i < 200;i++){
            income[(allRooms[i].getRoomNum() / 100) - 1] += allRooms[i].Income();    
        }
        return income;
    }
}
