public class Pedido {
    public static void main(String[] args) {

        PedidoDeRefeicao pedidoderefeicao = new PedidoDeRefeicao();

        Refeicao comboVegano = pedidoderefeicao.comboVegano();
        System.out.println("Combo Vegano");
        comboVegano.mostrarItems();
        System.out.println("Valor Total: " + comboVegano.getValor());

        Refeicao comboNormal = pedidoderefeicao.comboNormal();
        System.out.println("\n\n Combo Normal");
        comboNormal.mostrarItems();
        System.out.println("Valor Total: " + comboNormal.getValor());
    }
}
