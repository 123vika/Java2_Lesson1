import java.util.ArrayList;

public class box {
    String box_name;
    ArrayList<fruit> nameList = new ArrayList<fruit>();

    boolean can_apple=true;
    boolean can_orange=true;


    public box(String box_name) {
        this.box_name = box_name;
    }

    public void putfruit(fruit fruit){

        if (fruit.fruit_name=="apple"&&can_apple==true){
            nameList.add(fruit);
            can_orange=false;
        }
        else if (fruit.fruit_name=="orange"&&can_orange==true){
            nameList.add(fruit);
            can_apple=false;
        }


    }

    public float getWeight(){

                if (nameList.get(0).fruit_name=="apple"){
                    return (float) 1.0*nameList.size();
                }
                else{
                    return (float) 1.6*nameList.size();
                }
    };



}
