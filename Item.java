public class Item {
    private String resourseName;
    private int resourseWeight;

    Item(String name, int weight){
        this.resourseName = name;
        this.resourseWeight = weight;
    }
    String getResourceName(){
        return this.resourseName;
    }
    int getResourceWeight(){
        return this.resourseWeight;
    }
}
