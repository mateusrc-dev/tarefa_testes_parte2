package test;

import org.junit.Assert;
import org.junit.Test;

import dao.ClienteDao;
import dao.IClienteDao;
import dao.mocks.ClienteDaoMock;
import service.ClienteService;

public class ClienteServiceTest {
	@Test
	public void salvarTest() {
		IClienteDao mockDao = new ClienteDaoMock();
		ClienteService service = new ClienteService(mockDao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperoErroNoSalvarTest() {
		IClienteDao dao = new ClienteDao();
		ClienteService service = new ClienteService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
}
