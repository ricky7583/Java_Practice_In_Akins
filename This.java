class Frog {
    public String name;
    private int age;

    public void setName(String newName){
        //name=newName;
        this.name=name;

    }

    public void setAge(int newAge){

        //age=newAge;
        this.age = age;
    }
    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }
}
public class This {
    public static void main(String[] args) {
        Frog frog1 = new Frog();

        frog1.setName("Bertie");
        frog1.setAge(1);

        System.out.println(frog1.getName());
    }

}
