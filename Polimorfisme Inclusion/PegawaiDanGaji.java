/**
* File : PegawaiDanGaji.java 03/05/2023
* Penulis : Zenit Laena Fathonah
* Deskripsi : Kelas Main PegawaiDanGaji
*             Contoh program Polimorfisme Inclusion
*/

public class PegawaiDanGaji{
	public static void main(String args[]){
		Pegawai pegawai = new Programmer("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai pegawai3 = new Manajer("Argo");

		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}