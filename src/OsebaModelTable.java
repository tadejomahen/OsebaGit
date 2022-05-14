// vključimo paket za delo s tabelami
import javax.swing.table.*;
import java.util.*;

// razred ki razširja TableModel
public class OsebaModelTable extends DefaultTableModel {
	
	// Seznam kozarcev
	private ArrayList<Oseba> osebe;
	
	// Konstruktor
	public OsebaModelTable() {
		super();		
		// inicializiramo seznam kozarcev
		osebe = new ArrayList<Oseba>();
		
		// dodamo stolpce v tabelo
		addColumn("Starost");
		addColumn("Visina");
		addColumn("Teza");
		addColumn("Ime");
	}
	
	// metoda za dodajanje vrstic
	public void dodajOsebo(Oseba o) {
		
		// doda kozarec na seznam
		osebe.add(o);	
		
		// pripravi vrstico za vnos v tabelo
		Object[] vrstica = new Object[] {o.getStarost(), o.getVisina(), o.getTeza(), o.getIme()};
		
		// doda vrednosti v tabelo
		addRow(vrstica);
	}
	
	
}