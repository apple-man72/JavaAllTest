package suanFa.leeCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 旅行终点站 {

    public static void main(String[] args) {
//        [["pYyNGfBYbm","wxAscRuzOl"],["kzwEQHfwce","pYyNGfBYbm"]]
        List<String> a = new ArrayList<>();
        a.add("pYyNGfBYbm");
        a.add("wxAscRuzOl");
        List<String> b = new ArrayList<>();
        b.add("kzwEQHfwce");
        b.add("pYyNGfBYbm");
        List<List<String>> paths = new ArrayList<>();
        paths.add(a);
        paths.add(b);
        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < paths.size(); i++) {
            map.put(paths.get(i).get(0), paths.get(i).get(1));

        }
        for (String s : map.values()) {
            if (!map.containsKey(s)) {
                return s;
            }
        }
        return null;
    }
}
