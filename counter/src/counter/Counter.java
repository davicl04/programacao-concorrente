/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package counter;

/**
 *
 * @author davi.lopes
 */
public class Counter {
    private Integer value;
    
    public Counter(Integer value){
        this.value = value;
    }
    
    public Integer getValue(){
        return this.value;
    }
    
    public void increment(){
        this.value++;
    }
    
}
