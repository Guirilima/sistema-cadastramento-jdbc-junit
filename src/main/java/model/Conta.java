package model;

import javax.persistence.*;

@Entity
@Table(name = "tab_conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "conta_numero")
    private String numeroConta ;

    @Column(name = "conta_saldo")
    private Double saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
