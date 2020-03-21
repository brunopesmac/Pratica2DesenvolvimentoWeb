package service;
import dao.PaisDAO;
import model.Pais;

public class PaisService {

	private PaisDAO dao;
	public PaisService() {
		dao = new PaisDAO();
	}
	public void criar(Pais pais) {
		pais.setId(dao.criar(pais.getNome(), pais.getPopulacao(), pais.getArea()));
	}
	public void atualizar(Pais pais) {
		dao.atualizar(pais.getId(),pais.getNome(),pais.getPopulacao(), pais.getArea());
	}
	public void excluir (int id) {
		dao.excluir(id);
	}
	public void carregar(Pais pais) {
		Pais aux = dao.carregar(pais.getId());
		pais.setNome(aux.getNome());
		pais.setPopulacao(aux.getPopulacao());
		pais.setArea(aux.getArea());	
	}
	
	public void maiorP(Pais pais) {	
		
		dao.maiorPopulacao(pais);
		}
	public Pais[] vetorTresPaises() {
		Pais x[] = new Pais[3];	
		for(int i=0;i<3;i++) {
			x[i]=dao.carregar(i+1);
		}
		return x;
	}
	public void menorA(Pais pais) {
		dao.menorArea(pais);
	}
}

