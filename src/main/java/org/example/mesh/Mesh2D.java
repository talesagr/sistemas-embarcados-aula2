package org.example.mesh;

import org.example.mesh.AlgorithmMesh;

import java.util.Scanner;

public class Mesh2D {

    Scanner sc = new Scanner(System.in);

    public void execute(){
        System.out.println("Informe o tamanho da NoC para X:\n");
        int x = sc.nextInt();
        verifyInput(x);
        System.out.println("X = " + x);

        System.out.println("Informe o tamanho da NoC para Y:\n");
        int y = sc.nextInt();
        verifyInput(y);
        System.out.println("Y = " + y);

        System.out.println("Construcao de Pacotes:\n");

        int originX = definyOriginX(x);
        int originY = definyOriginY(y);
        int targetX = definyTargetX(x);
        int targetY = definyTargetY(y);

        AlgorithmMesh algorithmMesh = new AlgorithmMesh();

        algorithmMesh.makePath(x,y,originX,originY,targetX,targetY);

    }

    private int definyOriginX(int x) {
        System.out.println("Informe a origem X:");
        int originX = sc.nextInt();
        if (originX > x || originX < 0){
            throw new RuntimeException("Insira um valor valido!");
        }
        System.out.println(originX);
        return originX;
    }

    private int definyOriginY(int y){
        System.out.println("Informe a origem Y:");
        int originY = sc.nextInt();
        if (originY > y || originY < 0){
            throw new RuntimeException("Insira um valor valido!");
        }
        System.out.println(originY);
        return originY;
    }

    private int definyTargetX(int x) {
        System.out.println("Informe o destino X");
        int targetX = sc.nextInt();
        if (targetX > x || targetX < 0){
            throw new RuntimeException("Insira um valor valido!");
        }
        System.out.println(targetX);
        return targetX;
    }

    private int definyTargetY(int y){
        System.out.println("Informe o destino Y");
        int target = sc.nextInt();
        if (target > y || target < 0){
            throw new RuntimeException("Insira um valor valido!");
        }
        System.out.println(target);
        return target;
    }


    public void verifyInput(int value){
        if(value > 9 || value < 0){
            throw new RuntimeException("Informe um valor valido");
        }
    }
}
