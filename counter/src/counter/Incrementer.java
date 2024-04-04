/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package counter;

/**
 *
 * @author davi.lopes
 */
public class Incrementer extends Thread{
    private Counter counter;
    
    public Incrementer(Counter counter){
        this.counter = counter;
    }
    
    @Override
    public void run(){
        System.out.println(
                this.getName() + " está sendo incrementado...");
        this.counter.increment();
    }
}
