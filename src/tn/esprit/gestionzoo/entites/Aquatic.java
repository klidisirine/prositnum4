package tn.esprit.gestionzoo.entites;


public class Aquatic extends Animal {
    protected String habitat; // ex: mer, océan, bassin

    public Aquatic() {} // constructeur par défaut

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + " habitat:" + habitat;
    }
}