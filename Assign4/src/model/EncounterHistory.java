/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author saloni
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterHist;

    public ArrayList<Encounter> getEncounterHist() {
        return encounterHist;
    }

    public void setEncounterHist(ArrayList<Encounter> encounterHist) {
        this.encounterHist = encounterHist;
    }
    
    public Encounter addNewEncounter()
    {
        Encounter e = new Encounter();
        this.encounterHist.add(e);
        return e;
    }

    public EncounterHistory() {
        this.encounterHist = new ArrayList<>();
    }
    
}
