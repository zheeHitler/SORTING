import java.util.Hashtable;
import java.util.Enumeration;

public class HashTable {
 
 public static void main(String[] args) {
 
   Enumeration names;
   String key;
 
   // Creating a Hashtable
   Hashtable<String, String> hashtable = 
              new Hashtable<String, String>();
 
   // Adding Key and Value pairs to Hashtable
   hashtable.put("Key1","ZHEERAH");
   hashtable.put("Key2","FAHMI");
   hashtable.put("Key3","DIANA");
   hashtable.put("Key4","AMJAD");
   hashtable.put("Key5","ALI");
 
   names = hashtable.keys();
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " +
      hashtable.get(key));
   }
 }
}

