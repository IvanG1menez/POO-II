public abstract class Cake {
    public void makeCake() {
        prepareIngredients();
        bakeCake();
        decorateCake();
        packageCake();
    }

    public abstract void prepareIngredients();

    public abstract void bakeCake();

    public abstract void decorateCake();

    public abstract void packageCake();

}
