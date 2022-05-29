public abstract class Hamburguer implements Item {

    @Override
    public Combo combo() {
        return new Embalagem();
    }

    @Override
    public abstract float preco ();
}
