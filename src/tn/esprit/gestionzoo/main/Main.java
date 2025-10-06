package tn.esprit.gestionzoo.main;

// Imports
import tn.esprit.gestionzoo.entites.Animal;
import tn.esprit.gestionzoo.entites.Zoo;
import tn.esprit.gestionzoo.entites.Aquatic;
import tn.esprit.gestionzoo.entites.Terrestrial;
import tn.esprit.gestionzoo.entites.Dolphin;
import tn.esprit.gestionzoo.entites.Penguin;

public class Main {
    public static void main(String[] args) {

        // ==== Zoo et animaux "classiques" ====
        Zoo myzoo = new Zoo("zooparc","tunis",8);

        Animal lion = new Animal("lionn","simba",5,true);
        Animal lion2 = new Animal("animalfamily","lola",5,false);
        Animal lion3 = new Animal("lionn4","koki",7,true);
        Animal tigre = new Animal("tigre", "Tigrou", 4, true);
        Animal chat = new Animal("chat", "Mimi", 2, false);

        myzoo.displayZoo();
        System.out.println(myzoo);
        System.out.println(lion);
        System.out.println("Ajout de lola : " + myzoo.addAnimal(lion2));
        System.out.println("Recherche simba : " + myzoo.searchAnimal(lion));
        System.out.println("Recherche lola : " + myzoo.searchAnimal(lion2));

        myzoo.addAnimal(tigre);
        myzoo.addAnimal(chat);

        System.out.println("------ Animaux dans le zoo après ajouts ------");
       // myzoo.displayAnimals(); // si tu as une méthode displayAnimals()

        // ==== Hiérarchie des familles (Aquatic/Terrestrial/Dolphin/Penguin) ====
        Aquatic fish = new Aquatic();
        Terrestrial dog = new Terrestrial();
        Dolphin dol = new Dolphin();
        Penguin peng = new Penguin();

        System.out.println("\nInstanciations par défaut :");
        System.out.println(fish);
        System.out.println(dog);
        System.out.println(dol);
        System.out.println(peng);

        // ==== Instanciation avec constructeurs paramétrés ====
        Aquatic shark = new Aquatic("Shark Family", "Jaws", 5, true, "ocean");
        Terrestrial cat = new Terrestrial("Cat Family", "Mimi", 2, true, 4);
        Dolphin flipper = new Dolphin("Dolphin Family", "Flipper", 6, true, "ocean", 25.5f);
        Penguin skipper = new Penguin("Penguin Family", "Skipper", 3, true, "bassin", 15.0f);

        System.out.println("\nInstanciations paramétrées :");
        System.out.println(shark);
        System.out.println(cat);
        System.out.println(flipper);
        System.out.println(skipper);

        // ==== Optionnel : ajout de ces nouveaux animaux au Zoo ====
        myzoo.addAnimal(shark);
        myzoo.addAnimal(cat);
        myzoo.addAnimal(flipper);
        myzoo.addAnimal(skipper);

        System.out.println("\n------ Zoo après ajout des animaux spécialisés ------");
       // myzoo.displayAnimals();
    }
}
