package models;

public class HotelManagementSystem {
//hotelName	location	starRating	roomTypes	avg.GuestRating
//Grand Plaza Hotel	Downtown	4	Single, Double, Suite	4.5
    private String hotelName;
    private String location;
    private int startRating;
    private String roomTypes;
    private double avgGuestRating;

    public HotelManagementSystem(String hotelName, String location, int startRating, String roomTypes, double avgGuestRating) {
        this.hotelName = hotelName;
        this.location = location;
        this.startRating = startRating;
        this.roomTypes = roomTypes;
        this.avgGuestRating = avgGuestRating;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStartRating() {
        return startRating;
    }

    public void setStartRating(int startRating) {
        this.startRating = startRating;
    }

    public String getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(String roomTypes) {
        this.roomTypes = roomTypes;
    }

    public double getAvgGuestRating() {
        return avgGuestRating;
    }

    public void setAvgGuestRating(double avgGuestRating) {
        this.avgGuestRating = avgGuestRating;
    }
}
