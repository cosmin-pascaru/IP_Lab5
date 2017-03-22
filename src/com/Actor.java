package com;

import java.util.ArrayList;

public class Actor {

  private String nume;

  private String prenume;

  private String biografie;

  private Integer id;

  private ArrayList<Piesa> piese;

  public Actor(String nume , String prenume, String biografie, Integer id, ArrayList<Piesa> piese){
      this.nume = nume;
      this.prenume = prenume;
      this.biografie = biografie;
      this.id = id;
      this.piese = new ArrayList<>(piese);
  }

  public void add(Piesa piesa){
      piese.add(piesa);
  }
  @Override
    public String toString(){
      return (nume + " " + prenume + " " + biografie + " " + String.valueOf(id));
  }
}