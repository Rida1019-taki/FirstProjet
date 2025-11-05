import java.util.*;


void main() {
    //q1
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter un nom: ");
//    String name = input.next();
//    System.out.println("Bonjour " + name);
    //q2
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter un nombre : ");
//    int nombre = input.nextInt();
//    for(int i = 0 ; i <= nombre ; i++){
//    System.out.println(i);
//        }

    //q3

//        Scanner input = new Scanner(System.in);
//        Random random = new Random();
//        int numr = random.nextInt(0, 10);
//        int number;
//        do {
//            System.out.print("Entrez un nombre : ");
//            number = input.nextInt();
//            if (number != numr) {
//                System.out.println("Essaye ");
//            }
//        } while (number != numr);
//        System.out.println("Félicitations ");


    //q4
//    Scanner input = new Scanner(System.in);
//    double solde = 1000.00;
//    String chooce ;
//    while (true) {
//        System.out.println("Entrer votre choix : ");
//        chooce = input.next();
//        switch (chooce) {
//            case "1":
//                System.out.println(solde);
//                break;
//            case "2":
//                System.out.println("Entrer un montant : ");
//                double salaire = input.nextDouble();
//                double total = solde + salaire;
//                System.out.println(total);
//                break;
//            case "3":
//                System.out.println("Entrer un montant : ");
//                double salaireRetrait = input.nextDouble();
//                double totalSalaire = solde - salaireRetrait;
//                System.out.println(totalSalaire);
//                break;
//            case "4":
//                System.exit(0);
//                break;
//            default:
//                System.out.println("Le choix n'est pa exists.");
//        }
//    }


    //q5
//    int[] numbers = {1,3,5,10,9,0,4};
//    int max = 0;
//    int secondMax = 0;
//    for(int i = 0 ; i < numbers.length ; i++) {
//        if (numbers[i] > max) {
//            secondMax = max;
//            max = numbers[i];
//        }
//        else if (numbers[i] > secondMax && secondMax != max ) {
//            secondMax = numbers[i];
//        }
//    }
//    System.out.println(max);
//    System.out.println(secondMax);



    //q7
//    int[] nombre = {2, 3, 2, 5, 3};
//    HashMap<Integer, Integer> map = new HashMap<>();
//    for (int i : nombre){
//        map.put(i , map.getOrDefault(i , 0) + 1);
//    }
//    System.out.println(map);
    //q8
//    int[] nombre = {2, 6, 1, 4, 5};
//    int[] nombre1 = {3, 7, 0, 4, 5};
//    for (int i = 0 ; i < nombre.length ; i++){
//        for (int j = 0 ; j < nombre.length ; j++){
//            if (nombre[i] == nombre1[j]){
//                System.out.println(nombre[i] + " ");
//            }
//        }
//    }


}


