package test;

import org.junit.Assert;
import org.junit.Test;

import dao.ContratoDao;
import dao.IContratoDao;
import dao.mocks.ContratoDaoMock;
import service.ContratoService;
import service.IContratoService;

public class ContratoServiceTest {
	@Test
	public void salvarTest() {
		IContratoDao daoMock = new ContratoDaoMock();
		IContratoService service = new ContratoService(daoMock);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoSalvarComBancoDeDadosTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test
	public void buscarTest() {
		IContratoDao daoMock = new ContratoDaoMock();
		IContratoService service = new ContratoService(daoMock);
		String retorno = service.buscar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test
	public void excluirTest() {
		IContratoDao daoMock = new ContratoDaoMock();
		IContratoService service = new ContratoService(daoMock);
		String retorno = service.excluir();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test
	public void atualizarTest() {
		IContratoDao daoMock = new ContratoDaoMock();
		IContratoService service = new ContratoService(daoMock);
		String retorno = service.atualizar();
		Assert.assertEquals("Sucesso", retorno);
	}
}
