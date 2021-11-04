public class Spider extends Animal{
    @Override
    protected int Animal(int legs) {
        return super.Animal(8);
    }
    public void eat(){
        System.out.println("La araña come moscas");
    }

    @Override
    public void walk() {
        Animal(8);
        System.out.print("La araña ");
        super.walk();
    }
}
