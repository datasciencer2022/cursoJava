package capitulo27;
/**
*
* @author Geraldo C Cantelli
*/
public class Lambda1 {
    public static void main(String[] args) {
         Runnable r = () -> System.out.println("Olá mundo!");
         r.run();
    }
}
