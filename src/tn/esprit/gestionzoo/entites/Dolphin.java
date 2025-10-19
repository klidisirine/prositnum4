package tn.esprit.gestionzoo.entites;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin() {}

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + " swimmingSpeed:" + swimmingSpeed;
    }
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
    public void displayAquaticCounts() {
        int dolphins = 0;
        int penguins = 0;
        for (int i = 0; i < count; i++) {
            if (animals[i] instanceof Dolphin) dolphins++;
            if (animals[i] instanceof Penguin) penguins++;
        }
        System.out.println("Dolphins: " + dolphins + ", Penguins: " + penguins);
    }

}
