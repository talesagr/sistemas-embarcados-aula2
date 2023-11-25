package org.example;

import org.example.mesh.Mesh2D;
import org.example.ring.Anel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Anel anel = new Anel();
        Mesh2D mesh2D = new Mesh2D();
        System.out.println("Informe a topologia de rede:");
        System.out.println("(1) RING");
        System.out.println("(2) MESH-2D");
        int input = sc.nextInt();
        if(input == 1){
            anel.execute();
        } else if (input == 2) {
            mesh2D.execute();
        } else {
            System.out.println("Insira uma opcao valida");
        }
    }
}
