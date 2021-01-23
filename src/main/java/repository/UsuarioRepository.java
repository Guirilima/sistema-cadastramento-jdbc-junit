package repository;

import Utils.ConexaoFactory;
import model.UsuarioEntity;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

public class UsuarioRepository {
    private EntityManager em = null;

    public UsuarioRepository() {
        this.em = ConexaoFactory.getConexao();
    }

    public UsuarioEntity buscar(String login) {
        return em.find(UsuarioEntity.class, login);
    }

    public boolean exists(String login) {
        Query query = em.createQuery("SELECT tu FROM UsuarioEntity tu WHERE tu.login = :login"); //JPQL
        query.setParameter("login",login);
        return query.getResultList().size() != 0 ;
    }

    public UsuarioEntity buscarByLogin(String login) {
        Query query = em.createQuery("SELECT tu FROM UsuarioEntity tu WHERE tu.login = :login"); //JPQL
        query.setParameter("login",login);

        UsuarioEntity usuarioEntity = null;
        try {
            usuarioEntity = (UsuarioEntity) query.getSingleResult();
        }catch (NoResultException | NonUniqueResultException nre) {
            //usuarioEntity = null; // Irrelevante, pois ele já é null . . .
        }
        return usuarioEntity;
    }

    public void incluir(UsuarioEntity usuarioEntity) {

        //em.getTransaction().begin();
        em.persist(usuarioEntity);
        //em.getTransaction().commit();
    }

    public void alterar(UsuarioEntity usuarioEntity) {

        em.getTransaction().begin();
        em.merge(usuarioEntity); //Irá alterar um único objeto
        em.getTransaction().commit();
    }
}
