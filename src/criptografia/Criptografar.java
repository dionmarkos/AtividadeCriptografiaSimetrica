package criptografia;

import java.util.HashMap;
import java.util.Map;

public class Criptografar {

	private static Map<String, Character> mapaAlfabeto1 = new HashMap<String, Character>();
	private static Map<String, Character> mapaAlfabeto2 = new HashMap<String, Character>();
	private static Map<String, Character> mapaAlfabeto3 = new HashMap<String, Character>();

	public static void gerarMapasAlfabeto() {
		
		mapaAlfabeto1.put("@*L", 'A');
		mapaAlfabeto1.put("%T(", 'B');
		mapaAlfabeto1.put("*!$", 'C');
		mapaAlfabeto1.put("YÄL", 'D');
		mapaAlfabeto1.put("D*L", 'E');
		mapaAlfabeto1.put("F21", 'F');
		mapaAlfabeto1.put("2@#", 'G');
		mapaAlfabeto1.put("p0_", 'H');
		mapaAlfabeto1.put("_=+", 'I');
		mapaAlfabeto1.put("-/*", 'J');
		mapaAlfabeto1.put("$35", 'K');
		mapaAlfabeto1.put(".+2", 'L');
		mapaAlfabeto1.put("---", 'M');
		mapaAlfabeto1.put("!%$", 'N');
		mapaAlfabeto1.put("&*(", 'O');
		mapaAlfabeto1.put("&W5", 'P');
		mapaAlfabeto1.put("++*", 'Q');
		mapaAlfabeto1.put("11@", 'R');
		mapaAlfabeto1.put("sf.", 'S');
		mapaAlfabeto1.put("WE_", 'T');
		mapaAlfabeto1.put("O.I", 'U');
		mapaAlfabeto1.put("O_a", 'V');
		mapaAlfabeto1.put("0!l", 'W');
		mapaAlfabeto1.put("IlI", 'X');
		mapaAlfabeto1.put("@g_", 'Y');
		mapaAlfabeto1.put("_-_", 'Z');
		mapaAlfabeto1.put("-26", ' ');
	
		mapaAlfabeto2.put("F|a", 'A');
		mapaAlfabeto2.put("C(^", 'B');
		mapaAlfabeto2.put("L0_", 'C');
		mapaAlfabeto2.put("5ST", 'D');
		mapaAlfabeto2.put("N$_", 'E');
		mapaAlfabeto2.put("X(=", 'F');
		mapaAlfabeto2.put("I4>", 'G');
		mapaAlfabeto2.put("Q{%", 'H');
		mapaAlfabeto2.put("K 3", 'I');
		mapaAlfabeto2.put("J01", 'J');
		mapaAlfabeto2.put("{IU", 'K');
		mapaAlfabeto2.put("%NW", 'L');
		mapaAlfabeto2.put("k<=", 'M');
		mapaAlfabeto2.put("u5S", 'N');
		mapaAlfabeto2.put("]1^", 'O');
		mapaAlfabeto2.put(";rU", 'P');
		mapaAlfabeto2.put("7Fp", 'Q');
		mapaAlfabeto2.put("0oJ", 'R');
		mapaAlfabeto2.put("71,", 'S');
		mapaAlfabeto2.put(":mf", 'T');
		mapaAlfabeto2.put("0b@", 'U');
		mapaAlfabeto2.put("F*r", 'V');
		mapaAlfabeto2.put("Eao", 'W');
		mapaAlfabeto2.put("fsv", 'X');
		mapaAlfabeto2.put(")~6", 'Y');
		mapaAlfabeto2.put("4,k", 'Z');
		mapaAlfabeto2.put("7*7", ' ');
		
		mapaAlfabeto3.put("{^,", 'A');
		mapaAlfabeto3.put("*kE", 'B');
		mapaAlfabeto3.put("5dA", 'C');
		mapaAlfabeto3.put("Y7@", 'D');
		mapaAlfabeto3.put("@;S", 'E');
		mapaAlfabeto3.put("?sx", 'F');
		mapaAlfabeto3.put("}cf", 'G');
		mapaAlfabeto3.put("|io", 'H');
		mapaAlfabeto3.put("W1N", 'I');
		mapaAlfabeto3.put("W:u", 'J');
		mapaAlfabeto3.put("D7z", 'K');
		mapaAlfabeto3.put("=2*", 'L');
		mapaAlfabeto3.put(")L?", 'M');
		mapaAlfabeto3.put("[hu", 'N');
		mapaAlfabeto3.put("\"4{", 'O');
		mapaAlfabeto3.put("EzG", 'P');
		mapaAlfabeto3.put("0TF", 'Q');
		mapaAlfabeto3.put("5`!", 'R');
		mapaAlfabeto3.put("2#0", 'S');
		mapaAlfabeto3.put("{%4", 'T');
		mapaAlfabeto3.put("[|$", 'U');
		mapaAlfabeto3.put("8#`", 'V');
		mapaAlfabeto3.put("6\\1", 'W');
		mapaAlfabeto3.put("7M4", 'X');
		mapaAlfabeto3.put("gT ", 'Y');
		mapaAlfabeto3.put("4Ax", 'Z');
		mapaAlfabeto3.put("/o~", ' ');
	}
	
	public static String criptografarMensagem(String mensagem, int chave) {
		Criptografar.gerarMapasAlfabeto();
		String mensagemCriptografada = "";
		
		switch (chave) {
		
			case 1:
				for(int i = 0; i < mensagem.length(); i++) {
					for (Map.Entry<String, Character> entry : mapaAlfabeto1.entrySet()) {
						if( entry.getValue() == mensagem.charAt(i)) {
							mensagemCriptografada += entry.getKey();
						}
					}
				}
				break;
				
			case 2:
				for(int i = 0; i < mensagem.length(); i++) {
					for (Map.Entry<String, Character> entry : mapaAlfabeto2.entrySet()) {
						if( entry.getValue() == mensagem.charAt(i)) {
							mensagemCriptografada += entry.getKey();
						}
					}
				}
				break;
				
			case 3:
				for(int i = 0; i < mensagem.length(); i++) {
					for (Map.Entry<String, Character> entry : mapaAlfabeto3.entrySet()) {
						if( entry.getValue() == mensagem.charAt(i)) {
							mensagemCriptografada += entry.getKey();
						}
					}
				}
				break;
				
			default:
				System.out.println("Erro.");
		}
		return mensagemCriptografada;
	}
	
	public static String decifrarMensagem(String mensagem, int chave) {
		String mensagemDecifrada = "";
		String caracteres;
		
		switch (chave) {
		
			case 1:
				for(int i = 0; i < mensagem.length();) {
					caracteres = mensagem.substring(i, i+=3);
					
					for (Map.Entry<String, Character> entry : mapaAlfabeto1.entrySet() ) {
						if(entry.getKey().equals(caracteres)) {
							mensagemDecifrada += entry.getValue();
							break;
						}
					}
				}
				break;
				
			case 2:
				for(int i = 0; i < mensagem.length();) {
					caracteres = mensagem.substring(i, i+=3);
					
					for (Map.Entry<String, Character> entry : mapaAlfabeto2.entrySet() ) {
						if(entry.getKey().equals(caracteres)) {
							mensagemDecifrada += entry.getValue();
							break;
						}
					}
				}
				break;
				
			case 3:
				for(int i = 0; i < mensagem.length();) {
					caracteres = mensagem.substring(i, i+=3);
					
					for (Map.Entry<String, Character> entry : mapaAlfabeto3.entrySet() ) {
						if(entry.getKey().equals(caracteres)) {
							mensagemDecifrada += entry.getValue();
							break;
						}
					}
				}
				break;
				
			default:
				System.out.println("Erro.");
		}
		return mensagemDecifrada;
	}
}