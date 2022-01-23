public class U2 extends Rocket{
    U2(int cost, int weight, int maxWeight){
        super(cost, weight, maxWeight);
    }

    public boolean hasLaunched(){
        int randomNumber = (int) (Math.random()*100)+1;
        int a = (int) ((0.04*(((double)this.getCurrWeight())/this.getmaxWeight()))*100);
        return randomNumber > a;
    }
    public boolean hasLanded(){
        int  randomNumber = (int) (Math.random()*100)+1;
        int a = (int) ((0.08*(((double)this.getCurrWeight())/this.getmaxWeight()))*100);
        return randomNumber > a;
    }
}
