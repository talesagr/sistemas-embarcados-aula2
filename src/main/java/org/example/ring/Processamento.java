package org.example.ring;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

@Getter
@Setter
public class Processamento {
    private int id;
    private boolean source = false;
    private boolean target = false;

    public boolean arbitrar(LinkedList<Processamento> processamentoLinkedList, int source){
        System.out.println("Procurando por target...");
        for (int i = source; i < processamentoLinkedList.size(); i++) {
            System.out.println("Proc["+processamentoLinkedList.get(source).getId()+"] enviou mensagem para o Proc["+processamentoLinkedList.get(i).getId()+"]");
            System.out.println("Proc["+processamentoLinkedList.get(i).getId()+"] recebeu a mensagem de Proc["+processamentoLinkedList.get(source).getId()+"]");
            if (processamentoLinkedList.get(i).isTarget()){
                System.out.println("Proc["+processamentoLinkedList.get(i).getId()+"] é o destino");
                return true;
            } else {
                System.out.println("Proc["+ processamentoLinkedList.get(i).getId() +"] NÃO é o destino");
            }
        }
        for (int i = 0; i < processamentoLinkedList.size(); i++) {
            System.out.println("Proc["+processamentoLinkedList.get(source).getId()+"] enviou mensagem para o Proc["+processamentoLinkedList.get(i).getId()+"]");
            System.out.println("Proc["+processamentoLinkedList.get(i).getId()+"] recebeu a mensagem de Proc["+processamentoLinkedList.get(source).getId()+"]");
            if (processamentoLinkedList.get(i).isTarget()){
                System.out.println("Proc["+processamentoLinkedList.get(i).getId()+"] é o destino");
                return true;
            } else {
                System.out.println("Proc["+ processamentoLinkedList.get(i).getId() +"] NÃO é o destino");
            }
        }
        return false;
    }

    public void consumeMessage(int sourceId){
        System.out.println("Proc["+this.id+"] recebeu a mensagem de Proc["+sourceId+"]");
        System.out.println("Proc["+this.id+"] consumiu a mensagem");
    }


}
