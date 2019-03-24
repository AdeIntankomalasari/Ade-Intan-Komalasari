public class Buku 
{
	private String Isbn;
	private String Judul;
	private String NamaPengarang;
	private String Penerbit;
	private String TahunTerbit;
	private String Edisi;
	private String WarnaSampul;
	private String Editor;
	private String Halaman;
	private String TempatTerbit;
	
	public Buku(String Isbn, String Judul, String NamaPengarang, String Penerbit, String TahunTerbit, String Edisi, String WarnaSampul, String Editor,String Halaman, String TempatTerbit) {
		
	
	this.Isbn = Isbn;
	this.Judul = Judul;
	this.NamaPengarang = NamaPengarang;
	this.Penerbit = Penerbit;
	this.TahunTerbit = TahunTerbit;
	this.Edisi = Edisi;
	this.WarnaSampul = WarnaSampul;
	this.Editor = Editor;
	this.Halaman = Halaman;
	this.TempatTerbit = TempatTerbit;
	
	}
	public void setIsbn(String NoIsbn){
		Isbn = NoIsbn;
	}
	public String getIsbn(){
		return Isbn;}
	
	public void setJudul(String Judulbuku){
		Judul = Judulbuku;
	}
	public String getJudul(){
	return Judul;
	}
	public void setNamaPengarang(String NamaPengarangbuku){
		NamaPengarang = NamaPengarangbuku;
	}
	public String getNamaPengarang(){
	return NamaPengarang;}
	
	public void setPenerbit(String Penerbitbuku){
		Penerbit = Penerbitbuku;
	}
	public String getPenerbit(){
	return Penerbit;
	}
	
	public void setTahunTerbit(String TahunTerbitbuku){
		TahunTerbit = TahunTerbitbuku;
	}
	public String getTahunTerbit(){
	return TahunTerbit;
	}
	public void setEdisi(String Edisibuku){
		Edisi = Edisibuku;
	}
	public String getEdisi(){
	return Edisi;
	}
	public void setWarnaSampul(String WarnaSampulbuku){
		WarnaSampul = WarnaSampulbuku;
	}
	public String getWarnaSampul(){
	return WarnaSampul;
	}
	
	public void setEditor(String Editorbuku){
		Editor = Editorbuku;
	}
	public String getEditor(){
	return Editor;
	}
	public void setHalaman(String Halamanbuku){
		Halaman = Halamanbuku;
	}
	public String getHalaman(){
	return Halaman; 
	}
	
	public void setTempatTerbit(String TempatTerbitbuku){
		TempatTerbit = TempatTerbitbuku;
	}
	public String getTempatTerbit(){
	return TempatTerbit;}
	
	
	
}
	
	