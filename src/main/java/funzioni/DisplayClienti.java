
package funzioni;

import it.sensei.entities.Clienti;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class DisplayClienti {
    
    public void listNan() throws IOException, Exception {
    
        Reader reader = Resources.getResourceAsReader("Nucleo_config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
        SqlSession session = sqlSessionFactory.openSession();
        
        
        List<Clienti> prove = session.selectList("it.sensei.entities.Clienti.getAllClienti");
        Iterator<Clienti> iterator = prove.iterator();
                    
        System.out.println("===Ecco la lista dei clienti senza join di NAN:===");
        while(iterator.hasNext()) {
            Clienti cliente = (Clienti)iterator.next();
            System.out.print("ID_cliente: " + cliente.getCl_id());
            System.out.print("util_cliente: " + cliente.getUtil_id());
            System.out.print("cod_cliente: " + cliente.getCl_codice());
            System.out.print("cl_attivita: " + cliente.getCl_attivita());
            System.out.print("cl_ragione_cognome: " + cliente.getCl_ragione_cognome());
            System.out.print(", Nome: " + cliente.getCl_nome());
            System.out.print(", titolo: " + cliente.getCl_titolo());
            System.out.print(", indirizzo: " + cliente.getCl_indirizzo());
            System.out.print(", civico: " + cliente.getCl_civico());
            System.out.print(", citta: " + cliente.getCl_citta());
            System.out.print(", cap: " + cliente.getCl_cap());
            System.out.print(", provincia: " + cliente.getCl_provincia());               
            System.out.print(", nazione: " + cliente.getCl_nazione());
            System.out.print(", cod_fiscale: " + cliente.getCl_codice_fiscale());
            System.out.print(", partita_iva: " + cliente.getCl_partita_iva());
            System.out.print(", cl_data_nascita: " + cliente.getCl_data_nascita());
            System.out.print(", cl_citta_nascita: " + cliente.getCl_citta_nascita());                
            System.out.print(", cl_provincia_nascita: " + cliente.getCl_provincia_nascita());                
            System.out.print(", cl_nazione_nascita: " + cliente.getCl_nazione_nascita());
            System.out.print(", cl_data_inserimento: " + cliente.getCl_data_inserimento());
            System.out.print(", cl_note: " + cliente.getCl_note());
            System.out.print(", c.cl_op_ultima_mod: " + cliente.getCl_op_ultima_mod());
            System.out.print(", cl_op_creazione: " + cliente.getCl_op_creazione());
            System.out.print(", cl_note_fatturazione: " + cliente.getCl_note_fatturazione());
            System.out.print(", cl_email: " + cliente.getCl_email());
            System.out.print(", c.cl_data_ultima_mod: " + cliente.getCl_data_ultima_mod());
            System.out.print(", cl_altri_rec_fatt: " + cliente.getCl_altri_rec_fatt());
            System.out.print(", cl_altri_rec_gest: " + cliente.getCl_altri_rec_gest());
            System.out.print(", cl_codice_iva: " + cliente.getCl_codice_iva());
            System.out.print(", cl_utilizzatore: " + cliente.getCl_utilizzatore());
            System.out.print(", cl_titolo_fattura: " + cliente.getCl_titolo_fattura());
            System.out.print(", cl_esatto_eur: " + cliente.getCl_esatto_eur());
            System.out.print(", cl_esatto_lis: " + cliente.getCl_esatto_lis());
            System.out.print(", inm_id: " + cliente.getInm_id());
            System.out.print(", cl_pagamento_consolidato: " + cliente.getCl_pagamento_consolidato());
            System.out.print(", cl_provenienza: " + cliente.getCl_provenienza());
            System.out.print(", cl_flaganagrafica: " + cliente.isCl_flaganagrafica());
            System.out.print(", cl_consenso: " + cliente.isCl_consenso());
            
                
                System.out.println();
                
            
        }
        System.out.println("=====Fine della stampa=====");
        System.out.println();       
        
    }
    
}
