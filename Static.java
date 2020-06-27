class Thing{
    public final static int Lucky_Number=7;
    public String name;
    public static String description;

    public static int count=0;

    public int id;

    public Thing(){
        id = count;

        count++;

    }

    public void showName(){
        System.out.println(description + " : "+name);
    }

    public static void showInfo() {
        System.out.println("Hello");
        //won't work System.out.println(name);
    }
}


public class Static {
    public static void main(String[] args) {

        Thing.description="I an a thing";

        Thing.showInfo();

        System.out.println("Before Creating objects, count is : "+ Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After Creating objects, count is : "+ Thing.count);

        thing1.name = "Bob";
        thing2.name= "Sue";

        /*
        System.out.println(thing1.name);
        System.out.println(thing2.name);
        */
        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);

        System.out.println(Thing.Lucky_Number);
    }

}
