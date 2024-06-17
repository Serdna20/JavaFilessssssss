package com.mycompany.angrybirds;

import com.mycompany.angrybirds.bird.Bird;
import com.mycompany.angrybirds.bird.Size;
import com.mycompany.angrybirds.block.Block;
import com.mycompany.angrybirds.block.Material;
import com.mycompany.angrybirds.level.Level;
import com.mycompany.angrybirds.levelGoal.Pig;
import java.io.File;
import java.io.IOException;

public class AngryBirds {

    public static void main(String[] args) {
        
        Bird redBird = new Bird("Red", Size.MEDIUM, "Squawk", "Auch", "Puff", "Battle cry activated!");
        Bird blueBird = new Bird("Blues", Size.SMALL, "Squawk", "Auch", "Puff", "Splitting into three!");
        Block woodSquare = new Block("Wood Square", Material.WOOD, 500, 120, 10, 5, 6);
        Pig foremanPig = new Pig("Foreman Pig", Material.MEAT, 5000, 100, 20, 6, 2);
        
        Level level1 = new Level();
        level1.addBird(3, redBird);
        level1.addBlock(10, woodSquare);
        level1.addPig(5, foremanPig);
        
        level1.saveLevelFile();
    }
}
