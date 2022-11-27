import javax.swing.plaf.synth.SynthSplitPaneUI;

public class ThePet {

    private String name, color, breed;
    private int age;

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setBreed(String petBreed) {
        this.breed = petBreed;
    }

    public void setName(String petName) {
        this.name = petName;
    }

    public void setColor(String petColor) {
        this.color = petColor;
    }

    public void setAge(int petAge) {
        this.age = petAge;
    }

    public static void main(String[] args) {
        ThePet pet = new ThePet();
        pet.setBreed("Syberian Husky");
        pet.setName("Emily");
        pet.setColor("Black & White");
        pet.setAge(2);
        System.out.println("Welcome to Mr. Dug Dog Care! Check your dog data: ");
        System.out.println("Name : " + pet.getName());
        System.out.println("Breed : " + pet.getBreed());
        System.out.println("Color : " + pet.getColor());
        System.out.println("Age : " + pet.getAge() + " years old");
    }
}
