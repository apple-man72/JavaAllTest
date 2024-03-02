package test20210923匿名内部类;

//参数式的匿名内部类
public class TestCrucian {

    public static void main(String[] args) {
        Crucian c = new Crucian();
        c.swim(new IFish() {
            @Override
            public void swim() {
                System.out.println("鲫鱼在河水里游泳！");
            }

        });
    }
}

class Crucian {
    /**
     * 鲫鱼的游泳方法
     *
     * @param fish
     */
    void swim(IFish fish) {
        fish.swim();
    }
}
