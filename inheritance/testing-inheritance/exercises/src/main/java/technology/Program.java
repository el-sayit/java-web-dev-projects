package technology;

public class Program {
    public static void main(String [] args){
    Computer comp1 = new Computer("acer", 15);
        System.out.println(comp1.getBrandName() + " has screen size of "+ comp1.getScreenSize());
    Laptop laptop1 = new Laptop("dell", 17.1, "GeForce RTX");
        System.out.println(laptop1.getBrandName()+ " has a " + laptop1.getGraphicsType());
    }
}
