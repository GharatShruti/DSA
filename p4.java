import java.util.HashMap;

public class p4 {
    public static void main(String[] args){
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("Shruti", 1);
        myMap.put("Bhushan", 2);
        myMap.put("Gharat", 1);
        for(String myKey: myMap.keySet()){
            System.out.println(myKey);
            
        }
        System.out.println(myMap);


    }
}
