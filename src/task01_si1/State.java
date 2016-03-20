/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task01_si1;

import java.util.ArrayList;

/**
 *
 * @author Gabriel e Henrique
 */
public class State {
    private String id;
    private ArrayList <Action> actions;
    
     public State(String id, ArrayList <Action> actions){
         this.id = id;
         this.actions = actions;
     }

    public String getId() {
        return id;
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setActions(ArrayList<Action> actions) {
        this.actions = actions;
    }
}
