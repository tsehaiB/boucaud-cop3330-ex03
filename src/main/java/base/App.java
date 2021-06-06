package base;
import java.util.Scanner;
public class App {
    Scanner inp = new Scanner(System.in);
    public static void main(String args[]){
        App myApp = new App();

        String quote = myApp.readQuote();
        String name = myApp.readName();
        System.out.println(myApp.generateOut(name, quote));
    }
    private String readQuote(){
        System.out.print("What is the quote? ");
        return inp.nextLine();
    }
    private String readName(){
        System.out.print("Who said it? ");
        return inp.nextLine();
    }
    private String generateOut(String name, String quote){
        return name + " says, \"" + quote + "\"";
    }
}
