 import java.util.*;
class Basic {
public static void main(String[] args) {
HashMap<String,Integer> Country = new HashMap<>();
Country.put("India",120);
Country.put("US",40);
Country.put("China",30);
Country.put("Japan",60);

System.out.println(Country);
System.out.println(Country.get("Japan"));
System.out.println(Country.containsKey("India"));
System.out.println(Country.containsValue(30));
System.out.println(Country.containsValue(120));
}
}