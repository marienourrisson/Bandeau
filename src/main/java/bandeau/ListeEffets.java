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
public class ListeEffets {
    
    public Effet effets;
    public Scenario scenario;
    public int repetitions;

    public ListeEffets(Effet effets, Scenario scenario, int repetitions) {
        this.effets = effets;
        this.scenario = scenario;
        this.repetitions = repetitions;
    }

    public Effet getEffets() {
        return effets;
    }

    public void setEffets(Effet effets) {
        this.effets = effets;
    }

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }
    
}
