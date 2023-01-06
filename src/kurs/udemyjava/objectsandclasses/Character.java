package kurs.udemyjava.objectsandclasses;

public abstract class Character {
    public Character( String nickname, String className, String color) {
        this.className = className;
        this.color = color;
        this.nickname = nickname;
    }

    String nickname;
    private String className;
    String color;

    public void characterMade(){
        System.out.println("Character has been made");
    }
    public void characterInfo(){
        System.out.println("Nickname: " + nickname);
        System.out.println("Class: " + className);
        System.out.println("Color: " + color);
    }

    public String getClassName() {
        return className;
    }
    public abstract void useAnAbility();
}
