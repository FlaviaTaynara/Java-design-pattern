public abstract class BebidaGelada implements Item {

    @Override
    public Combo combo() {
        return new Bebida();
    }

    @Override
    public abstract float preco ();
}

