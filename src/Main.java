import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> diller = new ArrayList<String>();

        diller.add("JAVA");
        diller.add("PHP");
        diller.add("Phyton");
        diller.add("Kotlin");
        diller.add("C#");

        /*for(int i = 0 ; i<diller.size(); i ++){
            System.out.println("Diller : " + diller.get(i));*/


        for(String s:diller){
            System.out.println(s) ;
        }

        System.out.println("*************************************");
        diller.add(1,"C++");
        for(String s:diller){
            System.out.println(s) ;
        }


        
    }


}



