package FleetOfThings;


public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        fleet.add(new Thing("Get milk"));
        fleet.add(new Thing("Remove obstacles"));

        Thing standUp = new Thing ("StandUp");
        standUp.complete();;
        fleet.add(standUp);

        Thing eatLunch = new Thing ("Eat Lunch");
        eatLunch.complete();
        fleet.add(eatLunch);

        System.out.println(fleet);
    }
}