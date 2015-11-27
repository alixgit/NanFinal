
package funzioni;

import it.sensei.entities.Prova;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class DisplayNan {
    
    public void listNan() throws IOException, Exception {
    
        Reader reader = Resources.getResourceAsReader("Nucleo_config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
        SqlSession session = sqlSessionFactory.openSession();
        
        
        List<Prova> prove = session.selectList("it.sensei.entities.Prova.getAll");
        Iterator<Prova> iterator = prove.iterator();
                    
        System.out.println("===Ecco la lista dei clienti di NAN:===");
        while(iterator.hasNext()) {
            Prova prova = (Prova)iterator.next();
//            System.out.print("cod_cliente: " + prova.getCl_codice());
//                System.out.print(", cod_fiscale: " + prova.getCl_codice_fiscale());
//                System.out.print(", partita_iva: " + prova.getCl_partita_iva());
//                System.out.print(", titolo: " + prova.getCl_titolo());
//                System.out.print(", indirizzo: " + prova.getCl_indirizzo());
//                System.out.print(", civico: " + prova.getCl_civico());
//                System.out.print(", citta: " + prova.getCl_citta());
//                System.out.print(", provincia: " + prova.getCl_provincia());
//                System.out.print(", cap: " + prova.getCl_cap());
//                System.out.print(", nazione: " + prova.getCl_nazione());
//                System.out.print(", email: " + prova.getCl_email());
//                System.out.print(", cod_pagamento: " + prova.getCdft_cobra());
//                System.out.print(", dsc_pagamento: " + prova.getCl_pagamento_consolidato());
//                System.out.print(", cod_iva: " + prova.getCdft_valore());
//                System.out.print(", dsc_iva: " + prova.getCl_codice_iva());
//                System.out.print(", dsc_banca: " + prova.getBa_nome());
//                System.out.print(", dsc_agenzia: " + prova.getBa_agenzia());
//                System.out.print(", cc_iban: " + prova.getClba_iban());
//                System.out.print(", cc_intestatario: " + prova.getClba_intestatario());
//                System.out.print(", cc_cognome: " + prova.getClba_cognome());
//                System.out.print(", cc_nome: " + prova.getClba_nome());
//                System.out.print(", cc_cod_fiscale: " + prova.getClba_codice_fiscale());
//                System.out.print(", c.cl_data_ultima_mod: " + prova.getCl_data_ultima_mod());
//                System.out.print(", cellulare: " + prova.getTe_numero_originale());
                System.out.println();
                
            
        }
        System.out.println("=====Fine della stampa=====");
        System.out.println();       
        
    }
    
}
