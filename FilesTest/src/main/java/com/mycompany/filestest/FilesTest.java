package com.mycompany.filestest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilesTest {

    public static void main(String[] args) {
        
        String line = "3";
        ArrayList<String> lines = new ArrayList<>();
        File newFile = new File("./hola.txt");
        try {
            newFile.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(FilesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (!line.equals("0")) {
            Scanner sc = new Scanner(System.in);
            line = sc.nextLine();
            if (!line.equals("0")) {
                lines.add(line);
            }
            else {
                break;
            }
        }
        try {
            FileWriter writer = new FileWriter(newFile, true);
            PrintWriter pw = new PrintWriter(writer);
            for (String line1 : lines) {
                pw.println(line1);
            }
            pw.close();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(FilesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        FileReader reader;
        try {
            reader = new FileReader(newFile);
            BufferedReader buffer = new BufferedReader(reader);
            String linessss;
            while ((linessss = buffer.readLine()) != null) {
                System.out.println(linessss);
            } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilesTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FilesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
}
