package org.example.ring;

import java.util.LinkedList;
import java.util.Scanner;

public class Anel {
    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de nodos, com limite de 10 unidades!");

        LinkedList<Processamento> procList = new LinkedList<>();
        LinkedList<Chaveamento> rotList = new LinkedList<>();
        int numeroNodos = sc.nextInt();

        if (numeroNodos > 10) {
            System.out.println("nodos maximo = 10");
        } else if (numeroNodos < 1) {
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

        while (1 > 0) {
            System.out.println("Quem é o Source?");
            int source = sc.nextInt();
            procList.get(source).setSource(true);
            System.out.println("Quem é o Target?");
            int target = sc.nextInt();
            procList.get(target).setTarget(true);
            Processamento sender = procList.get(source);
            System.out.println("Proc[" + sender.getId() + "] criou a mensagem");
            boolean finded = procList.get(source).arbitrar(procList, source);
            if (finded) {
                Processamento nodoTarget = rotList.get(target).findTarget(procList, target);
                nodoTarget.consumeMessage(sender.getId());
                cleanvariables(procList);
            }

        }
    }
    private static void cleanvariables(LinkedList < Processamento > procList) {
        for (int i = 0; i < procList.size(); i++) {
            procList.get(i).setTarget(false);
            procList.get(i).setSource(false);
        }
    }
}
