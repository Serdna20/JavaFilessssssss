package com.mycompany.angrybirds.level;

import com.mycompany.angrybirds.bird.Bird;
import com.mycompany.angrybirds.block.Block;
import com.mycompany.angrybirds.levelGoal.Pig;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class Level {
    private ArrayList<Block> blocks = new ArrayList<>();
    private ArrayList<Bird> birds = new ArrayList<>();
    private ArrayList<Pig> pigs = new ArrayList<>();
    
    public void addBlock(int amount, Block block) {
        for (int i = 0; i < amount; i++) {
            this.blocks.add(block);
        }
    }
    public void addBird(int amount, Bird bird) {
        for (int i = 0; i < amount; i++) {
            this.birds.add(bird);
        }        
    }
    public void addPig(int amount, Pig pig) {
        for (int i = 0; i < amount; i++) {
            this.pigs.add(pig);
        }        
    }
    
    public void saveLevelFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter level name:");
        String levelName = scanner.next();
        File levelFile = new File("./"+levelName+".txt");
        
        if (levelFile.exists()) {
            System.out.println("This level already exists!");
            return;
        }
        
        try {
            System.out.println("Level file created!");
            levelFile.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        String levelBlocks = "Blocks:[";
        for (Block block : blocks) {
            levelBlocks += block.getBlockName()+",";
        }
        String levelBirds = "Birds:[";
        for (Bird bird : birds) {
            levelBirds += bird.getName()+",";
        }
        String levelPigs = "Pigs:[";
        for (Pig pig : pigs) {
            levelPigs += pig.getBlockName()+",";
        }
        levelBlocks += "]";
        levelBirds += "]";        
        levelPigs += "]";
        
        try {
            FileWriter writer = new FileWriter(levelFile,false);
            PrintWriter pw = new PrintWriter(writer);
            pw.println(levelBlocks);
            pw.println(levelBirds);
            pw.println(levelPigs);
            pw.close();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
    }
    
}
