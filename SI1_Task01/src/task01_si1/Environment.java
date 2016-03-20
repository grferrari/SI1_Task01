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
public class Environment {

    private ArrayList<State> graph; //grafo
    private int numStates; //tamanho do grafo
    private State firstState; //primeiro estado
    private State currentState; //estado atual
    private State goalState; //estado objetivo    

    /**
     * Inicializar o ambiente a ser analisado.
     *
     * @param graph
     * @param numStates
     * @param firstState
     * @param goalState
     */
    public Environment(ArrayList<State> graph, int numStates,
            State firstState, State goalState) {
        this.graph = graph;
        this.numStates = numStates;
        this.firstState = firstState;
        this.goalState = goalState;
        this.currentState = firstState;
    }

    /*Pega as percepções atuais do sistema*/
    public State capturePercept() {
        return currentState;
    }

    public State executeAction(String nextState) {
        State s, addState = null;
        for (int i = 0; i < graph.size(); i++) {
            s = graph.get(i);
            if (s.getId().equals(nextState)) {
                addState = currentState;
                currentState = s;
            }
        }
        return addState;
    }

    public State getFirstState() {
        return this.firstState;
    }

    public State getGoalState() {
        return this.goalState;
    }

    public State getCurrentState() {
        return this.currentState;
    }

    public ArrayList<State> getGraph() {
        return this.graph;
    }

}
