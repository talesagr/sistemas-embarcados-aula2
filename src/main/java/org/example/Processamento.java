package org.example;

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
        System.out.println("Saindo de Proc["+processamentoLinkedList.get(source).getId()+"]");
        for (int i = source; i < processamentoLinkedList.size(); i++) {
            System.out.println("Proc["+ processamentoLinkedList.get(i).getId() +"] eh o target? == " + (processamentoLinkedList.get(i).isTarget()));
            if (processamentoLinkedList.get(i).isTarget()){
                System.out.println("target encontrado!");
                return true;
            }
        }
        for (int i = 0; i < processamentoLinkedList.size(); i++) {
            System.out.println("Proc["+ processamentoLinkedList.get(i).getId() +"] eh o target? == " + (processamentoLinkedList.get(i).isTarget()));
            if (processamentoLinkedList.get(i).isTarget()){
                System.out.println("target encontrado!");
                return true;
            }
        }
        return false;
    }

    public void consumeMessage(int sourceId){
        System.out.println("Proc["+this.id+"] recebeu a mensagem de Proc["+sourceId+"]");
        System.out.println("Proc["+this.id+"] consumiu a mensagem");
    }


}
