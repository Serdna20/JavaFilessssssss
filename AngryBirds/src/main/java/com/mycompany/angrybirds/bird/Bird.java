package com.mycompany.angrybirds.bird;

import com.mycompany.angrybirds.objectBehavior.AudioBehavior;

public class Bird implements AudioBehavior, BirdSkill {
    private String name;
    private Size size;
    private String idleAudio;
    private String collisionAudio;
    private String destroyAudio;
    private String skillDescription;

    public Bird(String name, Size size, String idleAudio, String collisionAudio, String destroyAudio, String skillDescription) {
        this.name = name;
        this.size = size;
        this.idleAudio = idleAudio;
        this.collisionAudio = collisionAudio;
        this.destroyAudio = destroyAudio;
        this.skillDescription = skillDescription;
    }

    public String getName() {
        return name;
    }

    @Override
    public void playIdleAudio() {
        System.out.println(idleAudio);
    }

    @Override
    public void playCollisionAudio() {
        System.out.println(collisionAudio);
    }

    @Override
    public void playDestroyAudio() {
        System.out.println(destroyAudio);
    }

    @Override
    public void activateSkill() {
        System.out.println(skillDescription);
    }

    
    
}
