package reservasala;

public class Usuarios {
	private String id;
    private String nome;
    private String senha;
    private boolean isAdmin;

    public Usuarios(String id, String nome, String senha, boolean isAdmin) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }
 
    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
