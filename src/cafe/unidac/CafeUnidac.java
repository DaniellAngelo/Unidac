package cafe.unidac;

public class CafeUnidac {
	
	
	private String colaborador;
	private String cpf;
	private String opcaoAlimento;
	private String data;
	
	
	public CafeUnidac(String Colaborador, String cpf, String opcaoAlimento, String data) {
        this.colaborador = Colaborador;
        this.cpf = cpf;
        this.opcaoAlimento = opcaoAlimento;
        this.data = data;
    }
	

	public String getColaborador() {
		return colaborador;
	}
	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getOpcaoAlimento() {
		return opcaoAlimento;
	}
	public void setOpcaoAlimento(String opcaoAlimento) {
		this.opcaoAlimento = opcaoAlimento;
	}
	
	
	@Override
    public String toString() {
        return "Cafe Unidac - " +
                "Colaborador: " + colaborador  +
                ", cpf: " + cpf +
                ", Alimento: " + opcaoAlimento +
                ", data: " + data + '.';
    }

}
