public class SecondsMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3600));
    }
    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value.";
        }
        long currentSecond = seconds % 60;
        long currentMinutes = minutes % 60;
        long totalHours = minutes / 60;
        long currentHour = totalHours % 24;
        return totalHours + "h " + currentMinutes + "m " + seconds + "s";
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value.";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
