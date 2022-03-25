import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

     class NameCom implements Comparator<String> {
        @Override
        public int compare(String a, String b){
            return a.compareTo(b);
        }
    }
    public class SortKey {
        public static void main(String[] args) {
            Map<String, String> map = new TreeMap<>(new NameCom());
            map.put("SriRam", "EcE");
            map.put("Nani","CSE");
            map.put("Ravi", "EEE");
            map.forEach((k,v)-> System.out.println(k +" "+v));
        }
}
