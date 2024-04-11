/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sender_receiver;

/**
 *
 * @author davi.lopes
 */
public class Data {
    private String message;
    private boolean isSending = true;
    
    
    public synchronized void send(String message){
        while(!isSending){
            System.out.println("Waiting end of receiviment");
            // wait ...
            try {
                wait(); 
            } catch (Exception e) {
                System.out.println("Interrupted thread!");
            }

        }
        // send message
        this.message = message;
        System.out.println("Message sended: " +this.message);
        
        //send ended
        isSending = false;
    }
    
    public synchronized String receive(){
        while(isSending){
            // wait ...
        }
        // receive message
        String mensageReceived = this.message;
        System.out.println("Mensage received: " + mensageReceived);
        
        //end of receiviment
        isSending = true;
        
        //notify thread of sender
        notify();
        
        return mensageReceived;
    }
    
}
