
public class Oseba {
	
	private int starost;
	private int visina;
	private int teza;
	private String ime;
	
	public Oseba(int starost, int visina, int teza, String ime) {
		this.starost = starost;
		this.visina = visina;
		this.teza = teza;
		this.ime = ime;
	}
	
	public boolean meLahkoPeljeZAvtom(boolean imaAvto) throws Exception {
		if(imaAvto) {
			if(starost < 18) throw new Exception("Oseba ni dovolj stara.");
			return true;
		}else {
			throw new Exception("Nima avta");
		}		
	}

	public boolean jePolnoleten() {
		if(starost >= 18) return true;
		else return false;
	}
	public boolean jeVisok() {
		if(visina > 180) return true;
		else return false;
	}
	public boolean jeTezek() {
		if(teza > 90) return true;
		else return false;
	}
	
	public void setStarost(int starost) {
		this.starost = starost;
	}	
	public void setVisina(int visina) {
		this.visina = visina;
	}	
	public void setTeza(int teza) {
		this.teza = teza;
	}	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public int getStarost() {
		return this.starost;
	}
	public int getVisina() {
		return this.visina;
	}
	public int getTeza() {
		return this.teza;
	}
	public String getIme() {
		return this.ime;
	}		
	
}