public class ChocolateCake extends Cake {
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing ingredients for chocolate cake");
    }

    @Override
    public void bakeCake() {
        System.out.println("Baking chocolate cake");
    }

    @Override
    public void decorateCake() {
        System.out.println("Decorating chocolate cake");
    }

    @Override
    public void packageCake() {
        System.out.println("Packaging chocolate cake");
    }
}
