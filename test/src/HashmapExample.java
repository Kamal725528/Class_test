import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
    public static void main(String[] arg){
        HashMap<String, Integer> map=new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);

        System.out.println("element in hashmap ");
        for(HashMap.Entry m:map.entrySet()){
            System.out.println(m);
        }
        map.remove("five");

        System.out.println("updated element ");
        for(HashMap.Entry m:map.entrySet()){
            System.out.println(m);
        }
        map.replace("six",2);
        map.replace("one",1,100);

        System.out.println("after replacing ");
        for(HashMap.Entry m:map.entrySet()){
            System.out.println(m);
        }

        System.out.println(map.containsValue(4));
        System.out.println(map.containsKey("three"));

      HashMap<String, Integer> newMap;
      newMap=(HashMap<String, Integer>) map.clone();

        System.out.println("new map data is :");
           for(Map.Entry m: newMap.entrySet()){
               System.out.println(m);
           }


        System.out.println("size of hashmap is :" +map.size());
        map.clear();
        System.out.println("after clearing size is: "+ map.size());


    }

}
