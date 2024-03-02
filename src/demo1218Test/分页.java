package demo1218Test;


import java.util.ArrayList;
import java.util.List;

public class 分页 {
    public static List getPageContentByApi(int pageNo, int pageSize) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");  //[a,b,c,d,e,f,g]
        //总记录数
        int total = list.size(); //total= 25  pageNo=2  pageSize=10
        // 开始索引
        int fromIndex = (pageNo - 1) * pageSize;   //开始索引=10
        // 结束索引
        int toIndex = fromIndex + pageSize;             //结束索引=20
        // 如果结束索引大于集合的最大索引，那么规定结束索引=集合大小
        if (toIndex > total) {
            toIndex = total;
            List<String> subList = list.subList(fromIndex, toIndex);
            return subList;
        }
        if (fromIndex <= total) {
            List<String> subList = list.subList(fromIndex, toIndex);
            return subList;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getPageContentByApi(1, 2));

    }
}