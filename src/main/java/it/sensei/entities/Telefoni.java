
package it.sensei.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="telefoni")
@XmlRootElement
public class Telefoni implements Serializable {
    
    @Id
    @Column(name = "te_id")
    Integer te_id;
    
    Integer as_id;
    Integer ab_id;
    Integer cl_id;
    Integer util_id;
    Integer irm_id;
    Integer fo_id;
    Integer iri_id;
    Integer te_tt_id;
    Integer te_priorita;
    String te_per_allarme;
    String te_numero;
    @Column(name = "te_data_inserimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    Date te_data_inserimento;
        
    String te_tipo;
    String te_note;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date te_data_ultima_mod;
    String te_op_ultima_mod;
    String te_op_creazione;
    Integer im_id;
    Integer resp_id;
    String te_numero_originale;
    boolean te_sms;

    public Telefoni() {
    }

    public Telefoni(Integer te_id, Integer as_id, Integer ab_id, Integer cl_id, Integer util_id, Integer irm_id, Integer fo_id, Integer iri_id, Integer te_tt_id, Integer te_priorita, String te_per_allarme, String te_numero, Date te_data_inserimento, String te_tipo, String te_note, Date te_data_ultima_mod, String te_op_ultima_mod, String te_op_creazione, Integer im_id, Integer resp_id, String te_numero_originale, boolean te_sms) {
        this.te_id = te_id;
        this.as_id = as_id;
        this.ab_id = ab_id;
        this.cl_id = cl_id;
        this.util_id = util_id;
        this.irm_id = irm_id;
        this.fo_id = fo_id;
        this.iri_id = iri_id;
        this.te_tt_id = te_tt_id;
        this.te_priorita = te_priorita;
        this.te_per_allarme = te_per_allarme;
        this.te_numero = te_numero;
        this.te_data_inserimento = te_data_inserimento;
        this.te_tipo = te_tipo;
        this.te_note = te_note;
        this.te_data_ultima_mod = te_data_ultima_mod;
        this.te_op_ultima_mod = te_op_ultima_mod;
        this.te_op_creazione = te_op_creazione;
        this.im_id = im_id;
        this.resp_id = resp_id;
        this.te_numero_originale = te_numero_originale;
        this.te_sms = te_sms;
    }

    public Integer getTe_id() {
        return te_id;
    }

    public void setTe_id(Integer te_id) {
        this.te_id = te_id;
    }

    public Integer getAs_id() {
        return as_id;
    }

    public void setAs_id(Integer as_id) {
        this.as_id = as_id;
    }

    public Integer getAb_id() {
        return ab_id;
    }

    public void setAb_id(Integer ab_id) {
        this.ab_id = ab_id;
    }

    public Integer getCl_id() {
        return cl_id;
    }

    public void setCl_id(Integer cl_id) {
        this.cl_id = cl_id;
    }

    public Integer getUtil_id() {
        return util_id;
    }

    public void setUtil_id(Integer util_id) {
        this.util_id = util_id;
    }

    public Integer getIrm_id() {
        return irm_id;
    }

    public void setIrm_id(Integer irm_id) {
        this.irm_id = irm_id;
    }

    public Integer getFo_id() {
        return fo_id;
    }

    public void setFo_id(Integer fo_id) {
        this.fo_id = fo_id;
    }

    public Integer getIri_id() {
        return iri_id;
    }

    public void setIri_id(Integer iri_id) {
        this.iri_id = iri_id;
    }

    public Integer getTe_tt_id() {
        return te_tt_id;
    }

    public void setTe_tt_id(Integer te_tt_id) {
        this.te_tt_id = te_tt_id;
    }

    public Integer getTe_priorita() {
        return te_priorita;
    }

    public void setTe_priorita(Integer te_priorita) {
        this.te_priorita = te_priorita;
    }

    public String getTe_per_allarme() {
        return te_per_allarme;
    }

    public void setTe_per_allarme(String te_per_allarme) {
        this.te_per_allarme = te_per_allarme;
    }

    public String getTe_numero() {
        return te_numero;
    }

    public void setTe_numero(String te_numero) {
        this.te_numero = te_numero;
    }

    public Date getTe_data_inserimento() {
        return te_data_inserimento;
    }

    public void setTe_data_inserimento(Date te_data_inserimento) {
        this.te_data_inserimento = te_data_inserimento;
    }

    public String getTe_tipo() {
        return te_tipo;
    }

    public void setTe_tipo(String te_tipo) {
        this.te_tipo = te_tipo;
    }

    public String getTe_note() {
        return te_note;
    }

    public void setTe_note(String te_note) {
        this.te_note = te_note;
    }

    public Date getTe_data_ultima_mod() {
        return te_data_ultima_mod;
    }

    public void setTe_data_ultima_mod(Date te_data_ultima_mod) {
        this.te_data_ultima_mod = te_data_ultima_mod;
    }

    public String getTe_op_ultima_mod() {
        return te_op_ultima_mod;
    }

    public void setTe_op_ultima_mod(String te_op_ultima_mod) {
        this.te_op_ultima_mod = te_op_ultima_mod;
    }

    public String getTe_op_creazione() {
        return te_op_creazione;
    }

    public void setTe_op_creazione(String te_op_creazione) {
        this.te_op_creazione = te_op_creazione;
    }

    public Integer getIm_id() {
        return im_id;
    }

    public void setIm_id(Integer im_id) {
        this.im_id = im_id;
    }

    public Integer getResp_id() {
        return resp_id;
    }

    public void setResp_id(Integer resp_id) {
        this.resp_id = resp_id;
    }

    public String getTe_numero_originale() {
        return te_numero_originale;
    }

    public void setTe_numero_originale(String te_numero_originale) {
        this.te_numero_originale = te_numero_originale;
    }

    public boolean isTe_sms() {
        return te_sms;
    }

    public void setTe_sms(boolean te_sms) {
        this.te_sms = te_sms;
    }
    
    
 
    
}
