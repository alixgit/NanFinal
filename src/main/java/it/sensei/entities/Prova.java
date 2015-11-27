
package it.sensei.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Prova implements Serializable {
    
    @Id
    @Column(name = "cod_cliente")
    private String cod_cliente;
    
    private String fg_persona_fisica;
    
    @Column(name = "ragione_sociale")
    private String ragione_sociale;
    
    @Column(name = "cognome")
    private String cognome;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "cod_fiscale")
    private String cod_fiscale;
    
    @Column(name = "partita_iva")
    private String partita_iva;
 
    @Column(name = "titolo")
    private String titolo;
    
    @Column(name = "indirizzo")
    private String indirizzo;
    
    @Column(name = "civico")
    private String civico;
    
    @Column(name = "citta")
    private String citta;
    
   @Column(name = "provincia")
    private String provincia;
    
    @Column(name = "cap")
    private String cap;
    
    @Column(name = "nazione")
    private String nazione;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "cod_pagamento")
    private String cod_pagamento;
    
    @Column(name = "dsc_pagamento")
    private String dsc_pagamento;
    
    @Column(name = "cod_iva")
    private String cod_iva;
    
    @Column(name = "dsc_iva")
    private String dsc_iva;
    
    @Column(name = "dsc_banca")
    private String dsc_banca;
    
    @Column(name = "dsc_agenzia")
    private String dsc_agenzia;
    
    @Column(name = "cc_iban")
    private String cc_iban;
    
    @Column(name = "cc_intestatario")
    private String cc_intestatario;
    
    @Column(name = "cc_cognome")
    private String cc_cognome;
    
    @Column(name = "cc_nome")
    private String cc_nome;
    
    @Column(name = "cc_cod_fiscale")
    private String cc_cod_fiscale;    
    
    @Column(name = "cl_data_ultima_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cl_data_ultima_mod;
    
    private String cellulare;
    
 

    public Prova() {
    }

    public Prova(String cod_cliente, String fg_persona_fisica, String ragione_sociale, String cognome, String nome, String cod_fiscale, String partita_iva, String titolo, String indirizzo, String civico, String citta, String provincia, String cap, String nazione, String email, String cod_pagamento, String dsc_pagamento, String cod_iva, String dsc_iva, String dsc_banca, String dsc_agenzia, String cc_iban, String cc_intestatario, String cc_cognome, String cc_nome, String cc_cod_fiscale, Date cl_data_ultima_mod, String cellulare) {
        this.cod_cliente = cod_cliente;
        this.fg_persona_fisica = fg_persona_fisica;
        this.ragione_sociale = ragione_sociale;
        this.cognome = cognome;
        this.nome = nome;
        this.cod_fiscale = cod_fiscale;
        this.partita_iva = partita_iva;
        this.titolo = titolo;
        this.indirizzo = indirizzo;
        this.civico = civico;
        this.citta = citta;
        this.provincia = provincia;
        this.cap = cap;
        this.nazione = nazione;
        this.email = email;
        this.cod_pagamento = cod_pagamento;
        this.dsc_pagamento = dsc_pagamento;
        this.cod_iva = cod_iva;
        this.dsc_iva = dsc_iva;
        this.dsc_banca = dsc_banca;
        this.dsc_agenzia = dsc_agenzia;
        this.cc_iban = cc_iban;
        this.cc_intestatario = cc_intestatario;
        this.cc_cognome = cc_cognome;
        this.cc_nome = cc_nome;
        this.cc_cod_fiscale = cc_cod_fiscale;
        this.cl_data_ultima_mod = cl_data_ultima_mod;
        this.cellulare = cellulare;
    }

    public String getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(String cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getFg_persona_fisica() {
        return fg_persona_fisica;
    }

    public void setFg_persona_fisica(String fg_persona_fisica) {
        this.fg_persona_fisica = fg_persona_fisica;
    }

    public String getRagione_sociale() {
        return ragione_sociale;
    }

    public void setRagione_sociale(String ragione_sociale) {
        this.ragione_sociale = ragione_sociale;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod_fiscale() {
        return cod_fiscale;
    }

    public void setCod_fiscale(String cod_fiscale) {
        this.cod_fiscale = cod_fiscale;
    }

    public String getPartita_iva() {
        return partita_iva;
    }

    public void setPartita_iva(String partita_iva) {
        this.partita_iva = partita_iva;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCivico() {
        return civico;
    }

    public void setCivico(String civico) {
        this.civico = civico;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCod_pagamento() {
        return cod_pagamento;
    }

    public void setCod_pagamento(String cod_pagamento) {
        this.cod_pagamento = cod_pagamento;
    }

    public String getDsc_pagamento() {
        return dsc_pagamento;
    }

    public void setDsc_pagamento(String dsc_pagamento) {
        this.dsc_pagamento = dsc_pagamento;
    }

    public String getCod_iva() {
        return cod_iva;
    }

    public void setCod_iva(String cod_iva) {
        this.cod_iva = cod_iva;
    }

    public String getDsc_iva() {
        return dsc_iva;
    }

    public void setDsc_iva(String dsc_iva) {
        this.dsc_iva = dsc_iva;
    }

    public String getDsc_banca() {
        return dsc_banca;
    }

    public void setDsc_banca(String dsc_banca) {
        this.dsc_banca = dsc_banca;
    }

    public String getDsc_agenzia() {
        return dsc_agenzia;
    }

    public void setDsc_agenzia(String dsc_agenzia) {
        this.dsc_agenzia = dsc_agenzia;
    }

    public String getCc_iban() {
        return cc_iban;
    }

    public void setCc_iban(String cc_iban) {
        this.cc_iban = cc_iban;
    }

    public String getCc_intestatario() {
        return cc_intestatario;
    }

    public void setCc_intestatario(String cc_intestatario) {
        this.cc_intestatario = cc_intestatario;
    }

    public String getCc_cognome() {
        return cc_cognome;
    }

    public void setCc_cognome(String cc_cognome) {
        this.cc_cognome = cc_cognome;
    }

    public String getCc_nome() {
        return cc_nome;
    }

    public void setCc_nome(String cc_nome) {
        this.cc_nome = cc_nome;
    }

    public String getCc_cod_fiscale() {
        return cc_cod_fiscale;
    }

    public void setCc_cod_fiscale(String cc_cod_fiscale) {
        this.cc_cod_fiscale = cc_cod_fiscale;
    }

    public Date getCl_data_ultima_mod() {
        return cl_data_ultima_mod;
    }

    public void setCl_data_ultima_mod(Date cl_data_ultima_mod) {
        this.cl_data_ultima_mod = cl_data_ultima_mod;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    
    
}
