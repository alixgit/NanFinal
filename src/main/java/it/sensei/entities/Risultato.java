
package it.sensei.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement
public class Risultato   implements Serializable {
    
    @Id
    
    private Integer id_contratto;
    private Integer id_abbonamento;
    private String cod_cliente;
    private String tipo_soggetto;
    private String ragione_sociale;
    private String cognome;
    private String nome;
    private String codice_fiscale;
    private String partita_iva;
    private String cod_contratto;
    private String stato_abbonamento;
    private String stato_sistema;
    private String stato_mobile;
    private String stato_centrale;
    private String fg_fatturare;
    private String fg_disdetto_alla_scadenza;
    private String cod_servizio;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dt_fatturazione;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dt_inizio_competenza;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dt_scadenza_contratto;
    private String periodicita;
    private Double importo_rata;
    private String tipo_centralina;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dt_collaudo;
    private String targa;
    private String telaio;
    private String marca;
    private String modello;
    private String colore_vettura;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dt_prima_attivazione;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dt_ultima_attivazione;
    private String costo_hw;
    private String costo_canone;
    private String cod_contratto_padre;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dt_ultima_modifica_nan;

    public Risultato() {
    }

    public Risultato(Integer id_contratto, Integer id_abbonamento, String cod_cliente, String tipo_soggetto, String ragione_sociale, String cognome, String nome, String codice_fiscale, String partita_iva, String cod_contratto, String stato_abbonamento, String stato_sistema, String stato_mobile, String stato_centrale, String fg_fatturare, String fg_disdetto_alla_scadenza, String cod_servizio, Date dt_fatturazione, Date dt_inizio_competenza, Date dt_scadenza_contratto, String periodicita, Double importo_rata, String tipo_centralina, Date dt_collaudo, String targa, String telaio, String marca, String modello, String colore_vettura, Date dt_prima_attivazione, Date dt_ultima_attivazione, String costo_hw, String costo_canone, String cod_contratto_padre, Date dt_ultima_modifica_nan) {
        this.id_contratto = id_contratto;
        this.id_abbonamento = id_abbonamento;
        this.cod_cliente = cod_cliente;
        this.tipo_soggetto = tipo_soggetto;
        this.ragione_sociale = ragione_sociale;
        this.cognome = cognome;
        this.nome = nome;
        this.codice_fiscale = codice_fiscale;
        this.partita_iva = partita_iva;
        this.cod_contratto = cod_contratto;
        this.stato_abbonamento = stato_abbonamento;
        this.stato_sistema = stato_sistema;
        this.stato_mobile = stato_mobile;
        this.stato_centrale = stato_centrale;
        this.fg_fatturare = fg_fatturare;
        this.fg_disdetto_alla_scadenza = fg_disdetto_alla_scadenza;
        this.cod_servizio = cod_servizio;
        this.dt_fatturazione = dt_fatturazione;
        this.dt_inizio_competenza = dt_inizio_competenza;
        this.dt_scadenza_contratto = dt_scadenza_contratto;
        this.periodicita = periodicita;
        this.importo_rata = importo_rata;
        this.tipo_centralina = tipo_centralina;
        this.dt_collaudo = dt_collaudo;
        this.targa = targa;
        this.telaio = telaio;
        this.marca = marca;
        this.modello = modello;
        this.colore_vettura = colore_vettura;
        this.dt_prima_attivazione = dt_prima_attivazione;
        this.dt_ultima_attivazione = dt_ultima_attivazione;
        this.costo_hw = costo_hw;
        this.costo_canone = costo_canone;
        this.cod_contratto_padre = cod_contratto_padre;
        this.dt_ultima_modifica_nan = dt_ultima_modifica_nan;
    }

    public Integer getId_contratto() {
        return id_contratto;
    }

    public void setId_contratto(Integer id_contratto) {
        this.id_contratto = id_contratto;
    }

    public Integer getId_abbonamento() {
        return id_abbonamento;
    }

    public void setId_abbonamento(Integer id_abbonamento) {
        this.id_abbonamento = id_abbonamento;
    }

    public String getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(String cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getTipo_soggetto() {
        return tipo_soggetto;
    }

    public void setTipo_soggetto(String tipo_soggetto) {
        this.tipo_soggetto = tipo_soggetto;
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

    public String getCodice_fiscale() {
        return codice_fiscale;
    }

    public void setCodice_fiscale(String codice_fiscale) {
        this.codice_fiscale = codice_fiscale;
    }

    public String getPartita_iva() {
        return partita_iva;
    }

    public void setPartita_iva(String partita_iva) {
        this.partita_iva = partita_iva;
    }

    public String getCod_contratto() {
        return cod_contratto;
    }

    public void setCod_contratto(String cod_contratto) {
        this.cod_contratto = cod_contratto;
    }

    public String getStato_abbonamento() {
        return stato_abbonamento;
    }

    public void setStato_abbonamento(String stato_abbonamento) {
        this.stato_abbonamento = stato_abbonamento;
    }

    public String getStato_sistema() {
        return stato_sistema;
    }

    public void setStato_sistema(String stato_sistema) {
        this.stato_sistema = stato_sistema;
    }

    public String getStato_mobile() {
        return stato_mobile;
    }

    public void setStato_mobile(String stato_mobile) {
        this.stato_mobile = stato_mobile;
    }

    public String getStato_centrale() {
        return stato_centrale;
    }

    public void setStato_centrale(String stato_centrale) {
        this.stato_centrale = stato_centrale;
    }

    public String getFg_fatturare() {
        return fg_fatturare;
    }

    public void setFg_fatturare(String fg_fatturare) {
        this.fg_fatturare = fg_fatturare;
    }

    public String getFg_disdetto_alla_scadenza() {
        return fg_disdetto_alla_scadenza;
    }

    public void setFg_disdetto_alla_scadenza(String fg_disdetto_alla_scadenza) {
        this.fg_disdetto_alla_scadenza = fg_disdetto_alla_scadenza;
    }

    public String getCod_servizio() {
        return cod_servizio;
    }

    public void setCod_servizio(String cod_servizio) {
        this.cod_servizio = cod_servizio;
    }

    public Date getDt_fatturazione() {
        return dt_fatturazione;
    }

    public void setDt_fatturazione(Date dt_fatturazione) {
        this.dt_fatturazione = dt_fatturazione;
    }

    public Date getDt_inizio_competenza() {
        return dt_inizio_competenza;
    }

    public void setDt_inizio_competenza(Date dt_inizio_competenza) {
        this.dt_inizio_competenza = dt_inizio_competenza;
    }

    public Date getDt_scadenza_contratto() {
        return dt_scadenza_contratto;
    }

    public void setDt_scadenza_contratto(Date dt_scadenza_contratto) {
        this.dt_scadenza_contratto = dt_scadenza_contratto;
    }

    public String getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(String periodicita) {
        this.periodicita = periodicita;
    }

    public Double getImporto_rata() {
        return importo_rata;
    }

    public void setImporto_rata(Double importo_rata) {
        this.importo_rata = importo_rata;
    }

    public String getTipo_centralina() {
        return tipo_centralina;
    }

    public void setTipo_centralina(String tipo_centralina) {
        this.tipo_centralina = tipo_centralina;
    }

    public Date getDt_collaudo() {
        return dt_collaudo;
    }

    public void setDt_collaudo(Date dt_collaudo) {
        this.dt_collaudo = dt_collaudo;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getTelaio() {
        return telaio;
    }

    public void setTelaio(String telaio) {
        this.telaio = telaio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getColore_vettura() {
        return colore_vettura;
    }

    public void setColore_vettura(String colore_vettura) {
        this.colore_vettura = colore_vettura;
    }

    public Date getDt_prima_attivazione() {
        return dt_prima_attivazione;
    }

    public void setDt_prima_attivazione(Date dt_prima_attivazione) {
        this.dt_prima_attivazione = dt_prima_attivazione;
    }

    public Date getDt_ultima_attivazione() {
        return dt_ultima_attivazione;
    }

    public void setDt_ultima_attivazione(Date dt_ultima_attivazione) {
        this.dt_ultima_attivazione = dt_ultima_attivazione;
    }

    public String getCosto_hw() {
        return costo_hw;
    }

    public void setCosto_hw(String costo_hw) {
        this.costo_hw = costo_hw;
    }

    public String getCosto_canone() {
        return costo_canone;
    }

    public void setCosto_canone(String costo_canone) {
        this.costo_canone = costo_canone;
    }

    public String getCod_contratto_padre() {
        return cod_contratto_padre;
    }

    public void setCod_contratto_padre(String cod_contratto_padre) {
        this.cod_contratto_padre = cod_contratto_padre;
    }

    public Date getDt_ultima_modifica_nan() {
        return dt_ultima_modifica_nan;
    }

    public void setDt_ultima_modifica_nan(Date dt_ultima_modifica_nan) {
        this.dt_ultima_modifica_nan = dt_ultima_modifica_nan;
    }

    
    
}
