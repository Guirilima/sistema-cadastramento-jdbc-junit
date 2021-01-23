package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tab_usuario",uniqueConstraints = @UniqueConstraint(columnNames = "user", name = "uk_user"))
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user",length = 20)
    private String login;

    @Column(name = "password",length = 100,nullable = false)
    private String senha;

    @Column(length = 50,nullable = false)
    private String nome;

    @Column(length = 12,nullable = false)
    private String cpf;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Conta conta = new Conta();

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public UsuarioEntity(){}

    public UsuarioEntity(Integer id, String login, String senha, String nome, String cpf) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(senha, that.senha) &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, senha, nome, cpf);
    }
}
