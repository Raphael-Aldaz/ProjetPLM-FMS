import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pieces {

	public static void displayPieces(HashMap<Integer, String[]> tab) {

		 for (Map.Entry<Integer	, String[]> entry : tab.entrySet()) {
	            int key = entry.getKey();
	            
	            String value = Arrays.toString(entry.getValue());
	            System.out.println("ID: " + key + " : " + value);
	        }		
	}
	
	public static HashMap<Integer, String[]> removePiece(HashMap<Integer, String[]> tab, int index){
		
		tab.remove(index);
		HashMap<Integer, String[]> listPieces = new HashMap<>(tab);
		return listPieces;
	}
	
	public static HashMap<Integer ,String[]> addPiece(HashMap<Integer ,String[]> tab, String name, int category, int price ){
		HashMap<Integer, String[]> listPieces = new HashMap<>(tab);
		String priceToString = Integer.toString(price);	
		String[] newPiece = {name,Data.getDataPieces()[1][category -1], priceToString };
			if(listPieces.containsKey(listPieces.size())) {
				listPieces.put(listPieces.size()+1, newPiece);
			}else {
				listPieces.put(listPieces.size(), newPiece);
			}
			return listPieces;
			
		}
	
	
	

}
