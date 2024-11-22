package bai4;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
	private HashMap<String, String> dictionary;

	public Dictionary() {
		dictionary = new HashMap<>();
		dictionary.put("apple"," qua tao");
		dictionary.put("ball"," qua bong");
		dictionary.put("cat"," con meo");
		dictionary.put("dog"," con cho");
		dictionary.put("elephant","con voi");
		dictionary.put("fish"," con ca");
		dictionary.put("gift"," mon qua");
		dictionary.put("home"," nha");
		// TODO Auto-generated constructor stub
	}
	public String lookup(String word) {
		return dictionary.getOrDefault(word, null);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dictionary td = new Dictionary();
	while(true) {
		System.out.println("nhap tu can tra: ");
		String word = sc.next();
		if(word.isEmpty()) {
			break;
		}
		String mean = td.lookup(word);
		if(mean != null) {
			System.out.println("nghia la: " + mean);
		}
		else {
			System.out.println("k co trong tu dien");
		}
	}
		
	}
}
