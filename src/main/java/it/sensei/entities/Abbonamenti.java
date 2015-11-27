
package it.sensei.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="abbonamenti")
@XmlRootElement
public class Abbonamenti implements Serializable  {
    
    @Id
    
    private String ab_forma_pagam1;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ab_data_fatturazione;
    private String ab_sconto;
    private Integer ab_id;
    private String ab_op_ultima_mod;
    private String ab_op_creazione;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ab_data_ult_mod;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ab_data_inserimento;
    private Integer ab_numero_rate3;
    private Double ab_rata;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ab_inizio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ab_scadenza;
    private String ab_nome;
    private String ab_note;
    private String ab_forma_pagam2;
    private String ab_code;
    private boolean ab_fatturare;
    private String ab_das;
    private Double ab_tg;
    private Double ab_vg;
    private Double ab_com;
    private Double ab_tel;
    private String ab_numero_rate;
    private String ab_durata_contratto;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ab_inizio_contratto;
    private String ab_altro_abbonamento;
    private String ab_zone;
    private Double ab_rata_old;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ab_data_modifica_rata;

    public Abbonamenti() {
    }

    public Abbonamenti(String ab_forma_pagam1, Date ab_data_fatturazione, String ab_sconto, Integer ab_id, String ab_op_ultima_mod, String ab_op_creazione, Date ab_data_ult_mod, Date ab_data_inserimento, Integer ab_numero_rate3, Double ab_rata, Date ab_inizio, Date ab_scadenza, String ab_nome, String ab_note, String ab_forma_pagam2, String ab_code, boolean ab_fatturare, String ab_das, Double ab_tg, Double ab_vg, Double ab_com, Double ab_tel, String ab_numero_rate, String ab_durata_contratto, Date ab_inizio_contratto, String ab_altro_abbonamento, String ab_zone, Double ab_rata_old, Date ab_data_modifica_rata) {
        this.ab_forma_pagam1 = ab_forma_pagam1;
        this.ab_data_fatturazione = ab_data_fatturazione;
        this.ab_sconto = ab_sconto;
        this.ab_id = ab_id;
        this.ab_op_ultima_mod = ab_op_ultima_mod;
        this.ab_op_creazione = ab_op_creazione;
        this.ab_data_ult_mod = ab_data_ult_mod;
        this.ab_data_inserimento = ab_data_inserimento;
        this.ab_numero_rate3 = ab_numero_rate3;
        this.ab_rata = ab_rata;
        this.ab_inizio = ab_inizio;
        this.ab_scadenza = ab_scadenza;
        this.ab_nome = ab_nome;
        this.ab_note = ab_note;
        this.ab_forma_pagam2 = ab_forma_pagam2;
        this.ab_code = ab_code;
        this.ab_fatturare = ab_fatturare;
        this.ab_das = ab_das;
        this.ab_tg = ab_tg;
        this.ab_vg = ab_vg;
        this.ab_com = ab_com;
        this.ab_tel = ab_tel;
        this.ab_numero_rate = ab_numero_rate;
        this.ab_durata_contratto = ab_durata_contratto;
        this.ab_inizio_contratto = ab_inizio_contratto;
        this.ab_altro_abbonamento = ab_altro_abbonamento;
        this.ab_zone = ab_zone;
        this.ab_rata_old = ab_rata_old;
        this.ab_data_modifica_rata = ab_data_modifica_rata;
    }

    public String getAb_forma_pagam1() {
        return ab_forma_pagam1;
    }

    public void setAb_forma_pagam1(String ab_forma_pagam1) {
        this.ab_forma_pagam1 = ab_forma_pagam1;
    }

    public Date getAb_data_fatturazione() {
        return ab_data_fatturazione;
    }

    public void setAb_data_fatturazione(Date ab_data_fatturazione) {
        this.ab_data_fatturazione = ab_data_fatturazione;
    }

    public String getAb_sconto() {
        return ab_sconto;
    }

    public void setAb_sconto(String ab_sconto) {
        this.ab_sconto = ab_sconto;
    }

    public Integer getAb_id() {
        return ab_id;
    }

    public void setAb_id(Integer ab_id) {
        this.ab_id = ab_id;
    }

    public String getAb_op_ultima_mod() {
        return ab_op_ultima_mod;
    }

    public void setAb_op_ultima_mod(String ab_op_ultima_mod) {
        this.ab_op_ultima_mod = ab_op_ultima_mod;
    }

    public String getAb_op_creazione() {
        return ab_op_creazione;
    }

    public void setAb_op_creazione(String ab_op_creazione) {
        this.ab_op_creazione = ab_op_creazione;
    }

    public Date getAb_data_ult_mod() {
        return ab_data_ult_mod;
    }

    public void setAb_data_ult_mod(Date ab_data_ult_mod) {
        this.ab_data_ult_mod = ab_data_ult_mod;
    }

    public Date getAb_data_inserimento() {
        return ab_data_inserimento;
    }

    public void setAb_data_inserimento(Date ab_data_inserimento) {
        this.ab_data_inserimento = ab_data_inserimento;
    }

    public Integer getAb_numero_rate3() {
        return ab_numero_rate3;
    }

    public void setAb_numero_rate3(Integer ab_numero_rate3) {
        this.ab_numero_rate3 = ab_numero_rate3;
    }

    public Double getAb_rata() {
        return ab_rata;
    }

    public void setAb_rata(Double ab_rata) {
        this.ab_rata = ab_rata;
    }

    public Date getAb_inizio() {
        return ab_inizio;
    }

    public void setAb_inizio(Date ab_inizio) {
        this.ab_inizio = ab_inizio;
    }

    public Date getAb_scadenza() {
        return ab_scadenza;
    }

    public void setAb_scadenza(Date ab_scadenza) {
        this.ab_scadenza = ab_scadenza;
    }

    public String getAb_nome() {
        return ab_nome;
    }

    public void setAb_nome(String ab_nome) {
        this.ab_nome = ab_nome;
    }

    public String getAb_note() {
        return ab_note;
    }

    public void setAb_note(String ab_note) {
        this.ab_note = ab_note;
    }

    public String getAb_forma_pagam2() {
        return ab_forma_pagam2;
    }

    public void setAb_forma_pagam2(String ab_forma_pagam2) {
        this.ab_forma_pagam2 = ab_forma_pagam2;
    }

    public String getAb_code() {
        return ab_code;
    }

    public void setAb_code(String ab_code) {
        this.ab_code = ab_code;
    }

    public boolean isAb_fatturare() {
        return ab_fatturare;
    }

    public void setAb_fatturare(boolean ab_fatturare) {
        this.ab_fatturare = ab_fatturare;
    }

    public String getAb_das() {
        return ab_das;
    }

    public void setAb_das(String ab_das) {
        this.ab_das = ab_das;
    }

    public Double getAb_tg() {
        return ab_tg;
    }

    public void setAb_tg(Double ab_tg) {
        this.ab_tg = ab_tg;
    }

    public Double getAb_vg() {
        return ab_vg;
    }

    public void setAb_vg(Double ab_vg) {
        this.ab_vg = ab_vg;
    }

    public Double getAb_com() {
        return ab_com;
    }

    public void setAb_com(Double ab_com) {
        this.ab_com = ab_com;
    }

    public Double getAb_tel() {
        return ab_tel;
    }

    public void setAb_tel(Double ab_tel) {
        this.ab_tel = ab_tel;
    }

    public String getAb_numero_rate() {
        return ab_numero_rate;
    }

    public void setAb_numero_rate(String ab_numero_rate) {
        this.ab_numero_rate = ab_numero_rate;
    }

    public String getAb_durata_contratto() {
        return ab_durata_contratto;
    }

    public void setAb_durata_contratto(String ab_durata_contratto) {
        this.ab_durata_contratto = ab_durata_contratto;
    }

    public Date getAb_inizio_contratto() {
        return ab_inizio_contratto;
    }

    public void setAb_inizio_contratto(Date ab_inizio_contratto) {
        this.ab_inizio_contratto = ab_inizio_contratto;
    }

    public String getAb_altro_abbonamento() {
        return ab_altro_abbonamento;
    }

    public void setAb_altro_abbonamento(String ab_altro_abbonamento) {
        this.ab_altro_abbonamento = ab_altro_abbonamento;
    }

    public String getAb_zone() {
        return ab_zone;
    }

    public void setAb_zone(String ab_zone) {
        this.ab_zone = ab_zone;
    }

    public Double getAb_rata_old() {
        return ab_rata_old;
    }

    public void setAb_rata_old(Double ab_rata_old) {
        this.ab_rata_old = ab_rata_old;
    }

    public Date getAb_data_modifica_rata() {
        return ab_data_modifica_rata;
    }

    public void setAb_data_modifica_rata(Date ab_data_modifica_rata) {
        this.ab_data_modifica_rata = ab_data_modifica_rata;
    }
    
    
    
}
