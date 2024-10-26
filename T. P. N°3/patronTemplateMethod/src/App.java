public class App {
    public static void main(String[] args) throws Exception {
        Cake chocolateCake = new ChocolateCake();
        chocolateCake.makeCake();

        System.out.println();

        Cake vanillaCake = new VanillaCake();
        vanillaCake.makeCake();
    }
}
