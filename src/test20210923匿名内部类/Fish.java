package test20210923匿名内部类;

//继承式匿名内部类格式
public class Fish {
    /**
     * 游泳方法
     */
    public void swim() {
        System.out.println("我在游泳!");
    }

    public static void main(String[] args) {
        //创建鱼对象
        Fish fish = new Fish() {
            //重写swim方法
            public void swim() {
                System.out.println("我在游泳，突然发生海啸，我撤了!");
            }
        };

        fish.swim();
    }
}