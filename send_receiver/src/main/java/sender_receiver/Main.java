/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sender_receiver;

/**
 *
 * @author davi.lopes
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        String[] messages = {
            "mensage 1",
            "mensage 2",
            "mensage 3",
            "mensage 4",
            "END"
        };
        
        Sender s1 = new Sender(data, messages);
        Receiver r1 = new Receiver(data);
        
        s1.start();
        r1.start();
    }
}
