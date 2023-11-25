package cafe.unidac;
import java.util.ArrayList;
import java.util.List;

public class CafeUnidacRepositorio {
	
	
    private List<CafeUnidac> cafeUnidacList = new ArrayList<>();

    public void salvarCafeUnidac(CafeUnidac cafeManha) {
        cafeUnidacList.add(cafeManha);
    }

    public List<CafeUnidac> listarCafeUnidac() {
        return cafeUnidacList;
    }

    public void excluirCafeUnidac(CafeUnidac cafeManha) {
        cafeUnidacList.remove(cafeManha);
    }

    public boolean cpfJaRegistrado(String cpf) {
        return cafeUnidacList.stream().anyMatch(c -> c.getCpf().equals(cpf));
    }

    public boolean opcaoJaRegistrada(String opcaoAlimento, String data) {
        return cafeUnidacList.stream().anyMatch(c ->
                c.getOpcaoAlimento().equals(opcaoAlimento) && c.getData().equals(data)
        );
    }

}
