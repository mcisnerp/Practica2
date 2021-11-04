public abstract class Animal {

    protected int legs;

    protected  int Animal(int legs){
        return this.legs=legs;
    }

    public void walk(){
        System.out.println(" camina con "+legs+" patas");
    }

    public abstract void eat();

}
