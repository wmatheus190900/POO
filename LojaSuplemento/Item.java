package LojaSuplemento;
import java.util.Scanner;
public class Item {
	Scanner bot=new Scanner(System.in);
	private Produto produto;
	private int quantidadeComprada;
	private double preco;
	public Item(Produto produto,int quantidadeComprada){
		this.produto=produto;
		this.quantidadeComprada=quantidadeComprada;
		setPreco();
	}
	public Item(){
	}	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}
	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco() {
		this.preco = this.quantidadeComprada*this.produto.getPreco();
	}

}
