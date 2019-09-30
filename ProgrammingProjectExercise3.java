// Cote_Timothy_Unit 3_Project_Exercise 3
public class ProgrammingProjectExercise3 {
    public static void main(String[] args) {
        int xC = 18;
        int xM = 34;
        int xY = 4;
        int yC = 9;
        int yM = 8;
        int yY = 6;
        double canterlotToManehatten = distance(xC, xM, yC, yM);
        double canterlotToYanhoover = distance(xC, xY, yC, yY);
        double manehattenToYanhoover = distance(xM, xY, yM, yY);
        System.out.println(canterlotToManehatten + canterlotToYanhoover + manehattenToYanhoover);
        }
    public static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
