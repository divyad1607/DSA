import java.util.*;
class ArrayListDemo{
   public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();

    //Add Elements
    list.add(0);
    list.add(2);
    list.add(3);

    System.out.println(list);

    //Get Elements
    int element = list.get(0);
    System.out.println(element);
    
    //Add Elements
    list.add(1,1);
    System.out.println(list);

    //Set Element
    list.set(0,5);
    System.out.println(list);

    //delete Element
    list.remove(3);
    System.out.println(list);

    //size
    int size = list.size();
    System.out.println(size);

    //loops
    for(int i =0;i < list.size();i++){
        System.out.println(list.get(i));
    }

    //sorting
    Collections.sort(list);
    System.out.println(list);
}
}