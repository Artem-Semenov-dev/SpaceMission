import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Simulation {
    public ArrayList<Item> loadItems(String path) throws Exception{
        File file = new File(path);
        Scanner scannerf = new Scanner(file);
        String resource;
        String [] mass;
        String name;
        int weight;
        ArrayList<Item> list = new ArrayList<Item>();
        while(scannerf.hasNextLine()){
            resource = scannerf.nextLine();
            mass = resource.split("=");
            name = mass[0];
            weight = Integer.parseInt(mass[1]);
            Item item = new Item(name, weight);
            list.add(item);
        }
        return list;
    }
    private int search(ArrayList<Item> list, int lefts){
        for (int j = 0; j < list.size(); j++){
            if (list.get(j).getResourceWeight() == lefts)  
                return j;     
        }
        return -1;
    }
    public ArrayList<Rocket> loadU1(ArrayList<Item> list){
        ArrayList<Rocket> rocketList = new ArrayList<Rocket>();
        boolean check = false;
        while (list.size() != 0){
            U2 newRock = new U2(100, 10000, 18000);
            check = false;
            while (check == false && list.size() > 0){
                int lefts = newRock.getmaxWeight() - newRock.getCurrWeight();
                int ind = search(list, lefts);
                if (ind != -1){
                    newRock.carry(list.get(ind));
                    list.remove(ind);
                }
                else if (newRock.canCarry(list.get(0))){
                    newRock.carry(list.get(0));
                    list.remove(0);
                }
                else{
                    check = true;
                }
            }    
            rocketList.add(newRock);
        }
        return rocketList;
    }
    public ArrayList<Rocket> loadU2(ArrayList<Item> list){
        ArrayList<Rocket> rocketList = new ArrayList<Rocket>();
        boolean check = false;
        while (list.size() != 0){
            U2 newRock = new U2(120, 18000, 29000);
            check = false;
            while (check == false && list.size() > 0){
                int lefts = newRock.getmaxWeight() - newRock.getCurrWeight();
                int ind = search(list, lefts);
                if (ind != -1){
                    newRock.carry(list.get(ind));
                    list.remove(ind);
                }
                else if (newRock.canCarry(list.get(0))){
                    newRock.carry(list.get(0));
                    list.remove(0);
                }
                else{
                    check = true;
                }
            }    
            rocketList.add(newRock);
        }
        return rocketList;
    }
    public int runSimulation(ArrayList<Rocket> list){
        int budget = 0;
        for (int i = 0; i < list.size(); i++){
            budget += list.get(i).getCost();
            if (!list.get(i).hasLaunched() || !list.get(i).hasLanded()){
                budget += list.get(i).getCost();
                i--;
            }
        }
        return budget;
    }
}
