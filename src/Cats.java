public class Cats extends Animal{

    private double weight;

    private Breed breed;

    public double getWeight() {
        return weight;
    }


    public Breed getBreed() {
        return breed;
    }

    public Cats(Integer age, colorOfAnimal color) {
        super(age, color);
    }

    public Cats(Integer age, colorOfAnimal color, double weight) {
        super(age, color);
        this.weight = weight;
    }

    public final void Cat() {
        System.out.println("Кота не существует");
    }
}
