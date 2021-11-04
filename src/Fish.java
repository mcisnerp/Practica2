public class Fish extends Animal implements Pet{

    public void Fish(){

    }
    public void eat(){
        System.out.println("El pez come peces");
    }

    public void walk(){
        System.out.println("El pez no puede caminar porque no tiene patas");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String setName(String name) {
        return null;
    }

    @Override
    public void play(){
        System.out.println("El pez no juega");
    }

}
