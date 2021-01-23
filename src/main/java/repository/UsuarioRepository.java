package repository;

import Utils.ConexaoFactory;
import model.UsuarioEntity;

import javax.persistence.EntityManager;

public class UsuarioRepository {
    private EntityManager em = null;

    public UsuarioRepository() {
        this.em = ConexaoFactory.getConexao();
    }

    public UsuarioEntity buscar(String login) {
        return em.find(UsuarioEntity.class, login);
    }

    public void incluir(UsuarioEntity usuarioEntity) {

        em.getTransaction().begin();
        em.persist(usuarioEntity);
        em.getTransaction().commit();
    }

    public void alterar(UsuarioEntity usuarioEntity) {

        em.getTransaction().begin();
        em.merge(usuarioEntity); //Irá alterar um único objeto
        em.getTransaction().commit();
    }
}
