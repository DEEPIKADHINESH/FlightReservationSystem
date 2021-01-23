public class Main {

    public static void main(String[] args) {
	// write your code here


        Contact contact1 =new Contact();
        contact1.setEmail("abc@rocketmail.com");
        contact1.setName("abc");
        contact1.setPhone("+919236793241");
        Address adr1 = new Address();
        adr1.setCity("Chennai");
        adr1.setState("TN");
        adr1.setStreet("4th Cross");
        Contact contact2 =new Contact();
        Address adr2 = new Address();
        adr2.setCity("Coimbatore");
        adr2.setState("TN");
        adr2.setStreet("5th Cross");
        contact1.setEmail("adef@rocketmail.com");
        contact1.setName("def");
        contact1.setPhone("+917774444000");
        ;





        Regularticket regularTicket = new Regularticket(
                123,"Chennai","Bangalore",
                new Flight(10,"Indigo",100),
                "12/01/2021 10:30",
                "12/01/2020 11:30",
                new Passenger(contact1,adr1),
                1,
                1050.15,
                false);
        Touristticket touristTicket = new Touristticket(
                456,"Goa","Delhi",
                new Flight(11,"Malaysia",120),
                "13/01/2021 9:30",
                "13/01/2020 11:30",
                new Passenger(contact2,adr2),
                8,
                1050,
                 false);
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {

        System.out.println("PNR Details for your flight: " + ticket.getPNR());

    }
}
