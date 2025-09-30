package tn.esprit.gestionzoo.entites;

public class Zoo  {
    Animal[] animals;
    private String name;
    private String city;
    private static final int nbrCges=25;
    private int count=0;
    // getters et setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( name != null){
            this.name=name;
        }
    }

     public Zoo(String name, String city, int nbrCges){

        animals=new Animal[nbrCges];
        this.name=name;
        this.city=city;
        // tableau fixe de taille constante
        animals =new Animal[nbrCges];
    }
     public void displayZoo (){
        System.out.print("name:"+name+ "city:"+city+ "nbr cges: "+nbrCges);//sout
    }

    @Override
    public String toString() {
        return ("name:"+name+ "city:"+city+ "nbr cges: "+nbrCges);

    } // instruction 17(modification de la methode addanimal
     public boolean addAnimal(Animal animal){
        if (iszoofull()){
            System.out.println("zoo plein");
            return false;
        }
        if( searchAnimal(animal)!=-1){
            System.out.println("animal exist");
            return false;
        }
        animals[count]=animal;
        count++;
        return true;

    } // instruction 11
    public int searchAnimal(Animal animal){
        for (int i=0;i<animals.length;i++) {
            if (animals[i] != null && animals[i].getName() .equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    //instruction 13
    public boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal); // cherche l'animal
        if (index == -1) return false;    // non trouvé

        // décale les animaux suivants
        for (int i = index; i < count - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[count - 1] = null; // dernière case vide
        count--;                   // décrémente le compteur
        return true;               // succès
    }

     public boolean iszoofull(){
        return count >= nbrCges;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.count >= z2.count) {
            return z1; // Zoo avec le plus d’animaux
        } else {
            return z2;
        }
    }

}



