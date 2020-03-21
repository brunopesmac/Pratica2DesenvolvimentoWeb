import model.Pais;
import service.PaisService;

public class PaisTeste {
	
	public static void main(String args[]) {
		
		PaisService service = new PaisService();
		Pais pais = new Pais();
		pais.setNome("novo");
		pais.setPopulacao(500);
		pais.setArea(1000);
		service.criar(pais);
		
		service.carregar(pais);
		System.out.println("Pais criado: "+pais);
		
		pais.setPopulacao(1000);
		service.atualizar(pais);
		System.out.println("Pais Atualizado: "+pais);
		
		service.excluir(pais.getId());
		service.carregar(pais);
		System.out.println("Pais excluido: "+pais);
		
		Pais x = new Pais();
		service.maiorP(x);
		System.out.println("Maior População: "+x.toString());
		
		Pais z= new Pais();
		service.menorA(z);
		System.out.println("Menor Area: "+z.toString());	
		
		Pais[] y =service.vetorTresPaises();
		for(Pais p:y ) {			
			System.out.println("Vetores: "+p.toString());			
		}
	}
}
