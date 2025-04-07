class Hotel {
    private String guestName;
    private String roomType;
    private int nights;
    public Hotel(String guestName,String roomType, int  nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public Hotel(Hotel other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    public String getguestName() {
        return guestName;
    }
    public String getroomType() {
        return roomType;
    }
    public void setguestName(String guestName) {
        this.guestName = guestName;
        
    }
    public void setroom(String roomType) {
        this.roomType = roomType;
    }
    @Override
    public String toString() {
        return "Hotel manager {guest =" + guestName + ", room=" + roomType + " Night = " + nights + "}";
    }
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Alan", "Single", 3);
        Hotel hotel2 = new Hotel(hotel1);
        
        System.out.println("Original: " + hotel1);
        System.out.println("Copy: " + hotel2);
    }
}
