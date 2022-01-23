import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Simulation simulation = new Simulation();
        ArrayList<Item> phase1 = new ArrayList<Item>();
        ArrayList<Item> phase2 = new ArrayList<Item>();
        ArrayList<Rocket> listPhase1 = new ArrayList<Rocket>();
        ArrayList<Rocket> listPhase2 = new ArrayList<Rocket>();
        phase1 = simulation.loadItems("D:/Java_coding/SpaceMission/src/Phase1.txt");
        phase2 = simulation.loadItems("D:/Java_coding/SpaceMission/src/Phase2.txt");
        listPhase1 = simulation.loadU1(phase1);
        listPhase2 = simulation.loadU1(phase2);
        int a = simulation.runSimulation(listPhase2);
    }
}
