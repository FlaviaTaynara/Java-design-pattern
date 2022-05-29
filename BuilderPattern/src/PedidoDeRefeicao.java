public class PedidoDeRefeicao {

    public static Refeicao comboVegano(){
        Refeicao refeicao = new Refeicao ();
        refeicao.addItem(new HamburguerVegano ());
        refeicao.addItem(new CocaCola());
        return refeicao;
    }

    public static Refeicao comboNormal(){
        Refeicao refeicao = new Refeicao ();
        refeicao.addItem(new HamburguerDeFrango());
        refeicao.addItem(new Pepsi());
        return refeicao;
    }
}
