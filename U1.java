public class U1 extends Rocket{
    U1(int cost, int weight, int maxWeight){
        super(cost, weight, maxWeight);
    }
    public boolean hasLaunched(){
        double randomNumber =  (Math.random()*100)+1;
        double a = ((0.05*(((double)this.getCurrWeight())/this.getmaxWeight()))*100);
        return randomNumber > a;
    }
    public boolean hasLanded(){
        double  randomNumber = (Math.random()*100)+1;
        double a = ((0.01*(((double)this.getCurrWeight())/this.getmaxWeight()))*100);
        return randomNumber > a;
    }
}
