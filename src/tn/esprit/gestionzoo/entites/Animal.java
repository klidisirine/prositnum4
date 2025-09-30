package tn.esprit.gestionzoo.entites;
public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
     public Animal(String family,String name,int age,boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if(age<0)
            System.out.println("invalid age");
        else
            this.age=age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    @Override
    public String toString() {
        return ("family:"+family+ "name:"+name+ "age: "+age+ "isMammal:"+isMammal);

    }
}
