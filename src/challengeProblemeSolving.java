import java.util.Scanner;

void main(){
    //q1
//    Scanner input = new Scanner(System.in);
//    System.out.print("Entrer un nombre de unite : ");
//    int unite = input.nextInt();
//    double consomation = 0;
//    if (unite <= 100) {
//        consomation = unite * 0.8;
//    }else if (unite <= 300) {
//        consomation = 100 * 0.8 + (unite - 100) * 1.2;
//    }else {
//        consomation = 100 * 0.8 + 200 * 1.2 + (unite - 300) * 1.5;
//    }
//    double taxe = consomation * 0.10;
//    double totalConsomation = consomation + taxe;
//    System.out.println("Consommation : " + consomation);
//    System.out.println("Taxe (10%) : " + taxe);
//    System.out.println("Facture totale : " + totalConsomation);

    //q2
    Scanner input = new Scanner(System.in);
    System.out.println("Entrer un commande (UP , DOWN , LEFT , RIGHT) : ");
    String commande = input.next();
    String[] position = commande.split(" , ");
    int x = 0;
    int y = 0;

        for (String i : position) {
            switch (i) {
                case "up":
                    y = y + 1;
                    break;
                case "down":
                    y -= 1;
                    break;
                case "right":
                    x += 1;
                    break;
                case "left":
                    x -= 1;
                    break;
                default:
                    System.out.println("Cette commande n'est pas exists.");

            }
        }
        System.out.println("Position finale : (" + x + ", " + y + ")");
        if (x == 0 && y == 0) {
            System.out.println("Le robot est revenu au point de départ.");
        }
    input.close();

}
