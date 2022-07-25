package ramos.s.j.mauricio.uno.morintegraocomjava.databae_app.tabelas;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "tblAluno", indices = {@Index(value = "id", unique = true), @Index(value = "nome")
       , @Index(value = "celular"), @Index(value = "email"), @Index(value = "gitHubUsuario")})

public class Aluno {
    @PrimaryKey(autoGenerate = true)

    private int id;
    private String nome, celular, email, gitHubUsuario;

    public Aluno() {}

    //Construtor de cópia
    public  Aluno(Aluno tblAluno){
        this.id            = tblAluno.getId();
        this.nome          = tblAluno.getNome();
        this.celular       = tblAluno.getCelular();
        this.email         = tblAluno.getEmail();
        this.gitHubUsuario = tblAluno.getGitHubUsuario();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGitHubUsuario() {
        return gitHubUsuario;
    }

    public void setGitHub(String gitHub) {
        this.gitHubUsuario = gitHub;
    }
}
