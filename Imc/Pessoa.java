package Imc;

public class Pessoa {
    private String nome;
	private String sobrenome; 
	private int idade;
	private Data data_nascimento;
	private double peso;
	private double altura;
	private double imc;
	private  String nomeCompleto=nome+sobrenome;
	
	public Pessoa() {
		setNome(nome);
		setSobrenome(sobrenome);
		setNomeCompleto(nomeCompleto);
		setPeso(peso);
		setAltura(altura);
		setImc(imc);
	}
	public void ConvertData(String datanascimento) {
		String[] datas= datanascimento.split("/");
		int[] convertido=new int[3];
		for(int i=0;i<3;i++) {
			convertido[i]=Integer.parseInt(datas[i]);
		}
		Data nsc=new Data(convertido[0],convertido[1],convertido[2]);
		this.data_nascimento=nsc;
	}
	public void CalculaIdade() {
		Data hoje= new Data();
		if(hoje.getMes()<data_nascimento.getMes()) {
			this.setIdade((hoje.getAno()-1)- data_nascimento.getAno());
		}else if(hoje.getMes()==data_nascimento.getMes()) {
			if(hoje.getDia()<data_nascimento.getDia()) {
				this.setIdade((hoje.getAno()-1)- data_nascimento.getAno());
			}else {
				this.setIdade(hoje.getAno()- data_nascimento.getAno());
			}
		}else {
			this.setIdade(hoje.getAno()- data_nascimento.getAno());
		}
	}
	public double CalculaImc(double peso,double altura) {
		setImc((peso/Math.pow(altura, 2)));
		return getImc();
	}
	public void InformaObesidade(){
		if (imc< 18.5) {
			System.out.println("Abaixo do peso");
		}else if(imc>=18.5 && imc<=24.99){
			System.out.println("Peso normal");
		}else if(imc>=25 && imc<=29.99) {
			System.out.println("Sobrepeso");
		}else if(imc>=30 && imc<=34.99) {
			System.out.println("Obesidade grau 1");
		}else if(imc>=35 && imc<=39.99) {
			System.out.println("Obesidade grau 2");
		}else if(imc>=40) {
			System.out.println("Obesidade grau 3");
		}	
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto=nomeCompleto;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade=idade;
	}
	public Data getData_nascimento() {
		return data_nascimento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	public double CalculaImc() {
		setImc((this.peso/Math.pow(this.altura, 2)));
		return getImc();
    }
}
