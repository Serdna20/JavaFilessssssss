package com.mycompany.angrybirds.block;

import com.mycompany.angrybirds.levelObject.LevelObject;
import com.mycompany.angrybirds.objectBehavior.AudioBehavior;

public class Block extends LevelObject {
    private String blockName;
    private Material material;
    private int points;

    public Block(String blockName, Material material, int points, int strength, int defense, int density, int restitution) {
        super(strength, defense, density, restitution);
        this.blockName = blockName;
        this.material = material;
        this.points = points;
    }

    public String getBlockName() {
        return blockName;
    }
    
    
}
