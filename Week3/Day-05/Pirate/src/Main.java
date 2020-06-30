public class Main {

    public static void main(String[] args) {
        Pirate pirate = new Pirate("Jack");
        Pirate pirate2 = new Pirate("Joe");
        Pirate pirate3 = new Pirate("Jane");
        Pirate pirate4 = new Pirate("James");
        Pirate pirate5 = new Pirate("Jockey");

        pirate.setCaptain(true);

        Ship ship = new Ship();
        ship.addPirate(pirate);
        ship.addPirate(pirate2);
        ship.addPirate(pirate3);
        ship.addPirate(pirate4);
        ship.addPirate(pirate5);
        for (int i = 0; i < ship.ship.size(); i++) {
            System.out.println(ship.ship.get(i));

        }




    }
}
