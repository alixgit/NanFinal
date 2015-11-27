
package it.sensei.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="mobili")
@XmlRootElement
public class Mobili implements Serializable {
    
    @Id   
    private Integer mo_id;
    private String mo_code;
    private String mo_targa;
    private String mo_telaio;
    private String mo_colore;
    private String mo_marca;
    private String mo_modello;
    private String mo_anno;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date mo_data_inserimento;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date mo_data_ultima_mod;
    private String mo_op_ultima_mod;
    private String mo_op_creazione;
    private String mo_note;
    private String mo_tipo;

    public Mobili() {
    }

    public Mobili(Integer mo_id, String mo_code, String mo_targa, String mo_telaio, String mo_colore, String mo_marca, String mo_modello, String mo_anno, Date mo_data_inserimento, Date mo_data_ultima_mod, String mo_op_ultima_mod, String mo_op_creazione, String mo_note, String mo_tipo) {
        this.mo_id = mo_id;
        this.mo_code = mo_code;
        this.mo_targa = mo_targa;
        this.mo_telaio = mo_telaio;
        this.mo_colore = mo_colore;
        this.mo_marca = mo_marca;
        this.mo_modello = mo_modello;
        this.mo_anno = mo_anno;
        this.mo_data_inserimento = mo_data_inserimento;
        this.mo_data_ultima_mod = mo_data_ultima_mod;
        this.mo_op_ultima_mod = mo_op_ultima_mod;
        this.mo_op_creazione = mo_op_creazione;
        this.mo_note = mo_note;
        this.mo_tipo = mo_tipo;
    }

    public Integer getMo_id() {
        return mo_id;
    }

    public void setMo_id(Integer mo_id) {
        this.mo_id = mo_id;
    }

    public String getMo_code() {
        return mo_code;
    }

    public void setMo_code(String mo_code) {
        this.mo_code = mo_code;
    }

    public String getMo_targa() {
        return mo_targa;
    }

    public void setMo_targa(String mo_targa) {
        this.mo_targa = mo_targa;
    }

    public String getMo_telaio() {
        return mo_telaio;
    }

    public void setMo_telaio(String mo_telaio) {
        this.mo_telaio = mo_telaio;
    }

    public String getMo_colore() {
        return mo_colore;
    }

    public void setMo_colore(String mo_colore) {
        this.mo_colore = mo_colore;
    }

    public String getMo_marca() {
        return mo_marca;
    }

    public void setMo_marca(String mo_marca) {
        this.mo_marca = mo_marca;
    }

    public String getMo_modello() {
        return mo_modello;
    }

    public void setMo_modello(String mo_modello) {
        this.mo_modello = mo_modello;
    }

    public String getMo_anno() {
        return mo_anno;
    }

    public void setMo_anno(String mo_anno) {
        this.mo_anno = mo_anno;
    }

    public Date getMo_data_inserimento() {
        return mo_data_inserimento;
    }

    public void setMo_data_inserimento(Date mo_data_inserimento) {
        this.mo_data_inserimento = mo_data_inserimento;
    }

    public Date getMo_data_ultima_mod() {
        return mo_data_ultima_mod;
    }

    public void setMo_data_ultima_mod(Date mo_data_ultima_mod) {
        this.mo_data_ultima_mod = mo_data_ultima_mod;
    }

    public String getMo_op_ultima_mod() {
        return mo_op_ultima_mod;
    }

    public void setMo_op_ultima_mod(String mo_op_ultima_mod) {
        this.mo_op_ultima_mod = mo_op_ultima_mod;
    }

    public String getMo_op_creazione() {
        return mo_op_creazione;
    }

    public void setMo_op_creazione(String mo_op_creazione) {
        this.mo_op_creazione = mo_op_creazione;
    }

    public String getMo_note() {
        return mo_note;
    }

    public void setMo_note(String mo_note) {
        this.mo_note = mo_note;
    }

    public String getMo_tipo() {
        return mo_tipo;
    }

    public void setMo_tipo(String mo_tipo) {
        this.mo_tipo = mo_tipo;
    }
    
    
    
}
