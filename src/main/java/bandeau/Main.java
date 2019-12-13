/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author Marie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bandeau monBandeau = new Bandeau ();
        Scenario scenario = new Scenario ("Notre Scenario");
        
        Zoom zoom = new Zoom();
        Clignotant clignotant = new Clignotant();
        Police police = new Police();
        Rotation rotation = new Rotation();
        
        scenario.ajouterEffet(1, zoom);
        scenario.ajouterEffet(2, rotation);
        scenario.ajouterEffet(4, clignotant);
        scenario.ajouterEffet(2, police);
        
        
        
        scenario.jouerScenario(monBandeau);
    }
    
}
