public class Hangar {
    public static void main(String[] args) {

        Car clio = new Car("Clio");

        System.out.println("Je suis " + clio.getBrand() + " et je fais " + clio.doStuff());

        Boat titanic = new Boat("Titanic");

        System.out.println("Je suis " + titanic.getBrand() + " et je fais " + titanic.doStuff());
    }
}
