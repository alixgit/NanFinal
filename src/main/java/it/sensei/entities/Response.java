
package it.sensei.entities;

import java.util.List;


public class Response {
    
    List<Prova> clientiNucleo;
    
    List<Risultato> clientiContratto;

    String message;

    public List<Prova> getClientiNucleo() {
        return clientiNucleo;
    }

    public void setClientiNucleo(List<Prova> clientiNucleo) {
        this.clientiNucleo = clientiNucleo;
    }

    public List<Risultato> getClientiContratto() {
        return clientiContratto;
    }

    public void setClientiContratto(List<Risultato> clientiContratto) {
        this.clientiContratto = clientiContratto;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }   
    
}
