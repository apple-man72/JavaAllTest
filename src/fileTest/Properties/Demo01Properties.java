package fileTest.Properties;

import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","168");
        prop.setProperty("的丽热巴","170");
        prop.setProperty("古力娜扎","160");
        Set<String> set = prop.stringPropertyNames();
        for (String key:set
             ) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);

        }

    }
}
