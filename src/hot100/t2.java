package hot100;

import java.util.*;

public class t2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str:strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);//区分toString和new String
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
