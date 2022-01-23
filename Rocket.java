public class Rocket implements SpaceShip { 
    private int cost;
    private int weight;
    private int maxWeight;
    private int currWeight;
    
    Rocket(){
        this.cost = 0;
        this.weight = 0;
        this.maxWeight = 0;
        this.currWeight = 0;
    }
    Rocket(int cost, int weight, int maxW){
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxW; 
        this.currWeight = weight;
    }
    public int getCost(){
        return this.cost;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getmaxWeight(){
        return this.maxWeight;
    }
    public int getCurrWeight(){
        return this.currWeight;
    }
    private void setCurrWeight(int newWeight){
        this.currWeight = newWeight;
    }
    public boolean hasLaunched(){
        return true;
    }
    public boolean hasLanded(){
        return true;
    }
    @Override
    public boolean canCarry(Item item){
        if (getCurrWeight()+(item.getResourceWeight()) <= getmaxWeight()){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public void carry(Item item){
        int newWeight = getCurrWeight() + (item.getResourceWeight());
        setCurrWeight(newWeight);
    }

}
