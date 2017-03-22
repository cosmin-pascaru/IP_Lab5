package com;

import java.util.ArrayList;

public class Piesa {

  private Integer id;

  private String nume;

  private ArrayList<OcupareSala> ocupari;
  private ArrayList<Actor>  actori;

  private Aplicatie aplicatie;

  public Piesa(Aplicatie aplicatie, Integer id, String nume){
        this.aplicatie = aplicatie;
        this.id = id;
        this.nume = nume;

        ocupari = new ArrayList<>();
        actori = new ArrayList<>();
  }

  public void vizualizareActori() {
  }

  public void vizualizareDateDIsponibile() {
  }

  public void vizualizareLocuri( String data) {
  }

  public void vizualizareActor( Actor actor) {
  }

}