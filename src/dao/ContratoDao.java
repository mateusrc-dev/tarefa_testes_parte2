package dao;

public class ContratoDao implements IContratoDao {

	@Override
	public String salvar() {
		throw new UnsupportedOperationException("Não funciona sem config de banco!");
		//return "Sucesso";
	}

	@Override
	public String buscar() {
		return "Sucesso";
	}

	@Override
	public String excluir() {
		return "Sucesso";
	}

	@Override
	public String atualizar() {
		return "Sucesso";
	}
	
}
