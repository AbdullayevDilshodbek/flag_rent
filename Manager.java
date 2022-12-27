import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Manager {

    private Map<String, Flat> flatMap = new TreeMap<>();
    private Map<Integer, Client> clientMap = new TreeMap<>();
    private Map<String, Booking> bookingMap = new TreeMap<>();

    /*
     * Add new Flat
     */
    public Flat newFlat(String code, int surface, int[] tariffs) {
        Flat flat = new Flat(code, surface, tariffs);
        this.flatMap.put(code, flat);
        return flat;
    }

    /*
     * Find flat by flat code
     */
    public Flat getFlat(String code){
        return this.flatMap.get(code);
    }

    /*
     * Add new client
     */
    public Client newClient(String firstName, String lastName, int id){
        Client client = new Client(firstName, lastName, id);
        this.clientMap.put(id, client);
        return client;
    }

    /*
     * Find client by id
     */
    public Client getClient(int id){
        return this.clientMap.get(id);
    }

    /*
     * Show all clients
     */
    public Collection<Client> getClients(){
        return this.clientMap.values();
    }

    /*
     * Make new order to flat
     */
    public Booking bookFlat(String flatCode, int clientId, int comeDay, int comeMonth, int comeYear, int rentWeek){
        Booking booking = new Booking(flatCode, clientId, comeDay, comeMonth, comeYear, rentWeek);
        bookingMap.put(flatCode + clientId, booking);
        return booking;
    }

    public Booking getBooking(String flatCode, int clientId){
        return bookingMap.get(flatCode + clientId);
    }

    /*
     * Get price of booking
     */
    public Integer getPrice(Booking booking){
        int day = booking.getComeDay();
        int month = booking.getComeMonth();
        int rentWeek = booking.getRentWeek();
        Flat flat = booking.getFlat();
        int tariff = flat.getTariff(day, month);
        return tariff * rentWeek;
    }
}
