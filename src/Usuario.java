// Definindo a classe Usuario que representa um usuário do sistema
public class Usuario {
    // Atributos privados que armazenam o nome de usuário e senha
    private String nomeUsuario;
    private String senha;

    // Construtor da classe Usuario
    // Recebe o nome de usuário e senha como parâmetros e inicializa os atributos do objeto
    public Usuario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    // Método para verificar se a senha informada é válida
    // Recebe a senha informada pelo usuário como parâmetro e compara com a senha armazenada no objeto
    public boolean verificarSenha(String senhaInformada) {
        return this.senha.equals(senhaInformada);
    }

    // Método para obter o nome do usuário
    // Retorna o valor do atributo nomeUsuario
    public String getNomeUsuario() {
        return nomeUsuario;
    }
}

