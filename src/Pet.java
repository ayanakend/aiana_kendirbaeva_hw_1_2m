import java.util.Random;

public class Pet {
    private Integer age;
    private Color color;
    private Shelter shelter;


    public Pet(Integer age, Color Color, Shelter shelter) {
        this.age = age;
        this.color = Color;
        this.shelter = shelter;
    }

    public static Integer generateDefaultAge(){
        return new Random().nextInt(10) + 1;
    }

    public String getInfo(){
        return "Age: " + age +
                "\nColor: " + color +
                "\nShelter name: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }
}
