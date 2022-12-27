public class Main {
    public static void main(String[] args) {
        System.out.println("....");
        Manager manager = new Manager();
        /*
         * Created clients
         */
        manager.newClient("Don", "Gangster", 1);
        manager.newClient("Don2", "Gangster2", 2);

        /*
         * Created flats
         */
        manager.newFlat("a1", 20, new int[] { 300, 200, 100 });
        manager.newFlat("a2", 30, new int[] { 400, 300, 150 });

        /*
         * Created orders to flats
         */
        manager.bookFlat("a1", 1, 7, 7, 2015, 1);
        manager.bookFlat("a2", 1, 12, 12, 2015, 1);

        /*
         * check booking price
         */
        Booking booking = manager.getBooking("a1", 1);
        System.out.println(Integer.toString(manager.getPrice(booking)));
    }
}