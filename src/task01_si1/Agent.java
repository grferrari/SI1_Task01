/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task01_si1;

/**
 *
 * @author gafer
 */
public class Agent {
    
    private String firstState;
    private String goalState;
    private Environment e; 
    private int[][] graph; //matriz representando o grafo
   
    
    public Agent(Environment e){
        this.e = e;
        this.graph = e.getGraph();
        this.firstState = e.getFirstState();
        this.goalState = e.getGoalState();
    }
    
    public void nextAction(){
        
    }
}
