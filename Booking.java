public class Booking {
    private String flatCode;
    private int clientId;
    private int comeDay;
    private int comeMonth;
    private int comeYear;
    private int rentWeek;

    public String getFlatCode() {
        return flatCode;
    }

    public int getClientId() {
        return clientId;
    }

    public int getComeDay() {
        return comeDay;
    }

    public int getComeMonth() {
        return comeMonth;
    }

    public int getComeYear() {
        return comeYear;
    }

    public int getRentWeek() {
        return rentWeek;
    }

    public Manager getManager() {
        return manager;
    }

    private Manager manager = new Manager();

    public Booking(){

    }

    public Booking(String flatCode, int clientId, int comeDay, int comeMonth, int comeYear, int rentWeek) {
        this.flatCode = flatCode;
        this.clientId = clientId;
        this.comeDay = comeDay;
        this.comeMonth = comeMonth;
        this.comeYear = comeYear;
        this.rentWeek = rentWeek;
    }

    /*
     * Get customer of booking
     */
    public Client getClient(){
        return this.manager.getClient(this.clientId);
    }

    /*
     * Get flat of booking
     */
    public Flat getFlat(){
        return this.manager.getFlat(this.flatCode);
    }
}
