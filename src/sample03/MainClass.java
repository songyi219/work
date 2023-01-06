package sample03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class MainClass {

	public static void main(String[] args)throws Exception {
		
		System.out.println("수정하였음!!!");
		
		// input(�Է�)	- console
		Scanner sc = new Scanner(System.in);
		
		// boolean ����
		/*
		boolean b;	// �Է��� �����͸� ������ ����
		System.out.print("b = ");    // �Է��� �����͸� ���
		b = sc.nextBoolean();
		System.out.println("b:" + b);	// �Է��� ��� ���
		 */
		
		
		// integer
		
		/*
		int number;
		System.out.print("number = ");
		number = sc.nextInt();
		System.out.println("number:" + number);
		*/
		
		// double
		/*
		double d;
		System.out.print("d = ");
		d = sc.nextDouble();
		System.out.println("d:" + d);
		*/
		
		// string
		/*
		String str;
		System.out.print("str = ");
		str = sc.next();
		System.out.println("str:" + str);
		*/
		
		// file, network
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		System.out.print("str = ");
		str = br.readLine();
		System.out.println("str:" + str);
		
		
		
	}

}
