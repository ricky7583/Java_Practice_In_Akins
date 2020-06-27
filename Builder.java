public class Builder {

    public static void main(String[] args) {
        //Inefficient
        String info="";

        info += "My name is Ricky.";
        info += " ";
        info += "I am a builder";

        System.out.println(info);

        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer");

        System.out.println(sb.toString());
        //toString is to change from number to String

        StringBuilder s = new StringBuilder();
        s.append("My name is Roger.");
        s.append("I am a skydiver");

        System.out.println(s.toString());



        System.out.print("Here is some text. \tThat was a tab. \nThat was a newline.");
        System.out.println("More text");

        System.out.printf("Total cost is %-10d; \nquantity is %d", 5,120);

        for (int i=0;i<20;i++){
            System.out.printf("%-2d : %s\n",i, "Here is some text");

        }

        System.out.printf("Total value : %.2f\n",5.6);
        System.out.printf("Total value : %5.1f\n",343.23423);
    }
}
