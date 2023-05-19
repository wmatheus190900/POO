package LojaSuplemento;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Fatura fatura=new Fatura();
		String repeticao;
		int opcao;
		Scanner bot=new Scanner(System.in);
		ArrayList<Produto>produtos=new ArrayList<Produto>();
		produtos.add(new Produto("Whey", "1234", 130.00));
		produtos.add(new Produto("Creatina", "5678", 80.00));
		produtos.add(new Produto("Cafeína", "789", 90.00));
		produtos.add(new Produto("BCAA", "1357", 80.00));
		do {
		System.out.println("Digite:" + "\n1-Comprar \n2-Ver fatura \n3-Encerrar programa");
		opcao=bot.nextInt();
		switch(opcao) {
		case 1: 
		for(int i=0;i<produtos.size();i++){
			System.out.println(produtos.get(i).getNome() + "\tcódigo:" + produtos.get(i).getCodigo());
		}
		System.out.println("Informe o código e a quantidade do produto desejado:");
		String codigo=bot.next();
		int quantidade=bot.nextInt();
		for(int i=0;i<produtos.size();i++){
			if(codigo.equals(produtos.get(i).getCodigo())){
				Item novoItem= new Item(produtos.get(i),quantidade);
				fatura.addItem(novoItem);
			}
		}
		break;
		case 2:
			System.out.println(".......................................");
			fatura.getItens();
			System.out.println(".......................................");
			System.out.println("R$" + fatura.getFaturaTotal());
			break;
		}
		System.out.println("Deseja continuar comprando ou ver a fatur");
		repeticao=bot.next();
		}while(repeticao.equalsIgnoreCase("sim") || repeticao.equalsIgnoreCase("s"));
		System.out.println("Fim do programa!");
        bot.close();
	}

}

