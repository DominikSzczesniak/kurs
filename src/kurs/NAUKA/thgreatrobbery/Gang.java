package kurs.NAUKA.thgreatrobbery;//package thgreatrobbery;
//
//import java.util.Random;
//
//public class Gang {
//    Gang(){
//        Item[] robItems = new Item[2];
//        robItems[0] = new Item("Blunt Swiss knife", 10.5);
//        robItems[1] = new Item("Half rotten apple", 0.0);
//        Criminal rob = new Criminal("Rob", "The head", 1976, "breaking in", robItems);
//        criminals[0] = rob;
//
//        Item[] bobbyItems = new Item[2];
//        bobbyItems[0] = new Item("Baseball bat", 20);
//        bobbyItems[1] = new Item("Toothpick", 0.5);
//        Criminal bobby = new Criminal("Bobby", "The mountain", 1978, "knocking out", bobbyItems);
//        criminals[1] = bobby;
//    }
//
//    Criminal[] criminals = new Criminal[2];
//    Random rnd = new Random();
//    private double sumRobbedValue;
//
//    public double getSumRobbedValue() {
//        return sumRobbedValue;
//    }
//
//    public void getGangInfo(){
//        for (Criminal criminal : criminals){
//            System.out.println("-------------------------------------");
//            criminal.printBioData();
//        }
//    }
//
//    boolean isSuccessfulRobbery(){
//       int randomNumber = rnd.nextInt(101);
//       int summarizedSuccessChange = criminals.length * Criminal.SUCCESS_PERCENTAGE;
//       if (randomNumber >= summarizedSuccessChange) {
//           return false;
//       }
//       return true;
//    }
//
//    public void letsRob(Building[] buildings){
//        int randomRobNumber = rnd.nextInt(buildings.length);
//        System.out.println("-------------------------");
//        if (isSuccessfulRobbery()){
//            System.out.println("The gang managed to rob the following items from the " + buildings[randomRobNumber].getName() + ":");
//            for (Item item : buildings[randomRobNumber].getItems()){
//                sumRobbedValue += item.getValue();
//                System.out.println("-" + item.getName());
//            }
//        } else{
//            System.out.println("The gang tried to rob the " + buildings[randomRobNumber].getName() + " but they failed");
//        }
//    }
//}
