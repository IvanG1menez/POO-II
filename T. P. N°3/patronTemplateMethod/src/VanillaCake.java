public class VanillaCake extends Cake {
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing ingredients for vanilla cake");
    }

    @Override
    public void bakeCake() {
        System.out.println("Baking vanilla cake");
    }

    @Override
    public void decorateCake() {
        System.out.println("Decorating vanilla cake");
    }

    @Override
    public void packageCake() {
        System.out.println("Packaging vanilla cake");
    }

}
