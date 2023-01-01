package kurs.NAUKA.dziedziczenie.Wow;

public abstract class ClassInWow {
    public ClassInWow(String className, String color, int numberOfSpecializations){
        this.className = className;
        this.color = color;
        this.numberOfSpecializations = numberOfSpecializations;
        liczebnosc++;
    }
    private String className;
    String color;
    int numberOfSpecializations;
    static int liczebnosc;

    public void classInfo(){
        System.out.println("Class: " + className);
        System.out.println("Color: " + color);
        System.out.println("Number of specializations: " + numberOfSpecializations);
    }

    public String getClassName(){
        return className;
    }

    abstract void mountUp();
}
