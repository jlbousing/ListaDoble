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
public class ListaDoble {
    
    private Nodo _cabeza;

    public Nodo getCabeza() {
        return _cabeza;
    }

    public void setCabeza(Nodo _cabeza) {
        this._cabeza = _cabeza;
    }
    
    public ListaDoble(){
        _cabeza = null;
    }
    
    public void InsertaP(Nodo nuevo){
        
        if(_cabeza == null){
            _cabeza = nuevo; 
        }
        else{
            nuevo.setProx(_cabeza);
            _cabeza.setAnt(nuevo);
            _cabeza = nuevo;
        }
    }
    
    public void InsertaF(Nodo nuevo){
        
        if(_cabeza == null){
            _cabeza = nuevo;
        }
        else{
            
            Nodo aux = _cabeza;
            while(aux.getProx() != null){
                aux = aux.getProx();
            }
            
            nuevo.setAnt(aux);
            aux.setProx(nuevo);
            
        }
    }
    
    public Nodo EliminaP(){
        
        if(_cabeza == null){
            return null;
        }
        else if(_cabeza.getProx() == null){
            Nodo aux = _cabeza;
            _cabeza = null;
            return aux;
        }
        else{
            Nodo aux = _cabeza;
            aux.getProx().setAnt(null);
            _cabeza = aux.getProx();
            aux.setProx(null);
            return aux;
        }
    }
    
    public Nodo EliminaF(){
        
        if(_cabeza == null){
            return null;
            
        }
        else if(_cabeza.getProx() == null){
            Nodo aux = _cabeza;
            _cabeza = null;
            return aux;
        }
        else{
            
            Nodo aux = _cabeza;
            while(aux.getProx().getProx() == null){
                aux = aux.getProx();
            }
            
            Nodo aux2 = aux.getProx();
            aux.setProx(null);
            aux2.setAnt(null);
            return aux2;
        }
    }
    
    public Nodo EliminaPosicion(int pos){
        
        if(_cabeza == null){
            return null;
            
        }
        else if(_cabeza.getProx() == null){
            Nodo aux = _cabeza;
            _cabeza = null;
            return aux;
        }
        else{
           if(pos == 0){
               return EliminaP();
           }else{ 
               
            Nodo aux = _cabeza;
            int cont = 0;
            
            while(cont < pos && aux != null){
                aux = aux.getProx();
                cont++;
            }
            
            if(aux != null){
                if(aux.getProx() != null){
                    Nodo aux2 = aux.getProx();
                    aux.setProx(aux2.getProx());
                    aux2.getProx().setAnt(aux);
                    aux2.setAnt(null);
                    aux2.setProx(null);
                    return aux2;
                }else{
                     aux = EliminaF();
                     return aux;
                }
            }
            else{
                return null;
            }
            
           }
        }
    }
    
}
