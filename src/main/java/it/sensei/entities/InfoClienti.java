
package it.sensei.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class InfoClienti {
    
    private List<String> list = new ArrayList<>();
    private Date cl_data_ultima_mod;
    private String cl_partita_iva;
   

    public InfoClienti() {
    }

    public Date getData() {
        return cl_data_ultima_mod;
    }

    public void setData(Date cl_data_ultima_mod) {
        this.cl_data_ultima_mod = cl_data_ultima_mod;
    }

    
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }

    public String getCl_partita_iva() {
        return cl_partita_iva;
    }

    public void setCl_partita_iva(String cl_partita_iva) {
        this.cl_partita_iva = cl_partita_iva;
    }
    
    
}
