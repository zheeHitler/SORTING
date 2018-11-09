import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// PREPARING data
		ArrayList<Double> data = new ArrayList<Double>();
		// data input: [16.17, 10.11, 18.19, 3.4, 12.13, 20.0, 9.9, 14.15, 7.8,
		// 5.6, 1.2]
		data.add(16.17);
		data.add(10.11);
		data.add(18.19);
		data.add(3.4);
		data.add(12.13);
		data.add(20.0);
		data.add(9.9);
		data.add(14.15);
		data.add(7.8);
		data.add(5.6);
		data.add(1.2);

		// CETAK DATA INPUT
		System.out.println("Data : " + data.toString());		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan kunci pencarian: ");
		double key	= s.nextDouble();
		
		int posisi = -1;//jika setelah proses pencarian posisi tetap = -1 berarti key tidak ditemukan pada data
		
		//BEGIN PENCARIAN LINEAR
		for(int i=0;i<data.size();i++){
			if(key==data.get(i)){
				posisi = i;
				break;
			}
		}
		//END OF PENCARIAN LINEAR
		
		//TAMPILKAN HASIL PENCARIAN
		if(posisi!=-1){//Jika nilai posisi tidak sama dengan -1 berarti data ditemukan
			System.out.println("KEY: "+key+" Berada di index array list: "+posisi);
		}else{
			System.out.println("KEY TIDAK DITEMUKAN");
		}
		
		

	}

}