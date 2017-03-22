package com;

public class Banca {

  private String nume;
  private Integer id;
  private Aplicatie aplicatie;

  public Banca(String nume, Integer id, Aplicatie aplicatie){
    this.nume = nume;
    this.id = id;
    this.aplicatie = aplicatie;
  }

  public void tranzactie( Integer suma,  Client client) {
  }

  public void tranzactieCard( Integer suma,  Client client) {
  }

  public void tranzactieTransfer( Integer suma,  Client client) {
  }

}