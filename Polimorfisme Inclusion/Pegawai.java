/**
* File : Pegawai.java 03/05/2023
* Penulis : Zenit Laena Fathonah
* Deskripsi : Kelas Pegawai merupakan superclass
*             Contoh program Polimorfisme Inculsion
*/

public class Pegawai{
	private String nama;
	private int gajiPokok = 5000000;
	
	public void setNama(String nama){
		this.nama = nama;
	}

	public void tampilData(){
		System.out.printf("Nama : %s, Gaji pokok : %d\n", this.nama, this.gajiPokok);
	}
}