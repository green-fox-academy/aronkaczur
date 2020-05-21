public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours= (14);
        int currentMinutes = (34);
        int currentSeconds = (42);
        int totalSeconds = (24*60*60);
        int currentTimeSec = (currentHours * currentMinutes + currentSeconds);
        System.out.println("You have " + (totalSeconds-currentTimeSec) + " sec left from the day" );
    }
    }

