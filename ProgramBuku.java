public class ProgramBuku
{
	public static void main(String[]x)
	{
		Buku bk = new Buku(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9]);
		
		
		
		
	String Isbn = bk.getIsbn();
	String Judul = bk.getJudul();
	String NamaPengarang = bk.getNamaPengarang();
	String Penerbit = bk.getPenerbit();
	String TahunTerbit = bk.getTahunTerbit();
	String Edisi = bk.getEdisi();
	String WarnaSampul = bk.getWarnaSampul();
	String Editor = bk.getEditor();
	String Halaman = bk.getHalaman();
	String TempatTerbit = bk.getTempatTerbit();
	
	System.out.println(Isbn);
	System.out.println(Judul);
	System.out.println(NamaPengarang);
	System.out.println(Penerbit);
	System.out.println(TahunTerbit);
	System.out.println(Edisi);
	System.out.println(WarnaSampul);
	System.out.println(Editor);
	System.out.println(Halaman);
	System.out.println(TempatTerbit);
	}
}
	
	
	
	
	 