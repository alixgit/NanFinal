
package funzioni;

import it.sensei.entities.InfoClienti;
import it.sensei.entities.Prova;
import it.sensei.entities.Risultato;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import static junit.framework.Assert.assertNotNull;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



@Stateless
public class ProvaFacade extends AbstractFacade<Prova> implements ProvaFacadeLocal {
    
    @PersistenceContext(unitName = "it.sensei_NucleoProject_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProvaFacade() {
        super(Prova.class);
    }
    

    @Override
    public List<Prova> View2(List<String> codici, String data)throws Exception {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("Nucleo_config.xml");
        } catch (IOException ex) {
            Logger.getLogger(ProvaFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
        SqlSession session = sqlSessionFactory.openSession();
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        Date utilDate = null;
        try {
            utilDate = (Date)format.parse(data);
        } catch (ParseException ex) {
            
            Logger.getLogger(ProvaFacade.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex.getMessage());
        }
        if(utilDate != null) {
        
            InfoClienti puppo = new InfoClienti();
            puppo.setList(codici);
            puppo.setData(utilDate);
            List<Prova> prove = session.selectList("it.sensei.entities.Prova.getAll", puppo);
            assertNotNull(prove);
            return prove;
        }
//        Logger.getLogger(ProvaFacade.class.getName()).log(Level.SEVERE, "******************************************** codici: " + codici.toString());

                
        return null;

    }

    @Override
    public List<Risultato> ViewContratti(List<String> codici, String data) throws Exception {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("Nucleo_config.xml");
        } catch (IOException ex) {
            Logger.getLogger(ProvaFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
        SqlSession session = sqlSessionFactory.openSession();
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        Date utilDate = null;
        try {
            utilDate = (Date)format.parse(data);
        } catch (ParseException ex) {
            
            Logger.getLogger(ProvaFacade.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex.getMessage());
        }
        if(utilDate != null) {
        
            InfoClienti puppo = new InfoClienti();
            puppo.setList(codici);
            puppo.setData(utilDate);
            List<Risultato> risultato = session.selectList("it.sensei.entities.Risultato.getAllContratti", puppo);
            assertNotNull(risultato);
            return risultato;
        }
//        Logger.getLogger(ProvaFacade.class.getName()).log(Level.SEVERE, "******************************************** codici: " + codici.toString());

                
        return null;
    }
}
