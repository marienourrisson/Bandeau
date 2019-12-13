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
public class Zoom extends Effet {

    @Override
    public void Appliquer(Bandeau bandeau) {
        bandeau.setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
        bandeau.setFont(new Font("Dialog", Font.BOLD, 15));
    }
}