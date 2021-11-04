public class Cat extends Animal implements Pet{

    public String name;

    public void Cat(String name){
        super.Animal(4);
    }

    public void Cat(){
        Cat("");
    }

    public void eat(){
        System.out.println("El gato come ratones");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        return this.name= name;
    }

    @Override
    public void play(){
        System.out.println("El gato esta jugando a los naipes");
    }

}
