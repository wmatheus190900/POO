import java.util.ArrayList;
public class GestaoFinaceira {
    ArrayList<Feitos>servicosPrestados = new ArrayList<Feitos>();
    public GestaoFinaceira(){
    }
public void AddServicosPrestados(Feitos feitos){
    servicosPrestados.add(feitos);
}
public ArrayList<Feitos> getServicosPrestados() {
    return servicosPrestados;
}
public void setServicosPrestados(ArrayList<Feitos> servicosPrestados) {
    this.servicosPrestados = servicosPrestados;
}
}
