import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String string = "Hello Hello bye Hello bye Inno";
        String[] words = string.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            if (!hashMap.containsKey(word)) {
                hashMap.put(word, 1);
            } else {
                Integer i = hashMap.get(word);
                i++;
                hashMap.put(word, i);
            }
        }
        Set<String> keySet = hashMap.keySet();
        int count = 0;
        String mostOften = "";
        for (String word : keySet) {
            if (count < hashMap.get(word)) {
                count = hashMap.get(word);
                mostOften = word;
            }
        }
        System.out.println(mostOften + " " + count);
    }
}