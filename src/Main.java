import criptografia.Criptografar;

public class Main {

	public static void main(String[] args) {
		String mensagem = "Atividade de Seguranca da Informacao";
		mensagem = mensagem.replaceAll("[^a-zA-Z ]", "?").toUpperCase();
		
		String mensagemCriptografada = Criptografar.criptografarMensagem(mensagem, 3);
		
		System.out.println("\nMensagem a ser criptografada: " + mensagem);
		System.out.println("\nMensagem criptografada: " + mensagemCriptografada);
		System.out.println("\nMensagem decifrada: " + Criptografar.decifrarMensagem(mensagemCriptografada, 3));
	}

}
