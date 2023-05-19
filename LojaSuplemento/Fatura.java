package LojaSuplemento;
import java.util.ArrayList;
public class Fatura {
	ArrayList<Item>itens=new ArrayList<Item>();
	private double faturaTotal=0;
	public Fatura() {
	}
	public void addItem(Item item){
		itens.add(item);
		faturaTotal+=item.getPreco();
	}
	public void getItens() {
		for(int i=0;i<itens.size();i++){
			System.out.println(itens.get(i).getProduto().getNome() + "\t" + itens.get(i).getQuantidadeComprada() +"\t" +  itens.get(i).getPreco());
		}
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
	public double getFaturaTotal() {
		return faturaTotal;
	}
}
