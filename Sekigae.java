import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sekigae{
	static List<String>  student = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h" ,"i", "j", "k"));
	
	public static void main(String[] args){
		System.out.println("\n[[�@���݂̐ȏ��@]]");
		sekigaemae();//�\������
		random();//���בւ���
		
		System.out.println("\t\n����őO�̐Ȃ̂܂܂̐l���A�O�Ɠ����y�A�̐l�����܂���B");
		System.out.println("\n[[�@�V�����ȏ��@]]");
		sekigaemae();//�ȑւ���\������
		System.out.println("[[�����]]");
	}
	//�Ȃ�\�����邾��
	public static void sekigaemae(){
		System.out.println(" �Q�Q�Q�Q�Q�Q�Q�Q�Q�Q�Q");
		System.out.println(" |                    |");
		System.out.println(" | " + student.get(9) + "  " + student.get(8) + " | " + student.get(5) + "  " + student.get(4) + " | " + student.get(1) + "  " + student.get(0) + " |");
		System.out.println(" | " + student.get(10) + "   " + " | " + student.get(7) + "  " + student.get(6) + " | " + student.get(3) + "  " + student.get(2) + " |");		
		System.out.println(" |                    |");
		System.out.println(" �P�P�P�P�P�P�P�P�P�P�P\n");
	}
	//���בւ�
	public static void random(){
		Collections.shuffle(student);
		System.out.println(" ���בւ� �� " + student);
		irekae2(student);//�y�A����������������בւ���
	}
	//�����Ȃ����肷��
	public static String irekae(List<String> list){
		//System.out.println("���בւ���ꂽ���Ԃ͂��ꁨ" + student.get(0));
		//list�͂��łɓ���ւ���Ă���̂Ō��̐ȂƓ��������ׂ�
		while((student.get(0)).equals("a")||(student.get(1)).equals("b")||(student.get(2)).equals("c")||(student.get(3)).equals("d")||(student.get(4)).equals("e")||(student.get(5)).equals("f")||(student.get(6)).equals("g")||(student.get(7)).equals("h")||(student.get(8)).equals("i")||(student.get(9)).equals("j")||(student.get(10)).equals("k")){
			System.out.println(" �������A���̐Ȃ̂܂܂̐l�����܂��E�E�E");
			jyufuku(student);//�ς���Ă��Ȃ��l����肷��
			System.out.println(" ���בւ�����蒼���܂��B");

			random();

		}
		int a =0;
		System.out.println(" �Ȃ��ړ����Ă��Ȃ��l�����܂���I�I " + a++);
		return "";
	
	}
	//�ׂ荇���Ă��Ȃ������ׂ�
	public static String irekae2(List<String> list){
		student.indexOf("a");
		//a-b��r
		if((student.get(0)).equals("b") || (student.get(1)).equals("b")){
			if((student.get(0)).equals("a") || (student.get(1)).equals("a")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(0) + "�����" + student.get(1) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(2)).equals("b") || (student.get(3)).equals("b")){
			if((student.get(2)).equals("a") || (student.get(3)).equals("a")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(2) + "�����" + student.get(3) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
				if((student.get(4)).equals("b") || (student.get(5)).equals("b")){
			if((student.get(4)).equals("a") || (student.get(5)).equals("a")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(4) + "�����" + student.get(5) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(6)).equals("b") || (student.get(7)).equals("b")){
			if((student.get(6)).equals("a") || (student.get(7)).equals("a")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");		
					System.out.println(student.get(6) + "�����" + student.get(7) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(8)).equals("b") || (student.get(9)).equals("b")){
			if((student.get(8)).equals("a") || (student.get(9)).equals("a")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(8) + "�����" + student.get(9) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		
		//c�|d��r
		if((student.get(0)).equals("d") || (student.get(1)).equals("d")){
			if((student.get(0)).equals("c") || (student.get(1)).equals("c")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(0) + "�����" + student.get(1) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(2)).equals("d") || (student.get(3)).equals("d")){
			if((student.get(2)).equals("c") || (student.get(3)).equals("c")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(2) + "�����" + student.get(3) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
				if((student.get(4)).equals("d") || (student.get(5)).equals("d")){
			if((student.get(4)).equals("c") || (student.get(5)).equals("c")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(4) + "�����" + student.get(5) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(6)).equals("d") || (student.get(7)).equals("d")){
			if((student.get(6)).equals("c") || (student.get(7)).equals("c")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(6) + "�����" + student.get(7) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(8)).equals("d") || (student.get(9)).equals("d")){
			if((student.get(8)).equals("c") || (student.get(9)).equals("c")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(8) + "�����" + student.get(9) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		
	//e-f��r
		if((student.get(0)).equals("f") || (student.get(1)).equals("f")){
			if((student.get(0)).equals("e") || (student.get(1)).equals("e")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(0) + "�����" + student.get(1) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(2)).equals("f") || (student.get(3)).equals("f")){
			if((student.get(2)).equals("e") || (student.get(3)).equals("e")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(2) + "�����" + student.get(3) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
				if((student.get(4)).equals("f") || (student.get(5)).equals("f")){
			if((student.get(4)).equals("e") || (student.get(5)).equals("e")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(4) + "�����" + student.get(5) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(6)).equals("f") || (student.get(7)).equals("f")){
			if((student.get(6)).equals("e") || (student.get(7)).equals("e")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(6) + "�����" + student.get(7) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(8)).equals("f") || (student.get(9)).equals("f")){
			if((student.get(8)).equals("e") || (student.get(9)).equals("e")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");		
					System.out.println(student.get(8) + "�����" + student.get(9) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
	//g-h��r
		if((student.get(0)).equals("h") || (student.get(1)).equals("h")){
			if((student.get(0)).equals("g") || (student.get(1)).equals("g")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");		
					System.out.println(student.get(0) + "�����" + student.get(1) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(2)).equals("h") || (student.get(3)).equals("h")){
			if((student.get(2)).equals("g") || (student.get(3)).equals("g")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(2) + "�����" + student.get(3) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
				if((student.get(4)).equals("h") || (student.get(5)).equals("h")){
			if((student.get(4)).equals("g") || (student.get(5)).equals("g")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(4) + "�����" + student.get(5) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(6)).equals("h") || (student.get(7)).equals("h")){
			if((student.get(6)).equals("g") || (student.get(7)).equals("g")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(6) + "�����" + student.get(7) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(8)).equals("h") || (student.get(9)).equals("h")){
			if((student.get(8)).equals("g") || (student.get(9)).equals("g")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(8) + "�����" + student.get(9) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
	//i-j��r
		if((student.get(0)).equals("j") || (student.get(1)).equals("j")){
			if((student.get(0)).equals("i") || (student.get(1)).equals("i")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(0) + "�����" + student.get(1) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(2)).equals("j") || (student.get(3)).equals("j")){
			if((student.get(2)).equals("i") || (student.get(3)).equals("i")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(2) + "�����" + student.get(3) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
				if((student.get(4)).equals("j") || (student.get(5)).equals("j")){
			if((student.get(4)).equals("i") || (student.get(5)).equals("i")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(4) + "�����" + student.get(5) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(6)).equals("j") || (student.get(7)).equals("j")){
			if((student.get(6)).equals("i") || (student.get(7)).equals("i")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(6) + "�����" + student.get(7) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}
		if((student.get(8)).equals("j") || (student.get(9)).equals("j")){
			if((student.get(8)).equals("i") || (student.get(9)).equals("i")){
					System.out.println(" �O�ɓ������������l�Ƃׂ͗荇���Ă͂����܂���B");
					System.out.println(student.get(8) + "�����" + student.get(9) + "���񂪗ׂ荇���Ă��܂��B");
					System.out.println("���בւ�����蒼���܂��B");
				random();
			}
		}

			System.out.println(" �O�Ɠ����y�A�����ׂ܂����B�����y�A�͂���܂���I");
			irekae(student);//�����Ȃ���������בւ���
		return "";
	}
	//�N�������Ȃ�
	public static void jyufuku(List<String> list){
		int count =0;
		
	
			count++;
			
		/*
		if(student.get(0).equals("a")){//��Ԗڂ�a����̂Ƃ�
			System.out.println(" " +  student.get(0) + "����̐Ȃ��ς���Ă��܂���B");
			count++;
		}else if(student.get(1).equals("b")){//�Q�Ԗڂ�b����̂Ƃ�
			System.out.println(" " +  student.get(1) + "����̐Ȃ��ς���Ă��܂���B");
			count++;
		}else if(student.get(2).equals("c")){//3�Ԗڂ�c����̂Ƃ�
			System.out.println(" " +  student.get(2) + "����̐Ȃ��ς���Ă��܂���B");
			count++;
		}else if(student.get(3).equals("d")){//4�Ԗڂ�d����̂Ƃ�
			System.out.println(" " +  student.get(3) + "����̐Ȃ��ς���Ă��܂���B");
			count++;
		}else if(student.get(4).equals("e")){//5�Ԗڂ�e����̂Ƃ�
			System.out.println(" " +  student.get(4) + "����̐Ȃ��ς���Ă��܂���B");
			count++;
		}else if(student.get(5).equals("f")){//6�Ԗڂ�f����̂Ƃ�
			System.out.println(" " +  student.get(5) + "����̐Ȃ��ς���Ă��܂���B");
			count++;
		}else if(student.get(6).equals("g")){//7�Ԗڂ�g����̂Ƃ�
			System.out.println(" " +  student.get(6) + "����̐Ȃ��ς���Ă��܂���B");
			count++;
		}else if(student.get(7).equals("h")){//8�Ԗڂ�h����̂Ƃ�
			System.out.println(" " +  student.get(7) + "����̐Ȃ��ς���Ă��܂���B");
			count++;
		}else if(student.get(8).equals("i")){//9�Ԗڂ�i����̂Ƃ�
			System.out.println(" " +  student.get(8) + "����̐Ȃ��ς���Ă��܂���B");
			count++;
		}else if(student.get(9).equals("j")){//10�Ԗڂ�j����̂Ƃ�
			System.out.println(" " +  student.get(9) + "����̐Ȃ��ς���Ă��܂���B");
			count++;
		}else if(student.get(10).equals("k")){//11�Ԗڂ�k����̂Ƃ�
			System.out.println(" " +  student.get(10) + "����̐Ȃ��ς���Ă��܂���B");
			count++;
		}*/
				
			
		
	}
		//�N�������Ȃ�
	/*public static void jyufuku2(List<String> list){
		String[] a = student.toArray(new String[0]);
		int[] z ={1,2,3,4,5,6,7,8,9,10,11};
		for(int i = 1; i <11; i++){
				//System.out.println(" " +  student.get(i) + "�����");
			
			switch(z[i]){
			case 0:
				System.out.println("a����͐Ȃ��ς���Ă��܂���B");
			case 1:
				System.out.println("b����͐Ȃ��ς���Ă��܂���B");
			case 3:
				System.out.println("c����͐Ȃ��ς���Ă��܂���B");
			case 4:
				System.out.println("d����͐Ȃ��ς���Ă��܂���B");
			case 5:
				System.out.println("e����͐Ȃ��ς���Ă��܂���B");
			case 6:
				System.out.println("f����͐Ȃ��ς���Ă��܂���B");
			case 7:
				System.out.println("g����͐Ȃ��ς���Ă��܂���B");
			case 8:
				System.out.println("h����͐Ȃ��ς���Ă��܂���B");
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
														System.out.println(" " + student.get(10) + "����̐Ȃ��ς���Ă��܂���B");
												}else if{
														System.out.println(" " + student.get(9) + "����̐Ȃ��ς���Ă��܂���B");
											}else if{
													System.out.println(" " + student.get(8) + "����̐Ȃ��ς���Ă��܂���B");
										}else if{
												System.out.println(" " + student.get(7) + "����̐Ȃ��ς���Ă��܂���B");
									}else if{
										System.out.println(" " + student.get(6) + "����̐Ȃ��ς���Ă��܂���B");
								}else if{
									System.out.println(" " + student.get(5) + "����̐Ȃ��ς���Ă��܂���B");
							}else if{
								System.out.println(" " + student.get(4) + "����̐Ȃ��ς���Ă��܂���B");
						}else if{
							System.out.println(" " + student.get(3) + "����̐Ȃ��ς���Ă��܂���B");
					}else if{
						System.out.println(" " + student.get(2) + "����̐Ȃ��ς���Ă��܂���B");
				}else if{
					System.out.println(" " + student.get(1) + "����̐Ȃ��ς���Ă��܂���B");
			}else if{
				System.out.println(" " +  student.get(0) + "����̐Ȃ��ς���Ă��܂���B");
		}
	}
	*/

}