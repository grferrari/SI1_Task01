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
public class Task01_SI1 {

    public static void main(String[] args) {

        ArrayList<State> path = new ArrayList<State>();
        ArrayList<State> graph = new ArrayList<State>();
        int numStates = 5;
        /*Inicializar Actions*/
        Action action1 = new Action(19.1, "Portal da Graciosa", "Sao Joao");
        Action action2 = new Action(13.2, "Sao Joao", "Morretes");
        Action action3 = new Action(17.7, "Sao Joao", "Bufara");
        Action action4 = new Action(7, "Morretes", "Bufara");
        Action action5 = new Action(6.9, "Bufara", "Antonina");
        /*Inicializar States*/
        ArrayList<Action> listAction1 = new ArrayList<Action>();
        listAction1.add(action1);
        State state1 = new State("Portal da Graciosa", listAction1);
        graph.add(state1);
        ArrayList<Action> listAction2 = new ArrayList<Action>();
        listAction2.add(action1);
        listAction2.add(action2);
        listAction2.add(action3);
        State state2 = new State("Sao Joao", listAction2);
        graph.add(state2);
        ArrayList<Action> listAction3 = new ArrayList<Action>();
        listAction3.add(action2);
        listAction3.add(action4);
        State state3 = new State("Morretes", listAction3);
        graph.add(state3);
        ArrayList<Action> listAction4 = new ArrayList<Action>();
        listAction4.add(action3);
        listAction4.add(action4);
        listAction4.add(action5);
        State state4 = new State("Bufara", listAction4);
        graph.add(state4);
        ArrayList<Action> listAction5 = new ArrayList<Action>();
        listAction5.add(action5);
        State state5 = new State("Antonina", listAction5);
        graph.add(state5);

        Environment e = new Environment(graph, numStates,
                state1, state5);
        Agent agent = new Agent(e);

        State stateToAdd;
        /*Enquanto o ambiente não chegar no estado objetivo, realiza o processo abaixo*/
        while (!(e.getCurrentState().getId().equals(state5.getId()))) {
            agent.agentCreed(e.getCurrentState());
            /*capturar percepção (ou percepções) do ambiente*/
            /*o deliberar (escolha da próxima ação)*/
            /*o executar ação no ambiente (em resposta a uma ação, o
            ambiente deve mudar de estado)*/
            stateToAdd = e.executeAction(agent.nextAction(e.getCurrentState()));
            if(stateToAdd != null){
                path.add(stateToAdd);
            }
        }
        System.out.println("Caminho: ");
        for(int i = 0; i < path.size(); i++){
            System.out.println(path.get(i).getId());
        }
    }
}
