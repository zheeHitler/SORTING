import java.util.ArrayList;

public class SelectionSort {

	public static void main(String[] args) {		
		//PREPARING data input
		ArrayList<Double> input 	= new ArrayList<Double>();
		//data input: [16.17, 10.11, 18.19, 3.4, 12.13, 20.0, 9.9, 14.15, 7.8, 5.6, 1.2]
		input.add(16.17);
		input.add(10.11);
		input.add(18.19);
		input.add(3.4);
		input.add(12.13);
		input.add(20.0);
		input.add(9.9);
		input.add(14.15);
		input.add(7.8);
		input.add(5.6);
		input.add(1.2);
		//CETAK DATA INPUT
		System.out.println("Data Input   : "+input.toString());
		
		//PANGGIL METHOD sort( )
		ArrayList<Double> output	= sort(input);
		
		//CETAK HASIL SORTING 
		System.out.println("Hasil Sorting: "+output.toString());
		
	}
	
	public static ArrayList<Double>sort(ArrayList<Double> data){
		int n	= data.size();
		for(int i=0;i<n-1;i++){			
			int min	= i;
			for(int j=1+i;j<n;j++){
				if(data.get(j)<data.get(min)){
					min = j;
				}
			}
			if(min != i){
				Double tempData = data.get(i);
				data.set(i, data.get(min));
				data.set(min, tempData);
			}
			//CETAK HASIL TIAP LANGKAH dan OPERASI SWAPnya
			System.out.println("langkah ke-"+i+", min = "+min+" SWAP("+i+","+min+")"+" -> "+data.toString());
		}
		return data;		
	}
}
