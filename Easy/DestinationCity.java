package Easy;

import java.util.*;

class DestinationCity {
    public String destCity(List<List<String>> paths) {
        HashSet<String> s = new HashSet();
        for(int i = 0; i < paths.size();i++){
            s.add(paths.get(i).get(0));
        }

        for(int i = 0; i < paths.size();i++){
            if(!s.contains(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }
        return "";
    }
}