package application;

public class Paziente {
	
	private String nome;
	private String cognome;
	private String patologia;
	private String prestazione;
	private String telefono;
	private String durata;
	
	public Paziente(String n,String c,String pat,String pres, String tel, String dur) {
		nome = n;
		cognome = c;
		patologia = pat;
		prestazione = pres;
		telefono = tel;
		durata = dur;
		
		
	}
	
	public Paziente(String c) { // Paziente solo con cognome
		cognome = c;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPatologia() {
		return patologia;
	}
	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getPrestazione() {
		return prestazione;
	}
	public void setPrestazione(String prestazione) {
		this.prestazione = prestazione;
	}
	public String getDurata() {
		return durata;
	}
	public void setDurata(String durata) {
		this.durata = durata;
	}
	

}
