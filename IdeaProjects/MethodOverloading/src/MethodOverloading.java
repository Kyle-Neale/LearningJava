public class MethodOverloading {
    public static void main(String[] args) {
        int feet = 7;
        int inches = 72;

        System.out.println(calcFeetAndInchesToCentimeters(inches));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters;
        double cmInFeet =  (feet * 12 * 2.54);
        if (feet <= 0 && (inches <= 0 || inches >= 12)) {
            return -1;
        }

        centimeters = (cmInFeet + inches * 2.54);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet = inches <= 0 ? -1 : (inches / 12);
        double remainingInches = inches % 12;

        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
