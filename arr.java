import java.util.ArrayList;

public class arr{

      static public void change_array_place(String[] curr_array ,int first_place ,int second_place) {
        String  swap_local1;
        String  swap_local2;

        swap_local1             = curr_array[first_place];
       // swap_local2             = curr_array[second_place];
        curr_array[first_place] = curr_array[second_place];
        curr_array[second_place]=swap_local1;

     }
     static public  ArrayList arrToArrList(String[] curr_array){
        ArrayList<String> currList = new ArrayList<String>();

        for (int loop=0; loop<curr_array.length; loop++ ){
            currList.add(curr_array[loop]);
        }

         System.out.println(currList);

        return currList;
     }

    public static void main(String [ ] args){

            ArrayList arrayList;

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        change_array_place(cars,1,2);


        for (int loop=0; loop<cars.length; loop++){

            System.out.println(cars[loop]);

        }

        arrayList=arrToArrList(cars);

        System.out.println(arrayList);


        fruit fruit1 = new fruit("apple");
        fruit fruit2 = new fruit("apple");
        fruit fruit3 = new fruit("apple");

        fruit fruit4 = new fruit("orange");
        fruit fruit5 = new fruit("orange");
        fruit fruit6 = new fruit("orange");

        box boxapple  = new box("box_apple");
        box boxorange = new box("box_orange");

        boxapple.putfruit(fruit1);
        boxapple.putfruit(fruit2);
        boxapple.putfruit(fruit3);

        boxorange.putfruit(fruit4);
        boxorange.putfruit(fruit5);
        boxorange.putfruit(fruit6);

        System.out.println(boxapple.getWeight());
        System.out.println(boxorange.getWeight());

    }
}
