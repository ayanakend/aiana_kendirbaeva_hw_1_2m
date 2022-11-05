import java.util.Arrays;

public final class Dog  extends Pet{
    private String name;
    private String breed;
    private String[] commands;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog(Shelter shelter, Integer age, Color Color, String name, String breed, String[] commands) {
        super(age, Color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog(Integer age, Color Color, Shelter shelter, String name, String breed) {
        super(age, Color, shelter);
        this.name = name;
        this.breed = breed;
    }

    public Dog(Integer age, Color Color, Shelter shelter, String name) {
        super(age, Color, shelter);
        this.name = name;
    }

    void makeVoice(String voice, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }
    }

    
    void makeVoice(){
        System.out.println("wof, wof");
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed+
                "\nCommands: " + Arrays.toString(commands);


    }
}
