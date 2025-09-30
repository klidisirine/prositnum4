package tn.esprit.gestionzoo.main;
// Ajoute les imports
import tn.esprit.gestionzoo.entites.Animal;
import tn.esprit.gestionzoo.entites.Zoo;

public class Main {
    public static void main(String[] args) {

    /*Animal lion=new Animal();
    lion.family="lionn";
    lion.name="simba";
    lion.age=5;
    lion.isMammal=true;

    Zoo myZoo=new Zoo();
    myZoo.name="zooparc";
    myZoo.city="tunis";
    myZoo.nbrCges=5;
*/
        // constructeur paramétre
        Animal lion =new Animal("lionn","simba",5,true);
        Zoo myzoo=new Zoo("zooparc","tunis",8);
        // creation de plusieurs animal en utilsant constructeur
        Animal lion2=new Animal("animalfamily","lola",5,false);
        Animal lion3=new Animal("lionn4","koki",7,true);
        Animal tigre = new Animal("tigre", "Tigrou", 4, true);
        Animal chat = new Animal("chat", "Mimi", 2, false);

        myzoo.displayZoo();
        System.out.println(myzoo);
        // System.out.println(myzoo.toString());
        System.out.println(lion);
        System.out.println("ajout simba" + myzoo.addAnimal(lion2));
        System.out.println("search aniaml" + myzoo.searchAnimal(lion));
        System.out.println("search aniaml" + myzoo.searchAnimal(lion2));

        myzoo.addAnimal(tigre);
        myzoo.addAnimal(chat);
    }
}


