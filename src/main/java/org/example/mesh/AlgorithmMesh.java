package org.example.mesh;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class AlgorithmMesh {
    public void makePath(int x, int y, int originX, int originY, int targetX, int targetY) {
        System.out.println("***Executando***\n");
        System.out.println("Saindo de Proc[" +originX +"]["+originY+"]");
/*
Proc[0] enviou a mensagem para o Proc[1]
Proc[1] recebeu a mensagem de Proc[0]
Proc[1] NÃO é o destino
Proc[1] enviou a mensagem para o Proc[2]
Proc[2] recebeu a mensagem de Proc[1]
Proc[2] é o destino
Proc[2] consumiu a mensagem
*/
        int currentX = originX;
        int currentY = originY;
        while (currentX != targetX || currentY != targetY) {
            if (currentX < targetX) {
                System.out.println("Proc[" +originX +"]["+originY+"]"+" enviou a mensagem para o Proc["+currentX +"]["+currentY+"]");
                System.out.println("Proc["+currentX +"]["+currentY+"] recebeu a mensagem de Proc[" +originX +"]["+originY+"]");
                currentX++;
            } else if (currentX > targetX) {
                currentX--;
            }
            if (currentY < targetY) {
                currentY++;
            } else if (currentY > targetY) {
                currentY--;
            }
        }
    }
}
