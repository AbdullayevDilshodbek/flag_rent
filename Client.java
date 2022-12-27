public class Client {
    private String firstName;
    private String lastName;
    private int id;

    public Client(){

    }

    public Client(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.id;
    }
}
