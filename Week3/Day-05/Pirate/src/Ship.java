import java.util.ArrayList;

public class Ship {

    public ArrayList<Pirate> getShip() {
        return ship;
    }

    ArrayList<Pirate> ship;

    public Ship() {
        this.ship = new ArrayList<>();
    }

    public void addPirate(Pirate pirate) {
        for (int i = 0; i < ship.size(); i++) {
            ship.add(pirate);
        }
    }


}
