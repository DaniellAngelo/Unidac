package cafe.unidac;
import java.util.List;

public class CafeUnidacService {
	

    private CafeUnidacRepositorio cafeUnidacRepositorio;

    
    public CafeUnidacService() {
        this.cafeUnidacRepositorio = new CafeUnidacRepositorio();
    }

    public String adicionarCafeUnidac(CafeUnidac cafeUnidac) {
        if (!validarCafeUnidac(cafeUnidac)) {
            return "Alimento indisponivel, escolha outra op��o de alimento!";
        }

        cafeUnidacRepositorio.salvarCafeUnidac(cafeUnidac);
        return "Caf� da manh� confirmado com sucesso!";
    }

    public List<CafeUnidac> listarCafeUnidac() {
        return cafeUnidacRepositorio.listarCafeUnidac();
    }

    public String excluirCafeUnidac(CafeUnidac cafeUnidac) {
        cafeUnidacRepositorio.excluirCafeUnidac(cafeUnidac);
        return "Caf� da manh� exclu�do com sucesso!";
    }

    private boolean validarCafeUnidac(CafeUnidac cafeUnidac) {
        
        return cafeUnidac.getData().compareTo("25/11/2023") > 0 && !cafeUnidacRepositorio.cpfJaRegistrado(cafeUnidac.getCpf())
                && !cafeUnidacRepositorio.opcaoJaRegistrada(cafeUnidac.getOpcaoAlimento(), cafeUnidac.getData());
    }
}
