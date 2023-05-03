/**
* File : Manajer.java 03/05/2023
* Penulis : Zenit Laena Fathonah
* Deskripsi : Kelas Manajer adalah subclass dari superclass Pegawai
*             Contoh program Polimorfisme Inclusion
*/

public class Manajer extends Pegawai{
	private int tunjangan = 700000;
	
	public Manajer(String nama){
		setNama(nama);
	}

	public void tampilData(){
		super.tampilData();
		System.out.printf("Tunjangan : %d\n", this.tunjangan);
	}
}