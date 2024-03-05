import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashing{
    public static void main(String[] args) {
        

        //creations of hashmap
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India", 120);
        map.put("China", 119);
        map.put("USA", 30);
        map.put("New Zealand", 20);

        //search / look up
        //check id elem exist or not
        if(map.containsKey("China")){
            System.out.println("China is present");
        } else{
            System.out.println("key is not present");
        }

        // agar elem mil gya to value print krega
        System.out.println((map.get("China")));
        System.out.println(map.get("India"));
        System.out.println();
        System.out.println();




        //Iteration
        for(Map.Entry <String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println();
        System.out.println();



        // only iterate for keys
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+ " " + map.get(key));
        }

        System.out.println();



        




    }

}