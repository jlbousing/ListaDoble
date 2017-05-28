/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listad;

/**
 *
 * @author Sony
 */
public class Nodo {
    
    private int data;
    private Nodo ant;
    private Nodo prox;
    
    public Nodo(int data){
        this.data = data;
        this.ant = null;
        this.prox = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Nodo getProx() {
        return prox;
    }

    public void setProx(Nodo prox) {
        this.prox = prox;
    }
    
    public void Mostrar(){
        System.out.println(data);
    }
}
