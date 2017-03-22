package com;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Vector;

public class Aplicatie {

  private static Aplicatie instance;

  public static Aplicatie getInstance(){
    if (instance == null){
      instance = new Aplicatie("v0.1");
    }
    return instance;
  }

  private Aplicatie(String s){
      versiune = s;
  }

  public String versiune;

  private ArrayList<Interfata> interfete;
  BD bd;

  public void vizualizarePiese() {
  }

  public void vizualizareBilete( Piesa piesa) {
  }

  public void rezerva( Client client,  Bilet bilet) {
  }

  public void cumpara( Client client,  Bilet bilet) {
  }

  public void cautaPiese( String s) {
  }

  public void vizualizareRecomandate() {
  }

  public void vizualizarePiese( String data) {
  }

  public void vizualizareActori( Piesa piesa) {
  }

  public void vizualizareActor( Actor actor) {
  }

}