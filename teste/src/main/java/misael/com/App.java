package misael.com;

import misael.com.UtilMisael;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        UtilMisael uti = new UtilMisael();

        System.out.println("Hello World!" + uti.getOLa());
    }
}
