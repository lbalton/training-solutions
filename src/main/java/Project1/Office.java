package Project1;


import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){

        this.meetingRooms.add(meetingRoom);

    }

    public void printNames(){

    }

    public void printNamesReverse(){

    }

    public void eventNames(){

    }

    public void printAreas(){

    }

    public void printMeetingRoomsWithName(String name){

        if (name.equals(null) || name.equals(" ")){
            throw new IllegalArgumentException("Kötelző nevet megadni!");
        }

        for (int x = 0; x < meetingRooms.size();x++){
            if (meetingRooms.get(x).equals(name)){
                System.out.println(meetingRooms.get(x).getLength()+ " " +meetingRooms.get(x).getName()+ " " +meetingRooms.get(x).getWidth());
            }
            else System.out.println("Nincs ilyen tárgyaló!");
        }
    }

    public void printMeetingRoomsContains(){
        System.out.println(meetingRooms);

    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void printAreasLargerThan(int area) {
        System.out.println("printAreasLargerThan");
        for (MeetingRoom meetingRoom: meetingRooms) {
            if (meetingRoom.getArea() > area) {
                System.out.println(meetingRoom.getName() +" (" + meetingRoom.getWidth()
                        + " * "  + meetingRoom.getLength() + " = " + meetingRoom.getArea() + ")");
            }
        }
    }

}
