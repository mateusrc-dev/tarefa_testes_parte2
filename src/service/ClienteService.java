package service;

import dao.IClienteDao;

public class ClienteService {
	IClienteDao clienteDao;
	
	public ClienteService(IClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}
	
	public String salvar() {
		clienteDao.salvar();
		return "Sucesso";
	}
}
