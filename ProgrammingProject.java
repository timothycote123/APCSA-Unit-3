public class ProgrammingProject {
    public static void main(String[] args) {
        double diameter = 2.0;
        double circumference = roadTrip(diameter);
        roadTrip(diameter);
        System.out.print(circumference);
    }
    public static double roadTrip(double diameter) {
        return Math.PI * diameter;
    }
}
        
        