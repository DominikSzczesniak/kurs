package kurs.udemyjava.thgreatrobbery;//package thgreatrobbery;
//
//import java.util.Random;
//
//public class Police {
//    private Detective adamPalmer;
//
//    Police(){
//        Item[] adamItems = new Item[2];
//        adamItems[0] = new Item("Revolver", 500);
//        adamItems[1] = new Item("Magnifying glass", 10);
//        adamPalmer = new Detective("Adam Palmer", "Palm", 1964, "Robberies", adamItems);
//    }
//
//    private boolean areCriminalsCaught(){
//        Random rnd = new Random();
//        if (rnd.nextInt(101) >= Detective.SUCCESS_PERCENTAGE) {
//            return false;
//        }
//        return true;
//    }
//
//    public boolean catchCriminals(Gang gang){
//        if (areCriminalsCaught()){
//            System.out.println(adamPalmer.getName() + " managed to catch the gang");
//            if (gang.getSumRobbedValue() > 0) {
//                System.out.println("The stolen items are recovered. Their overall value is estimated to $" + gang.getSumRobbedValue());
//            } else System.out.println("The gang couldn't steal anything");
//            return true;
//        } else {
//            System.out.println(adamPalmer.getName() + " couldn't catch the criminals.");
//            System.out.println("They managed to steal items valued $" + gang.getSumRobbedValue());
//            return false;
//        }
//    }
//}
