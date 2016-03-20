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
public class Agent {

    private State firstState;
    private State goalState;
    private Environment e;
    private ArrayList<State> graph;//matriz representando o grafo

    /*Usando neste teste somente para demonstrar o código já que por enquanto
    não foi colocado um algoritmo de busca*/
    //RESPOSTA
    private double[] actionPathValue = {19.1, 13.2, 7, 6.9};
    private String[] statePathValue = {"Sao Joao", "Morretes", "Bufara", "Antonina"};
    private int actionPoint;

    public Agent(Environment e) {
        this.e = e;
        this.graph = e.getGraph();
        this.firstState = e.getFirstState();
        this.goalState = e.getGoalState();

        actionPoint = 0;
    }

    public String nextAction(State currentState) {
        ArrayList<Action> action; //aux para o arraylist do estado currentState
        Action current; //ação atual a ser analisada
        String s1, s2; //representa os estados possiveis da ação atual
        String nextState = "";

        action = currentState.getActions();
        /*Procura dentre as ações possivies do estado atual*/
        for (int i = 0; i < action.size(); i++) {
            current = action.get(i);
            if (current.getValue() == actionPathValue[actionPoint]) {
                s1 = current.getState01();
                s2 = current.getState02();
                if (s1.equals(currentState.getId())) {
                    nextState = s2;
                } else if (s2.equals(currentState.getId())) {
                    nextState = s1;
                }
            }
            //Validação usada apenas neste código onde a responsa foi informada préviamente
            if (nextState.equals(statePathValue[actionPoint])) {
                break;
            }
        }
        actionPoint++;
        return nextState;
    }

    /*Aqui será colocado o algoritmo de busca para gerar a resposta antes de 
    iniciar as ações no ambiente*/
    public void executePath() {

    }

    /*Print na tela os penssamentos atuais o agent sobre a proxima ação*/
    public void agentCreed(State currentState) {
        System.out.println("Estado Atual: " + currentState.getId() + ", Próximo Estado: "
                + statePathValue[actionPoint] + ", Valor da ação: " + actionPathValue[actionPoint]);
    }
}
