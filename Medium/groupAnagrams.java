package Medium;

import java.util.*;

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){
            int[] count = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                count[strs[i].charAt(j) - 'a']++;
            }
            List<String> s = hm.getOrDefault(Arrays.toString(count), new ArrayList<>());
            s.add(strs[i]);
            hm.put(Arrays.toString(count), s);
        }
        return new ArrayList<>(hm.values());
    }
}
