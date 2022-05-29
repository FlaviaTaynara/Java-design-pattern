import java.util.ArrayList;
import java.util.List;

public class Refeicao {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getValor(){
        float valor = 0.0f;

        for (Item item : items) {
            valor += item.preco();
        }
        return valor;
    }

    public void mostrarItems(){

        for (Item item : items) {
            System.out.print("Item : " + item.nome());
            System.out.print(", Combo : " + item.combo().pack());
            System.out.println(", Preço : " + item.preco());
        }
    }

}
