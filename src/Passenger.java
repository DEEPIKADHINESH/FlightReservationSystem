public class Passenger {
    private static int idCounter = 0;
    private int passengerId;
    private Contact contact;
    private Address address;

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPassengerCount() {
        return this.idCounter;
    }

    public Passenger (Contact contact, Address address) {
        idCounter ++;
        this.passengerId = idCounter;
        this.contact = contact;
        this.address = address;
    }
}
