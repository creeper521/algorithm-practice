package hot100;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class t2 {
    //排序
//    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String, List<String>> map = new HashMap<String, List<String>>();
//        for (String str:strs) {
//            char[] array = str.toCharArray();
//            Arrays.sort(array);
//            String key = new String(array);//区分toString和new String
//            List<String> list = map.getOrDefault(key, new ArrayList<String>());
//            list.add(str);
//            map.put(key, list);
//        }
//        return new ArrayList<List<String>>(map.values());
//    }
    //计数（官方优化版）
//    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String, List<String>> map = new HashMap<>();
//        for (String str : strs) {
//            int[] counts = new int[26];
//            for (char c : str.toCharArray()) {
//                counts[c - 'a']++;
//            }
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < 26; i++) {
//                if (counts[i] != 0) {
//                    sb.append((char) ('a' + i)).append(counts[i]);
//                }
//            }
//            String key = sb.toString();
//            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
//        }
//        return new ArrayList<>(map.values());
//    }
    //抽象
//    public List<List<String>> groupAnagrams(String[] strs) {
//        // str -> intstream -> sort -> collect by StringBuilder
//        return new ArrayList<>(Arrays.stream(strs).collect(Collectors.groupingBy(str -> str.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString())).values());
//    }

    public List<List<String>> groupAnagrams(String[] strs) {
        // str -> split -> stream -> sort -> join
        return new ArrayList<>(Arrays.stream(strs).collect(Collectors.groupingBy(str -> Stream.of(str.split("")).sorted().collect(Collectors.joining()))).values());
    }

}
