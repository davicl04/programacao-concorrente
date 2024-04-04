/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package counter;

/**
 *
 * @author davi.lopes
 */
public class Main {
    public static void main(String[] args){
        int numExec = 0;
        while(true){
        Counter counter = new Counter(0);
        
        Incrementer inc1 = new Incrementer(counter);
        Incrementer inc2 = new Incrementer(counter);
        
        inc1.start();
        inc2.start();
        
        try {
            inc1.join();
            inc2.join();
        } catch (InterruptedException e) {
            System.out.println("Erro: Thread foi interrompida!");
        }
        numExec++;
        if (counter.getValue() != 2) {
            System.out.println(
                    "Numero de execuções: "+ numExec +
                    "\nValor final do contador: "+
                            counter.getValue());
        
            break;
        }
       }
    }
}
