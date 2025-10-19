public abstract class Aquatic extends Animal {  // devient abstraite
    protected String habitat;

    public Aquatic() {}

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Méthode abstraite : chaque sous-classe doit la redéfinir
    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + " habitat:" + habitat;
    }
}
@Override
public boolean equals(Object obj) {
    if (this == obj) return true; // même référence
    if (obj == null || getClass() != obj.getClass()) return false; // null ou classe différente

    Aquatic other = (Aquatic) obj;
    return this.getName().equals(other.getName()) &&
            this.getAge() == other.getAge() &&
            this.habitat.equals(other.habitat);
}

