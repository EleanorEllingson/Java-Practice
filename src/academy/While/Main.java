package academy.While;

public class Main {

//    public static void main(String[] args){
//        int count = 0;
////        while(count != 5){
////            System.out.println("Cout value is " + count);
////            count++;
////        }
//
////        count = 6;
////        do {
////            System.out.println("Count value was " + count);
////            if(count > 100){
////                break;
////            }
////        }while(count != 6);
//        count = 0;
//        int num = 4;
//        int finishNumber = 20;
//
//        while (num <= finishNumber){
//            num++;
//
//            if(!isEvenNumber(num)) {
//                count++;
//                System.out.println(num + " is an even number");
//                if(count == 5){
//                    break;
//                }else {
//                    continue;
//                }
//            }
//
//
//        }
//        System.out.println("Total even numbers found = " + count);
//
//    }
    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){

            return true;
        }else {
            return false;
        }

    }
}
