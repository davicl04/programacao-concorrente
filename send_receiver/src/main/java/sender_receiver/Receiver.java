/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sender_receiver;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author davi.lopes
 */
public class Receiver extends Thread{
    private Data data;
    
    public Receiver(Data data){
        this.data = data;
    }
    
    public void run() {
        while (true) {            
            String mensageReceived = this.data.receive();
            //delay "aleatório" entre 5 e 10s
            int randomDelay = ThreadLocalRandom.current().
                    nextInt(5000, 10000);
            try {
                Thread.sleep(randomDelay);
            } catch (Exception e) {
                System.out.println(
                        "Thread interrupted!!!");
            }
            if (mensageReceived.equals("END")) {
                break;
            }
        }
    }
}

