
package Servizio;

import funzioni.ProvaFacadeLocal;
import it.sensei.entities.Response;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;


@Stateless
@WebService
public class NucleoService {
    
    @EJB
    private ProvaFacadeLocal metier;
    
    
    @WebMethod
    public Response VisualizzaClienti(@WebParam(name="CodiciClienti")List<String> listaCodici, @XmlElement(required=true)@WebParam(name="data")String data) throws Exception {
        Response response = new Response();
        try {
 
            if(data.equals("")){
                response.setMessage("Parametri inseriti non corretti, data mancante");
            }else{
                response.setClientiNucleo(metier.View2(listaCodici, data));
            }
           
        } catch (Exception ex) {
            
            Logger.getLogger(NucleoService.class.getName()).log(Level.SEVERE, null, ex);
            response.setMessage(ex.getMessage());
           
        }
        return response;
    }
    
    
    @WebMethod
    public Response VisualizzaContratti(@WebParam(name="CodiciContratti")List<String> listaCodici, @XmlElement(required=true)@WebParam(name="data")String data) throws Exception {
        Response response = new Response();
        try {
 
            if(data.equals("")){
                response.setMessage("Parametri inseriti non corretti, data mancante");
            }else{
                response.setClientiContratto(metier.ViewContratti(listaCodici, data));
            }
           
        } catch (Exception ex) {
            
            Logger.getLogger(NucleoService.class.getName()).log(Level.SEVERE, null, ex);
            response.setMessage(ex.getMessage());
           
        }
        return response;
    }
    
    
}
