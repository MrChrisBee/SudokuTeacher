package sudoku;

import java.util.BitSet;

public class MyBitSet extends BitSet implements Runnable {

	private static final long serialVersionUID = 1637341559625599819L;
	Integer isDuplicate = 0;
	 
	public MyBitSet(int nbits) {
		super(nbits);
	}

	public void checkedSet(Integer number) {
		if (get(number) && (number > 0)) {
			isDuplicate = number;
		} else
			set(number); 
	}
 
	@Override
	public String toString() {
		String result = "";
		for (int i=1;i<10; i++){
			result = result + (get(i)==false?"_":i);
		}
		if(isDuplicate > 0) {
			result += isDuplicate;
		}else {
			result += " ";
		}
		
		return result;
	}

	@Override
	public void run() {
		
		/*
		 * nur eine Idee, wie kann ich Threads in Sudoku effektiv nutzen
		 * baue myBitSet oder eine passendere Klasse soweit aus das es Sinnvoll als Thread seine Arbeit 
		 * machen kann. Eine Idee währe das checkRow() checkCol() und checkBox() 
		 * parallel erzeugt werden könnten. Derzeit nur seriell möglich.
		 * Ich lerne stetig neue Aspekte von Java hinzu, derzeit bin ich noch nicht sicher alle 
		 * relevanten Techniken zu kennen. Die letzte hier zum Zuge kommende Technologie habe ich 
		 * erst gestern gelernt: Mit den Concurrent Locks ist es möglich einen
		 * Lock auf eine Instanz auf das Lesen zu begrenzen, genauer: Ich kann mehreren Threads erlauben gleichzeitig 
		 * Lesend auf einen Instanz zu zugreifen und gleichzeitig verhindern das schreibend 
		 * auf dieses Objekt zugegriffen wird. Eigentlich Ideal für den Zugriff von 
		 * checkRow() checkCol() und checkBox() auf die zugrunde liegenden Daten.    
		 */
 
	}
	
	

}
