import java.text.ParseException;
import java.util.*;

public class hashMapExample {

    public static void main(String[] args) throws ParseException {
        // english French dictionary

        HashMap<String,String> engFrenchDictionary = new HashMap<String, String>();
        // Putting things inside our dictionary

        engFrenchDictionary.put("Monday", "Lundi");
        engFrenchDictionary.put("Tuesday", "Mardi");
        engFrenchDictionary.put("Wednesday", "Mercredi");
        engFrenchDictionary.put("Thursday", "Jeudi");
        engFrenchDictionary.put("Friday", "Vendredi");
        engFrenchDictionary.put("Satuday", "Samedi");
        engFrenchDictionary.put("Dimanche", "Sunday");
        System.out.println("---------------------------");
        System.out.println("HashMap before sorting, random order");
        System.out.println("---------------------------");
        Set<Map.Entry<String, String>> entries = engFrenchDictionary.entrySet();
        for (Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey() +  "==>" + entry.getValue());
        }
        TreeMap<String, String> sorted = new TreeMap<>(engFrenchDictionary);
        Set<Map.Entry<String,String>> mappings = sorted.entrySet();
        System.out.println("---------------------------");
        System.out.println("HashMap after sorting by keys");
        System.out.println("---------------------------");

        for (Map.Entry<String,String> mapping: mappings){
            System.out.println(mapping.getKey() + "==>" + mapping.getValue());
        }

        Comparator<Map.Entry<String,String>> valueComparator = new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                String v1 = o1.getValue();
                String v2 = o2.getValue();
                return v1.compareTo(v2);
            }
        };

        List<Map.Entry<String, String>> listOfEntries = new ArrayList<Map.Entry<String, String>>(entries);

        Collections.sort(listOfEntries, valueComparator);

        LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>(listOfEntries.size());

        for (Map.Entry<String, String> entry : listOfEntries) {
            sortedByValue.put(entry.getKey(), entry.getValue());

        }
        System.out.println("---------------------------");
        System.out.println("hashmap after sorting entries");
        System.out.println("---------------------------");
        Set<Map.Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet();

        for(Map.Entry<String, String> mapping : entrySetSortedByValue) {
            System.out.println(mapping.getKey() + "==>" + mapping.getValue());
        }
    }


}
