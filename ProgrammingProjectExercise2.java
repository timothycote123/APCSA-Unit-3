//Cote_Timothy_Unit 3_project_exercise2
public class ProgrammingProjectExercise2 {
    public static void main(String[] args) {
        int xB = 29;
        int xM = 34;
        int yB = 16;
        int yM = 8;
        double baltimareToManehattan = distance(xB, xM, yB, yM);
        System.out.println(baltimareToManehattan); //Distance from Baltimare to manehattan
        int xL = 6;
        int xN = 22;
        int yL = 19;
        int yN = 7;
        double losPegasusToNeighagraFalls = distance(xL, xN, yL, yN);
        System.out.println(losPegasusToNeighagraFalls); //Distance from Los Pegasus to Neighagra Falls
        int xBA = 25;
        int xP = 16;
        int yBA = 24;
        int yP = 14;
        double badlandsToPonyville = distance(xBA, xP, yBA, yP);
        System.out.print(badlandsToPonyville); //Distance from Badlands to ponyville
    }
    public static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
}
        