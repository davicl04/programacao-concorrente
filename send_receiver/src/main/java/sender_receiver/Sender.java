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
public class Sender extends Thread {
    private Data data;
    private String[] messages;
    
    public Sender(Data data, String[] messages) {
        this.data = data;
        this.messages = messages;
    }
    
    public void run() {
        //para cada mensagem da lista de mensagens
        for(String message: this.messages) {
            //delay "aleatório" entre 5 e 10s
            int randomDelay = ThreadLocalRandom.current().
                    nextInt(5000, 10000);
            
            try {
                Thread.sleep(randomDelay);
            } catch (Exception e) {
                System.out.println("Thread interrompida!!!");
            }
            this.data.send(message);
        }
    }
}
