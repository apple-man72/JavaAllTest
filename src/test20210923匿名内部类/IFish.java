package test20210923匿名内部类;

//接口式匿名内部类格式
interface IFish {
    public void swim();
}

class TestIFish {

    public static void main(String[] args) {
        IFish fish = new IFish() {
            @Override
            public void swim() {
                System.out.println("我是一条小丑鱼，我在游泳");
            }
        };

        fish.swim();
    }
}
