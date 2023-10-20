package org.example;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de nodos, com limite de 10 unidades!");

        LinkedList<Processamento> procList = new LinkedList<>();
        LinkedList<Chaveamento> rotList = new LinkedList<>();
        int numeroNodos = sc.nextInt();

        if(numeroNodos > 10){
            System.out.println("nodos maximo = 10");
        } else if(numeroNodos < 1){
            System.out.println("nodos minimo = 2");
        }

        for (int i = 0; i < numeroNodos; i++) {
            Processamento proc = new Processamento();
            proc.setId(i);
            Chaveamento rot = new Chaveamento();
            rot.setId(i);
            procList.add(proc);
            rotList.add(rot);
        }

        while(1>0){
            System.out.println("digite quem eh o source?");
            int source = sc.nextInt();
            procList.get(source).setSource(true);
            System.out.println("digite quem eh o target?");
            int target = sc.nextInt();
            procList.get(target).setTarget(true);
            Processamento sender = procList.get(source);
            System.out.println("Proc["+sender.getId()+"] criou a mensagem");
            //System.out.println("Proc["+sender.getId()+"] enviou a mensagem para o Proc["+procList.get(target).getId()+"]");
            boolean finded = procList.get(source).arbitrar(procList,source);
            if(finded) {
                Processamento nodoTarget = rotList.get(target).findTarget(procList, target);
                nodoTarget.consumeMessage(sender.getId());
                cleanvariables(procList);
            }

        }

    }

    private static void cleanvariables(LinkedList<Processamento> procList) {
        for (int i = 0; i < procList.size(); i++) {
            procList.get(i).setTarget(false);
            procList.get(i).setSource(false);
        }
    }
    //todo limite de nodos, limite de 10
    /*
    num loop
    pedir quem eh o source?
    pedir quem eh o target?
    criar LOG do que aconteceu com a mensagem
    ex:
    quem eh o source? 0
    quem eh o target? 2

    Proc[0] criou a msg
    Proc[0] enviou a msg para o Proc[1]
    Proc[1] recebeu a msg de Proc[0]
    Proc[1] eh o destino
    Proc[0]

    qualquer algoritmo de roteamento

    ter funcao/metodo arbitragem
     ter funcao/metodo roteamento


    */
}