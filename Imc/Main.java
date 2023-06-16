package Imc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		
		Scanner bot=new Scanner(System.in);
		
		Pessoa pessoa[] = new Pessoa[2];
		for(int i=0;i<2;i++) {
			pessoa[i]= new Pessoa();
			System.out.println("\nnome e sobrenome: ");
		    pessoa[i].setNome(bot.next());
		    pessoa[i].setSobrenome(bot.next());
		    if (i > 0 && pessoa[i].getNome().equalsIgnoreCase(pessoa[i-1].getNome()) && pessoa[i].getSobrenome().equalsIgnoreCase(pessoa[i-1].getSobrenome())) {
                System.out.print("nome e sobrenome já cadastrado");
                System.exit(i);
		    }else {
		    System.out.println("Data de nascimento: ");
		    pessoa[i].ConvertData(bot.next());
		    pessoa[i].CalculaIdade();
			System.out.print("\naltura e peso: ");
			pessoa[i].setAltura(bot.nextDouble());
			pessoa[i].setPeso(bot.nextDouble());
			pessoa[i].CalculaImc();
		    }
		}
		for(int i=0;i<10;i++) {
			System.out.println("\ncadastro " + (i+1) + ":");
			System.out.println("Nome completo:" + pessoa[i].getNome()+ " "+ pessoa[i].getSobrenome());
			System.out.println("Nome de referência:" + pessoa[i].getSobrenome()+ ","+ pessoa[i].getNome().toUpperCase());
			System.out.println("Idade: "+ pessoa[i].getIdade());
			System.out.println("Peso: " + pessoa[i].getPeso());
			System.out.println("Altura: " + pessoa[i].getAltura());
			System.out.println("IMC: " + pessoa[i].getImc());
			pessoa[i].InformaObesidade();

		}
		bot.close();
		
	}
}
