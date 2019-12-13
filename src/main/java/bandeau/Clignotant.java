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
public class Clignotant extends Effet {

    @Override
    public void Appliquer(Bandeau bandeau) {
        bandeau.setMessage("Hello");
        bandeau.sleep(1000);
        bandeau.setMessage(" ");
        bandeau.sleep(1000);

    }

}
