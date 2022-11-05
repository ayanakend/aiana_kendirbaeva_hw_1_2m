public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("Sun", "Vol st. 37/4");
        String[] commandsSouth = new String[2];
        commandsSouth[0] = "Eat";
        commandsSouth[1] = "Sit";

        Dog South = new Dog(shelter, Pet.generateDefaultAge(), Color.GRAY, "Alex", "Ovcharka", commandsSouth);
        System.out.println(South.getInfo());
        South.makeVoice();

        Dog Matt = new Dog(Pet.generateDefaultAge(), Color.BLACK, shelter, "Rex", "Brodyga");
        System.out.println(Matt.getInfo());
        South.makeVoice();

        Dog Dee = new Dog(Pet.generateDefaultAge(), Color.WHITE, shelter, "Milka");
        System.out.println(Dee.getInfo());
        South.makeVoice();



        System.out.println("------------------------------------------------------------------");

        Cats objectA = new Cats(3, Animal.colorOfAnimal.WHITE, 3.7);
        System.out.println(objectA.getInfo());
        Cat1 objectB = new Cat1(5, Animal.colorOfAnimal.GRAY);
        System.out.println(objectB.getInfo());
        Cat1 objectC = new Cat1(2, Animal.colorOfAnimal.BLACK, 2.3);
        System.out.println(objectC.getInfo());
    }
}