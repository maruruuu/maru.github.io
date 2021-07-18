import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sekigae{
	static List<String>  student = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h" ,"i", "j", "k"));
	
	public static void main(String[] args){
		System.out.println("\n[[　現在の席順　]]");
		sekigaemae();//表示する
		random();//並べ替える
		
		System.out.println("\t\nこれで前の席のままの人も、前と同じペアの人も居ません。");
		System.out.println("\n[[　新しい席順　]]");
		sekigaemae();//席替え後表示する
		System.out.println("[[おわり]]");
	}
	//席を表示するだけ
	public static void sekigaemae(){
		System.out.println(" ＿＿＿＿＿＿＿＿＿＿＿");
		System.out.println(" |                    |");
		System.out.println(" | " + student.get(9) + "  " + student.get(8) + " | " + student.get(5) + "  " + student.get(4) + " | " + student.get(1) + "  " + student.get(0) + " |");
		System.out.println(" | " + student.get(10) + "   " + " | " + student.get(7) + "  " + student.get(6) + " | " + student.get(3) + "  " + student.get(2) + " |");		
		System.out.println(" |                    |");
		System.out.println(" ￣￣￣￣￣￣￣￣￣￣￣\n");
	}
	//並べ替え
	public static void random(){
		Collections.shuffle(student);
		System.out.println(" 並べ替え → " + student);
		irekae2(student);//ペアが同じだったら並べ替える
	}
	//同じ席か判定する
	public static String irekae(List<String> list){
		//System.out.println("並べ替えられた順番はこれ→" + student.get(0));
		//listはすでに入れ替わっているので元の席と同じか調べる
		while((student.get(0)).equals("a")||(student.get(1)).equals("b")||(student.get(2)).equals("c")||(student.get(3)).equals("d")||(student.get(4)).equals("e")||(student.get(5)).equals("f")||(student.get(6)).equals("g")||(student.get(7)).equals("h")||(student.get(8)).equals("i")||(student.get(9)).equals("j")||(student.get(10)).equals("k")){
			System.out.println(" ただし、元の席のままの人がいます・・・");
			jyufuku(student);//変わっていない人を特定する
			System.out.println(" 並べ替えをやり直します。");

			random();

		}
		int a =0;
		System.out.println(" 席が移動していない人も居ません！！ " + a++);
		return "";
	
	}
	//隣り合っていないか調べる
	public static String irekae2(List<String> list){
		student.indexOf("a");
		//a-b比較
		if((student.get(0)).equals("b") || (student.get(1)).equals("b")){
			if((student.get(0)).equals("a") || (student.get(1)).equals("a")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(0) + "さんと" + student.get(1) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(2)).equals("b") || (student.get(3)).equals("b")){
			if((student.get(2)).equals("a") || (student.get(3)).equals("a")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(2) + "さんと" + student.get(3) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
				if((student.get(4)).equals("b") || (student.get(5)).equals("b")){
			if((student.get(4)).equals("a") || (student.get(5)).equals("a")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(4) + "さんと" + student.get(5) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(6)).equals("b") || (student.get(7)).equals("b")){
			if((student.get(6)).equals("a") || (student.get(7)).equals("a")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");		
					System.out.println(student.get(6) + "さんと" + student.get(7) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(8)).equals("b") || (student.get(9)).equals("b")){
			if((student.get(8)).equals("a") || (student.get(9)).equals("a")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(8) + "さんと" + student.get(9) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		
		//c－d比較
		if((student.get(0)).equals("d") || (student.get(1)).equals("d")){
			if((student.get(0)).equals("c") || (student.get(1)).equals("c")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(0) + "さんと" + student.get(1) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(2)).equals("d") || (student.get(3)).equals("d")){
			if((student.get(2)).equals("c") || (student.get(3)).equals("c")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(2) + "さんと" + student.get(3) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
				if((student.get(4)).equals("d") || (student.get(5)).equals("d")){
			if((student.get(4)).equals("c") || (student.get(5)).equals("c")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(4) + "さんと" + student.get(5) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(6)).equals("d") || (student.get(7)).equals("d")){
			if((student.get(6)).equals("c") || (student.get(7)).equals("c")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(6) + "さんと" + student.get(7) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(8)).equals("d") || (student.get(9)).equals("d")){
			if((student.get(8)).equals("c") || (student.get(9)).equals("c")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(8) + "さんと" + student.get(9) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		
	//e-f比較
		if((student.get(0)).equals("f") || (student.get(1)).equals("f")){
			if((student.get(0)).equals("e") || (student.get(1)).equals("e")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(0) + "さんと" + student.get(1) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(2)).equals("f") || (student.get(3)).equals("f")){
			if((student.get(2)).equals("e") || (student.get(3)).equals("e")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(2) + "さんと" + student.get(3) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
				if((student.get(4)).equals("f") || (student.get(5)).equals("f")){
			if((student.get(4)).equals("e") || (student.get(5)).equals("e")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(4) + "さんと" + student.get(5) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(6)).equals("f") || (student.get(7)).equals("f")){
			if((student.get(6)).equals("e") || (student.get(7)).equals("e")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(6) + "さんと" + student.get(7) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(8)).equals("f") || (student.get(9)).equals("f")){
			if((student.get(8)).equals("e") || (student.get(9)).equals("e")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");		
					System.out.println(student.get(8) + "さんと" + student.get(9) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
	//g-h比較
		if((student.get(0)).equals("h") || (student.get(1)).equals("h")){
			if((student.get(0)).equals("g") || (student.get(1)).equals("g")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");		
					System.out.println(student.get(0) + "さんと" + student.get(1) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(2)).equals("h") || (student.get(3)).equals("h")){
			if((student.get(2)).equals("g") || (student.get(3)).equals("g")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(2) + "さんと" + student.get(3) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
				if((student.get(4)).equals("h") || (student.get(5)).equals("h")){
			if((student.get(4)).equals("g") || (student.get(5)).equals("g")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(4) + "さんと" + student.get(5) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(6)).equals("h") || (student.get(7)).equals("h")){
			if((student.get(6)).equals("g") || (student.get(7)).equals("g")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(6) + "さんと" + student.get(7) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(8)).equals("h") || (student.get(9)).equals("h")){
			if((student.get(8)).equals("g") || (student.get(9)).equals("g")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(8) + "さんと" + student.get(9) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
	//i-j比較
		if((student.get(0)).equals("j") || (student.get(1)).equals("j")){
			if((student.get(0)).equals("i") || (student.get(1)).equals("i")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(0) + "さんと" + student.get(1) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(2)).equals("j") || (student.get(3)).equals("j")){
			if((student.get(2)).equals("i") || (student.get(3)).equals("i")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(2) + "さんと" + student.get(3) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
				if((student.get(4)).equals("j") || (student.get(5)).equals("j")){
			if((student.get(4)).equals("i") || (student.get(5)).equals("i")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(4) + "さんと" + student.get(5) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(6)).equals("j") || (student.get(7)).equals("j")){
			if((student.get(6)).equals("i") || (student.get(7)).equals("i")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(6) + "さんと" + student.get(7) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}
		if((student.get(8)).equals("j") || (student.get(9)).equals("j")){
			if((student.get(8)).equals("i") || (student.get(9)).equals("i")){
					System.out.println(" 前に同じ机だった人とは隣り合ってはいけません。");
					System.out.println(student.get(8) + "さんと" + student.get(9) + "さんが隣り合っています。");
					System.out.println("並べ替えをやり直します。");
				random();
			}
		}

			System.out.println(" 前と同じペアか調べました。同じペアはありません！");
			irekae(student);//同じ席だったら並べ替える
		return "";
	}
	//誰が同じ席か
	public static void jyufuku(List<String> list){
		int count =0;
		
	
			count++;
			
		/*
		if(student.get(0).equals("a")){//一番目がaさんのとき
			System.out.println(" " +  student.get(0) + "さんの席が変わっていません。");
			count++;
		}else if(student.get(1).equals("b")){//２番目がbさんのとき
			System.out.println(" " +  student.get(1) + "さんの席が変わっていません。");
			count++;
		}else if(student.get(2).equals("c")){//3番目がcさんのとき
			System.out.println(" " +  student.get(2) + "さんの席が変わっていません。");
			count++;
		}else if(student.get(3).equals("d")){//4番目がdさんのとき
			System.out.println(" " +  student.get(3) + "さんの席が変わっていません。");
			count++;
		}else if(student.get(4).equals("e")){//5番目がeさんのとき
			System.out.println(" " +  student.get(4) + "さんの席が変わっていません。");
			count++;
		}else if(student.get(5).equals("f")){//6番目がfさんのとき
			System.out.println(" " +  student.get(5) + "さんの席が変わっていません。");
			count++;
		}else if(student.get(6).equals("g")){//7番目がgさんのとき
			System.out.println(" " +  student.get(6) + "さんの席が変わっていません。");
			count++;
		}else if(student.get(7).equals("h")){//8番目がhさんのとき
			System.out.println(" " +  student.get(7) + "さんの席が変わっていません。");
			count++;
		}else if(student.get(8).equals("i")){//9番目がiさんのとき
			System.out.println(" " +  student.get(8) + "さんの席が変わっていません。");
			count++;
		}else if(student.get(9).equals("j")){//10番目がjさんのとき
			System.out.println(" " +  student.get(9) + "さんの席が変わっていません。");
			count++;
		}else if(student.get(10).equals("k")){//11番目がkさんのとき
			System.out.println(" " +  student.get(10) + "さんの席が変わっていません。");
			count++;
		}*/
				
			
		
	}
		//誰が同じ席か
	/*public static void jyufuku2(List<String> list){
		String[] a = student.toArray(new String[0]);
		int[] z ={1,2,3,4,5,6,7,8,9,10,11};
		for(int i = 1; i <11; i++){
				//System.out.println(" " +  student.get(i) + "さんは");
			
			switch(z[i]){
			case 0:
				System.out.println("aさんは席が変わっていません。");
			case 1:
				System.out.println("bさんは席が変わっていません。");
			case 3:
				System.out.println("cさんは席が変わっていません。");
			case 4:
				System.out.println("dさんは席が変わっていません。");
			case 5:
				System.out.println("eさんは席が変わっていません。");
			case 6:
				System.out.println("fさんは席が変わっていません。");
			case 7:
				System.out.println("gさんは席が変わっていません。");
			case 8:
				System.out.println("hさんは席が変わっていません。");
			default:
				
			}
			
		}
		
	}*/
	/*
	public static void jyufuku(List<String> list){
			if(!(student.get(0)).equals("a")){
				if(!(student.get(1)).equals("b")){
					if(!(student.get(2)).equals("c")){
						if(!(student.get(3)).equals("d")){
							if(!(student.get(4)).equals("e")){
								if(!(student.get(5)).equals("f")){
									if(!(student.get(6)).equals("g")){
										if(!(student.get(7)).equals("h")){
											if(!(student.get(8)).equals("i")){
												if(!(student.get(9)).equals("j")){
													if(!(student.get(10)).equals("k")){
													}else if{
														System.out.println(" " + student.get(10) + "さんの席が変わっていません。");
												}else if{
														System.out.println(" " + student.get(9) + "さんの席が変わっていません。");
											}else if{
													System.out.println(" " + student.get(8) + "さんの席が変わっていません。");
										}else if{
												System.out.println(" " + student.get(7) + "さんの席が変わっていません。");
									}else if{
										System.out.println(" " + student.get(6) + "さんの席が変わっていません。");
								}else if{
									System.out.println(" " + student.get(5) + "さんの席が変わっていません。");
							}else if{
								System.out.println(" " + student.get(4) + "さんの席が変わっていません。");
						}else if{
							System.out.println(" " + student.get(3) + "さんの席が変わっていません。");
					}else if{
						System.out.println(" " + student.get(2) + "さんの席が変わっていません。");
				}else if{
					System.out.println(" " + student.get(1) + "さんの席が変わっていません。");
			}else if{
				System.out.println(" " +  student.get(0) + "さんの席が変わっていません。");
		}
	}
	*/

}