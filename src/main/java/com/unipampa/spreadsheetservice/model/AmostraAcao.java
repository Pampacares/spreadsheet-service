package com.unipampa.spreadsheetservice.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(value = {"id", "amostra"})
@Getter
@Setter
@NoArgsConstructor
@Entity
public class AmostraAcao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "amostra_id", insertable = false, updatable = false)
  private Amostra amostra;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "acao_id", insertable = false, updatable = false)
  private Acao acao;

  private String data;
  private String obs;

  public AmostraAcao(Amostra amostra, Acao acao, String data, String obs) {
    this.amostra = amostra;
    this.acao = acao;
    this.data = data;
    this.obs = obs;
  }
}
