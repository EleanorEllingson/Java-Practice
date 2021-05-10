package academy.SwitchStatements;

import java.util.Locale;

public class Main {
    public static void main(String[] args){
//        int value = 3;
//        if(value == 1){
//            System.out.println("Value was 1");
//        }else if(value == 2){
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 3;
//        switch(switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("Was not 1 or 2");
//                break;

               char switchLetter = 'X';
               switch (switchLetter){
                   case 'A':
                       System.out.println("This is letter A");
                       break;
                   case 'B':
                       System.out.println("This is letter B");
                       break;
                   case 'C':
                       System.out.println("This is letter C");
                       break;
                   case 'D':
                       System.out.println("This is letter D");
                       break;
                   case 'E':
                       System.out.println("This is letter E");
                       break;
                   default:
                       System.out.println("Was not letter A, B, C, D, or E");


        }
        String month = "JUNE";
               switch (month.toLowerCase()){
                   case "january":
                       System.out.println("Jan");
                       break;
                   case "february":
                       System.out.println("Feb");
                       break;
                   case "march":
                       System.out.println("Mar");
                       break;
                   case "april":
                       System.out.println("Apr");
                       break;
                   case "may":
                       System.out.println("May");
                       break;
                   case "june":
                       System.out.println("Jun");
                       break;
                   default:
                       System.out.println("Not sure");
               }
    }
}
