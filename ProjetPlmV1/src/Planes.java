import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Planes {

	public static void displayPlanes(ArrayList<String[]> tab) {
		for(int i =0; i<tab.size(); i++) {
			System.out.println("---------");
			System.out.println(Arrays.toString(tab.get(i)));
		}
	}
	
	public static ArrayList<String[]> displayPlaneByKey(ArrayList<String[]> tab, String value, int key) {
		ArrayList<String[]> res = new ArrayList<>();
		for(int i = 0; i < tab.size(); i++) {
			String a = tab.get(i)[key-1].toUpperCase();
			if(a.contains(value.toUpperCase())) {
				res.add(tab.get(i));
			}
		}
		return res;	
	}
	public static HashMap<String, HashMap<Integer, String[]>> addPieceToPlane(int indexPlane, int indexPiece, HashMap<String, HashMap<Integer, String[]>> x){
		ArrayList<String[]> plane = Data.dataPlane();
		HashMap<Integer, String[]> piece = Data.dataPieces();
		HashMap<Integer, String[]> value = new HashMap<>();
		HashMap<String , HashMap<Integer, String[]>> planeWithePiece = new HashMap<>();
		for(Map.Entry<String	, HashMap<Integer, String[]>> entry : x.entrySet()) {
			 value = entry.getValue();
			
		}


		HashMap<Integer, String[]> listPiece = new HashMap<>(value);
		String[] a = piece.get(indexPiece);
		listPiece.put(indexPiece, a);
		planeWithePiece.put(Arrays.toString(plane.get(indexPlane - 1)), listPiece);
		
		
		return planeWithePiece ;
		
		
	}
	public static void displayPLaneByPiece(HashMap<String, HashMap<Integer, String[]>> tab) {
		String piecesValue = null;
		 for (Map.Entry<String	, HashMap<Integer, String[]>> entry : tab.entrySet()) {
	            String key = entry.getKey();
	            
	            HashMap<Integer, String[]> value = entry.getValue();
	            System.out.println("Plane " + key);
	            for(Map.Entry<Integer, String[]> pieces : value.entrySet()) {
	            	int key1 = pieces.getKey();
	            	 piecesValue = Arrays.toString(pieces.getValue());
	            	 System.out.println("      Pieces :  ");
	            	
	            	System.out.println("		ID " + key1 +" : "    +piecesValue);
	            }
	        }		
	}
	public static HashMap<Integer, String[]> removePiece(HashMap<String, HashMap<Integer, String[]>> tab,int indexPlane, int indexPiece){
		ArrayList<String[]> plane = Data.dataPlane();
		 //tab.get(indexPlane)
		
		//tab.remove(index);
		HashMap<Integer, String[]> listPieces = new HashMap<>();
		return listPieces;
	}
	
	}



