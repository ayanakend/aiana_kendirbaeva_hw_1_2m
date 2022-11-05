public class Animal {
    private Integer age;
    private colorOfAnimal color;

    enum colorOfAnimal{
        BLACK, WHITE, GRAY, BROWN, ORANGE
    }

    public Integer getAge() {
        return age;
    }

    public colorOfAnimal getColor() {
        return color;
    }

    public Animal(Integer age, colorOfAnimal color) {
        this.age = age;
        this.color = color;
    }

     public String getInfo(){return "Age: "+ age+  "\nColor:  "+ color;}
}
