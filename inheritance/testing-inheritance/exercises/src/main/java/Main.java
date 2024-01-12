public class Main {
    public static void main(String[] args){
       HouseCat garfield = new HouseCat("Garfield",15);
       garfield.eat();
       System.out.println(garfield.isTired());
       HouseCat spike = new HouseCat("spike");
        System.out.println(spike.getWeight());
        Cat rusty = new Cat();
        HouseCat cheshireCat = new HouseCat("Cheshire", 10);
        System.out.println(cheshireCat.noise());
        System.out.println(rusty.noise());
        HouseCat mishiq = new HouseCat("mishiq",2.6);
        System.out.println(mishiq.noise());

    }
}
