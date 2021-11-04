public class TestAnimal {
    public static void main(String args[]){
        Fish d = new Fish();
        Cat c = new Cat();
        Animal a = new Fish();
        Animal e = new Spider();
        Cat p = new Cat();


        d.eat();
        d.play();
        d.walk();
        System.out.println();
        c.Cat("Fluffy");
        c.eat();
        c.play();
        System.out.println();
        a.eat();
        a.walk();
        System.out.println();
        e.eat();
        e.walk();
        System.out.println();
        p.play();
        System.out.println();
        d.eat();
        d.play();

    }
}
