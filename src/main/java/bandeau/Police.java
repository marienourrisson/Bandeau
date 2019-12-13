/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

/**
 *
 * @author Marie
 */
public class Police extends Effet {

    @Override
    public void Appliquer(Bandeau bandeau) {
        bandeau.setMessage("Hello");
        bandeau.sleep(1000);
        bandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        bandeau.sleep(1000);
        bandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        bandeau.sleep(1000);
        bandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
        bandeau.sleep(1000);
    }
}
