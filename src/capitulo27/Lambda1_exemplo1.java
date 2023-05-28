package capitulo27;
/**
*
* @author Geraldo C Cantelli
*/
public class Lambda1_exemplo1 {
    public static void main(String[] args) {
         Runnable r = new Runnable() {
            public void run() {
            System.out.println("Olá mundo!");
            }
        };
        r.run();
    }
}
