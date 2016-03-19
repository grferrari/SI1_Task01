/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task01_si1;

/**
 *
 * @author Gabriel e Henrique
 */
public class Environment {

    private int[][] graph; //matriz representando o grafo
    private String[] states; //array com os valores dos estados do grafo
    private int numStates; //Tamanho do grafo
    private String firstState; //primeiro estado
    private String currentState; //estado atual
    private String goalState; //estado objetivo

    /**
     * Inicializar o ambiente a ser analisado.
     *
     * @param graph
     * @param states
     * @param graphSize
     */
    public Environment(int[][] graph, String[] states, int numStates,
            String firstState, String goalState) {
        this.graph = graph;
        this.states = states;
        this.numStates = numStates;
        this.firstState = firstState;
        this.goalState = goalState;
    }

    public void capturePercept() {
       
    }

    public void executeAction() {

    }
    
    public String getFirstState() {
        return this.firstState;
    }
    
    public String getGoalState() {
        return this.goalState;
    }
    
    public String getCurrentState() {
        return this.currentState;
    }
    
    public int[][] getGraph(){
        return this.graph;
    }
    
}
