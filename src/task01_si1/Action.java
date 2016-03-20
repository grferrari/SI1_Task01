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
public class Action {
    
    private double value;
    private String State01;
    private String State02;
    
    public Action(double value, String state01, String state02) {
        this.State01 = state01;
        this.State02 = state02;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public String getState01() {
        return State01;
    }

    public String getState02() {
        return State02;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setState01(String State01) {
        this.State01 = State01;
    }

    public void setState02(String State02) {
        this.State02 = State02;
    }
    
}
