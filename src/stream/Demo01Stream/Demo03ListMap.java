package stream.Demo01Stream;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo03ListMap {
    public static void main(String[] args) {
        List<Map> orderList = new ArrayList();
        Map map = new HashMap();
        map.put("policy_no", "011");
        map.put("order_state", "01");
        orderList.add(map);
        Map map1 = new HashMap();
        map1.put("policy_no", "012");
        map1.put("order_state", "02");
        orderList.add(map1);
//        orderList=[{policy_no:011,order_state:01},
//                   {policy_no:012,order_state:02}]
        Map<String, String> orderMap = orderList.stream().collect(Collectors.toMap(s -> String.valueOf(s.get("policy_no")), s -> String.valueOf(s.get("order_state"))));
        List<String> policyNos = orderList.stream().map(u -> String.valueOf(u.get("policy_no"))).collect(Collectors.toList());
//        String policyNoStr = StringUtils.collectionToDelimitedString(policyNos, ",");
//        String policyNoStr=policyNos.toString();
        String policyNoStr = String.join(",",policyNos);
        System.out.println(policyNoStr);
        System.out.println(orderMap);
        System.out.println("请求参数 加密前 policyNo==" + policyNos);
    }
}
