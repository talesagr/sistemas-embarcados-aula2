package org.example.ring;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Chaveamento {
    private int id;

    public Processamento findTarget(List<Processamento> processList, int target){
        return processList.get(target);
    }
}
