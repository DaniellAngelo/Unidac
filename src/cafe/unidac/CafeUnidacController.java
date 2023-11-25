package cafe.unidac;
import java.util.List;

public class CafeUnidacController {
	
    private CafeUnidacService cafeUnidacService;

    
    public CafeUnidacController() {
        this.cafeUnidacService = new CafeUnidacService();
    }

    public String adicionarCafeUnidac(CafeUnidac cafeUnidac) {
        return cafeUnidacService.adicionarCafeUnidac(cafeUnidac);
    }

    public List<CafeUnidac> listarCafeUnidac() {
        return cafeUnidacService.listarCafeUnidac();
    }

    public String excluirCafeUnidac(CafeUnidac cafeUnidac) {
        return cafeUnidacService.excluirCafeUnidac(cafeUnidac);
    }
  
}
