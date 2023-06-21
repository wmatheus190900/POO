import java.util.ArrayList;

public class GestaoServicos {
    	private ArrayList<Servico> servicos;

	public GestaoServicos() {
		this.servicos = new ArrayList<>();

	}

	public void cadastraServico(Servico servico) {

		servicos.add(servico);
		System.out.println("Novo serviço cadastrado !\n");

	}

	public void removeServico(Servico servico) {

		servicos.remove(servico);
		System.out.println("Serviço removido com sucesso !!");

	}

	public void editarServico(int codigo,  String novoNome, double novoPreco) {

		Servico servicoEditado = buscarServico(codigo);

		if (servicoEditado != null) {
			servicoEditado.setNome(novoNome);
			servicoEditado.setPreco(novoPreco);

			System.out.println("serviço editado com sucesso!\n");
		} else {
			System.out.println("serviço não encontrado!\n");
		}
	}

	public ArrayList<Servico> mostrarServicos() {
		return servicos;
	}

	public Servico buscarServico(int codigo) {
		for (Servico servico : servicos) {
			if (servico.getCodigo() == codigo) {
				return servico;
			}
		}
		return null;
	}
}
