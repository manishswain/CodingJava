package RandomPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteration 
{
    public static void main(String[] args)
    {
        Map<Integer,String> fruitMap=new HashMap<Integer,String>();
        fruitMap.put(1, "Mango");
        fruitMap.put(2, "Apple");
        fruitMap.put(3, "Banana");
        fruitMap.put(4, "Orange");
        //keyIteration(fruitMap);
        //entryIteration(fruitMap);
        entrySetMap(fruitMap);
        //streams(fruitMap);
        //forEachLoop(fruitMap);
        
        
        
    }	

    private static void forEachLoop(Map<Integer, String> fruitMap) 
    {
        fruitMap.forEach((key,value)-> System.out.println(key + " "+ value));
    }

    private static void streams(Map<Integer, String> fruitMap) 
    {
        fruitMap.entrySet().stream().forEach(e -> System.out.println(e.getKey()+ " "+ e.getValue()));
    }

    private static void entrySetMap(Map<Integer, String> fruitMap) 
    {
        for (Entry <Integer, String> entry : fruitMap.entrySet()) 
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    private static void entryIteration(Map<Integer, String> fruitMap) 
    {
        Iterator<Map.Entry<Integer,String>> itr=fruitMap.entrySet().iterator();

        while(itr.hasNext())
        {
            Entry<Integer,String> entry=itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    private static void keyIteration(Map<Integer, String> fruitMap) 
    {
        for (Integer fruitId : fruitMap.keySet()) 
        {
            System.out.println(fruitId + " " +fruitMap.get(fruitId));    
        }
    }    
}
