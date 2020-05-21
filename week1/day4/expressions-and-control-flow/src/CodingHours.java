public class CodingHours {
    public static void main(String[] args) {
        int week = 17;
        int hours = 6;
        int weekDays = 5;
        int dayHours = 24;
        double weeklyCode = 30;
        double learningHours = 52;
        int total = week*weekDays*dayHours;
        int gfhours = week * weekDays * hours;
        double percent = weeklyCode / learningHours * 100;

        System.out.println("You spending " + gfhours+ " hours during a semester.");
        System.out.println("You are coding around " + percent + "% of your course" );



    }
}
