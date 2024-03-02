package enumTest;

import java.awt.Color;

/**
 * @author ljp * @date 2021年11月23日 13:53
 */

public class EnumTest02 {
    enum Color{
        RED,GREEN,BLUE;
    }

    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println(color);
    }
}
