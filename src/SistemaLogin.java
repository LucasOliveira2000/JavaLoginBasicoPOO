// Importando a classe Scanner para permitir entrada de dados do usuário
import java.util.Scanner;

// Definindo a classe SistemaLogin que contém o método main, ponto de entrada do programa
public class SistemaLogin {
    public static void main(String[] args) {
        // Criando um objeto Usuario com nome de usuário "usuario123" e senha "senha123"
        Usuario usuario = new Usuario("usuario123", "senha123");

        // Criando um objeto Scanner para permitir entrada de dados do usuário pelo console
        Scanner scanner = new Scanner(System.in);

        // Solicitando que o usuário digite o nome de usuário
        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();

        // Solicitando que o usuário digite a senha
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        // Verificando se a senha informada pelo usuário é válida utilizando o método verificarSenha
        if (usuario.verificarSenha(senha)) {
            // Se a senha for válida, exibe uma mensagem de boas-vindas com o nome do usuário
            System.out.println("Login realizado com sucesso! Bem-vindo, " + usuario.getNomeUsuario()+".");
        } else {
            // Caso contrário, exibe uma mensagem de credenciais inválidas
            System.out.println("Credenciais inválidas. Tente novamente.");
        }
    }
}

