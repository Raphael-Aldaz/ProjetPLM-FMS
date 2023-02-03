
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, HashMap<Integer, String[]>> listePlaneAndPieces = new HashMap<>();
		
		displayMenu();
		
		int choice;
		while(scan.hasNextInt() == false ) scan.next();
		
		choice = scan.nextInt();
		while(choice < 5 && choice >0) {
		
		switch (choice) {
		case 1: {
			Planes.displayPlanes(Data.dataPlane());
			displayMenu();
			choice = scan.nextInt();
			break;
		}
		case 2 : {
			System.out.println("Entrer la valeur correspondant a ce que vous voulez faire :");
			System.out.println("1 - Chercher par son ID :");
			System.out.println("2 - Chercher par son nom :");
			System.out.println("3 - Chercher par sa phase :");
			System.out.println("4- Chercher par son type :");
			System.out.println("5- Précedent");
			
			while(scan.hasNextInt() == false ) scan.next();
			int chooseBy = scan.nextInt();
			if(chooseBy == 5) {
				displayMenu();
				choice = scan.nextInt();
			}else {
			System.out.println("Entrer la clé de recherche :");
			
			String value = null;
			
			if(scan.hasNextInt() == true ) {
				int key = scan.nextInt();
				value = Integer.toString(key);
			} else if(scan.hasNextLine()== true) {
				scan.nextLine();
				 value = scan.nextLine();
			}
			Planes.displayPlanes(Planes.displayPlaneByKey(Data.dataPlane(), value, chooseBy));;
			}
			
			break;
		}
		case 3 : {
			System.out.println("Vouslez vous ajouter ou supprimer une piece ? ");
			System.out.println("1 - Ajouter");
			System.out.println("2 - Supprimer");
			System.out.println("3 - Précedent");
			
			
			while(scan.hasNextInt() == false ) scan.next();
			int choicePieces = scan.nextInt();
			
			while(choicePieces < 3 && choicePieces >0) {
			
			if(choicePieces == 1) {
			String addAPiece = "o";
			System.out.println("Sur quel avion voulez vous ajouter une piece ?(Choisir son ID) ");
			Planes.displayPlanes(Data.dataPlane());
			int planToAdd = scan.nextInt();
			while(addAPiece.equals("o")) {
				
			
				System.out.println("Quelle piece voulez vous ajouter ?  ?(Choisir son ID) ");
				Pieces.displayPieces(Data.dataPieces());
				int pieceToAdd = scan.nextInt();
				
				listePlaneAndPieces = Planes.addPieceToPlane(planToAdd, pieceToAdd, listePlaneAndPieces);
				Planes.displayPLaneByPiece(listePlaneAndPieces);
				System.out.println("voulez vous ajouter une autre piece ? o/n ");
				addAPiece = scan.next();
			}
				System.out.println("Vouslez vous ajouter ou supprimer une piece ? ");
				System.out.println("1 - Ajouter");
				System.out.println("2 - Supprimer");
				System.out.println("3 - Précedent");
				
				
				while(scan.hasNextInt() == false ) scan.next();
				choicePieces = scan.nextInt();
				
			}
			if(choicePieces == 2) {
				scan.nextLine();
				//Planes.removePiece(listePlaneAndPieces, 1, 2);
				Planes.displayPLaneByPiece(listePlaneAndPieces);
				System.out.println("delete !!!!!!!!!!!!!!");
				
			} 
			if(choicePieces == 3) {
				
			}
			}
		}
	}
}
	scan.close();
	}
	
	public static void displayMenu() {
		System.out.println("Bienvenue dans l'application de gestion du cycle de vie d'avions AIRBUS.");
		System.out.println("Faites votre choix dans le menu, saisissez le chiffre correspondant :");
		System.out.println("1 : Afficher tous les avions");
		System.out.println("2 : Afficher tous les avions contenant un mot clé dans le programme");
		System.out.println("3 : Ajouter ou supprimer une pièce pour un avion donné");
		System.out.println("4: Afficher un avion avec les infos détaillées de chaque pièces");
		System.out.println("5: Quitter l'application");
	}

}
