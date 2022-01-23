public class U2 extends Rocket{
    U2(int c, int w, int wC){
        super(c, w, wC);
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
