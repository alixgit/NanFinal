
package it.sensei.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="periferiche_mobili")
@XmlRootElement
public class Periferiche_mobili implements Serializable {
    
    @Id
     
    private Integer pm_id;
    private String pm_code;
    private Integer osm_id;
    private Integer fo_id;
    private String pm_cod_art;
    private String pm_cod_hw;
    private String pm_note;
    private String pm_decodifica;
    private String pm_versione;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date pm_data_ultima_mod;
    private String pm_op_ultima_mod;
    private String pm_op_inserimento;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date pm_data_inserimento;
    private String pm_nome;
    private String pm_firmware;
    private String pm_in_kit;
    private Integer pm_prezzo;
    private String prm_fatturato;
    private String pm_cod;
    private String pm_stato;
    private String pm_stampa;
    private String pm_stampa2;
    private String pm_fatturato;
    private String pm_release;
    private String pm_kit_stampa;
    private String pm_lotto;
    private String pm_codice_kit;

    public Periferiche_mobili() {
    }

    public Periferiche_mobili(Integer pm_id, String pm_code, Integer osm_id, Integer fo_id, String pm_cod_art, String pm_cod_hw, String pm_note, String pm_decodifica, String pm_versione, Date pm_data_ultima_mod, String pm_op_ultima_mod, String pm_op_inserimento, Date pm_data_inserimento, String pm_nome, String pm_firmware, String pm_in_kit, Integer pm_prezzo, String prm_fatturato, String pm_cod, String pm_stato, String pm_stampa, String pm_stampa2, String pm_fatturato, String pm_release, String pm_kit_stampa, String pm_lotto, String pm_codice_kit) {
        this.pm_id = pm_id;
        this.pm_code = pm_code;
        this.osm_id = osm_id;
        this.fo_id = fo_id;
        this.pm_cod_art = pm_cod_art;
        this.pm_cod_hw = pm_cod_hw;
        this.pm_note = pm_note;
        this.pm_decodifica = pm_decodifica;
        this.pm_versione = pm_versione;
        this.pm_data_ultima_mod = pm_data_ultima_mod;
        this.pm_op_ultima_mod = pm_op_ultima_mod;
        this.pm_op_inserimento = pm_op_inserimento;
        this.pm_data_inserimento = pm_data_inserimento;
        this.pm_nome = pm_nome;
        this.pm_firmware = pm_firmware;
        this.pm_in_kit = pm_in_kit;
        this.pm_prezzo = pm_prezzo;
        this.prm_fatturato = prm_fatturato;
        this.pm_cod = pm_cod;
        this.pm_stato = pm_stato;
        this.pm_stampa = pm_stampa;
        this.pm_stampa2 = pm_stampa2;
        this.pm_fatturato = pm_fatturato;
        this.pm_release = pm_release;
        this.pm_kit_stampa = pm_kit_stampa;
        this.pm_lotto = pm_lotto;
        this.pm_codice_kit = pm_codice_kit;
    }

    public Integer getPm_id() {
        return pm_id;
    }

    public void setPm_id(Integer pm_id) {
        this.pm_id = pm_id;
    }

    public String getPm_code() {
        return pm_code;
    }

    public void setPm_code(String pm_code) {
        this.pm_code = pm_code;
    }

    public Integer getOsm_id() {
        return osm_id;
    }

    public void setOsm_id(Integer osm_id) {
        this.osm_id = osm_id;
    }

    public Integer getFo_id() {
        return fo_id;
    }

    public void setFo_id(Integer fo_id) {
        this.fo_id = fo_id;
    }

    public String getPm_cod_art() {
        return pm_cod_art;
    }

    public void setPm_cod_art(String pm_cod_art) {
        this.pm_cod_art = pm_cod_art;
    }

    public String getPm_cod_hw() {
        return pm_cod_hw;
    }

    public void setPm_cod_hw(String pm_cod_hw) {
        this.pm_cod_hw = pm_cod_hw;
    }

    public String getPm_note() {
        return pm_note;
    }

    public void setPm_note(String pm_note) {
        this.pm_note = pm_note;
    }

    public String getPm_decodifica() {
        return pm_decodifica;
    }

    public void setPm_decodifica(String pm_decodifica) {
        this.pm_decodifica = pm_decodifica;
    }

    public String getPm_versione() {
        return pm_versione;
    }

    public void setPm_versione(String pm_versione) {
        this.pm_versione = pm_versione;
    }

    public Date getPm_data_ultima_mod() {
        return pm_data_ultima_mod;
    }

    public void setPm_data_ultima_mod(Date pm_data_ultima_mod) {
        this.pm_data_ultima_mod = pm_data_ultima_mod;
    }

    public String getPm_op_ultima_mod() {
        return pm_op_ultima_mod;
    }

    public void setPm_op_ultima_mod(String pm_op_ultima_mod) {
        this.pm_op_ultima_mod = pm_op_ultima_mod;
    }

    public String getPm_op_inserimento() {
        return pm_op_inserimento;
    }

    public void setPm_op_inserimento(String pm_op_inserimento) {
        this.pm_op_inserimento = pm_op_inserimento;
    }

    public Date getPm_data_inserimento() {
        return pm_data_inserimento;
    }

    public void setPm_data_inserimento(Date pm_data_inserimento) {
        this.pm_data_inserimento = pm_data_inserimento;
    }

    public String getPm_nome() {
        return pm_nome;
    }

    public void setPm_nome(String pm_nome) {
        this.pm_nome = pm_nome;
    }

    public String getPm_firmware() {
        return pm_firmware;
    }

    public void setPm_firmware(String pm_firmware) {
        this.pm_firmware = pm_firmware;
    }

    public String getPm_in_kit() {
        return pm_in_kit;
    }

    public void setPm_in_kit(String pm_in_kit) {
        this.pm_in_kit = pm_in_kit;
    }

    public Integer getPm_prezzo() {
        return pm_prezzo;
    }

    public void setPm_prezzo(Integer pm_prezzo) {
        this.pm_prezzo = pm_prezzo;
    }

    public String getPrm_fatturato() {
        return prm_fatturato;
    }

    public void setPrm_fatturato(String prm_fatturato) {
        this.prm_fatturato = prm_fatturato;
    }

    public String getPm_cod() {
        return pm_cod;
    }

    public void setPm_cod(String pm_cod) {
        this.pm_cod = pm_cod;
    }

    public String getPm_stato() {
        return pm_stato;
    }

    public void setPm_stato(String pm_stato) {
        this.pm_stato = pm_stato;
    }

    public String getPm_stampa() {
        return pm_stampa;
    }

    public void setPm_stampa(String pm_stampa) {
        this.pm_stampa = pm_stampa;
    }

    public String getPm_stampa2() {
        return pm_stampa2;
    }

    public void setPm_stampa2(String pm_stampa2) {
        this.pm_stampa2 = pm_stampa2;
    }

    public String getPm_fatturato() {
        return pm_fatturato;
    }

    public void setPm_fatturato(String pm_fatturato) {
        this.pm_fatturato = pm_fatturato;
    }

    public String getPm_release() {
        return pm_release;
    }

    public void setPm_release(String pm_release) {
        this.pm_release = pm_release;
    }

    public String getPm_kit_stampa() {
        return pm_kit_stampa;
    }

    public void setPm_kit_stampa(String pm_kit_stampa) {
        this.pm_kit_stampa = pm_kit_stampa;
    }

    public String getPm_lotto() {
        return pm_lotto;
    }

    public void setPm_lotto(String pm_lotto) {
        this.pm_lotto = pm_lotto;
    }

    public String getPm_codice_kit() {
        return pm_codice_kit;
    }

    public void setPm_codice_kit(String pm_codice_kit) {
        this.pm_codice_kit = pm_codice_kit;
    }
    
    
    
}
