/**
* File : Programmer.java 03/05/2023
* Penulis : Zenit Laena Fathonah
* Deskripsi : Kelas Programmer adalah subclass dari superclass Pegawai
*             Contoh program Polimorfisme Inclusion
*/

public class Programmer extends Pegawai{
	private int bonus = 450000;
	
	public Programmer(String nama){
		setNama(nama);
	}

	public void tampilData(){
		super.tampilData();
		System.out.printf("Bonus : %d\n", this.bonus);
	}
}