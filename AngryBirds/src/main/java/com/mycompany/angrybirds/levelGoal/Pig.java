package com.mycompany.angrybirds.levelGoal;

import com.mycompany.angrybirds.block.Block;
import com.mycompany.angrybirds.block.Material;
import com.mycompany.angrybirds.objectBehavior.AudioBehavior;

public class Pig extends Block implements AudioBehavior {

    public Pig(String blockName, Material material, int points, int strength, int defense, int density, int restitution) {
        super(blockName, material, points, strength, defense, density, restitution);
    }

    public String getName() {
        return super.getBlockName();
    }
    
    @Override
    public void playIdleAudio() {
        System.out.println("Oink");
    }

    @Override
    public void playCollisionAudio() {
        System.out.println("Ouch");
    }

    @Override
    public void playDestroyAudio() {
        System.out.println("POP");
    }
    
}
