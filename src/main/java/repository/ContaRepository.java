package repository;

import Utils.ConexaoFactory;
import model.Conta;
import model.UsuarioEntity;

import javax.persistence.EntityManager;

public class ContaRepository {
    private EntityManager em = null;

    public ContaRepository() {
        this.em = ConexaoFactory.getConexao();
    }

    public void incluir(Conta conta) {

        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();
    }
}
