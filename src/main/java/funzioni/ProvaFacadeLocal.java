
package funzioni;

import it.sensei.entities.Prova;
import it.sensei.entities.Risultato;
import java.util.List;
import javax.ejb.Remote;


@Remote
public interface ProvaFacadeLocal {
    
    List<Prova> View2(List<String> codici, String data)throws Exception;
    
    List<Risultato> ViewContratti(List<String> codici, String data)throws Exception;

    void create(Prova prova);

    void edit(Prova prova);

    void remove(Prova prova);

    Prova find(Object id);

    List<Prova> findAll();

    List<Prova> findRange(int[] range);

    int count();
    
}
