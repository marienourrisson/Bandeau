/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;

/**
 *
 * @author Marie
 */
public class Scenario {

    public ArrayList<ListeEffets> effets;

    public String nom;

    public Scenario(String n) {
        this.nom = n;
        this.effets=new ArrayList<ListeEffets>();
    }

    public void ajouterEffet(int nbRep, Effet effet) {
        ListeEffets o = new ListeEffets(effet, this, nbRep);
        effets.add(o);
    }

    public void jouerScenario(Bandeau bandeau) {
        for (ListeEffets l : effets) {
            for (int i = 0; i < l.getRepetitions(); i++) {
                l.getEffets().Appliquer(bandeau);
            }
        }
    }

}
