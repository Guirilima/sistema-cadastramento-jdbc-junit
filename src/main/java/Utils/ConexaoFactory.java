package Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoFactory {
    private static EntityManager em;
    public static EntityManager getConexao() {
        if( em == null ) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MY_PU");
            em = emf.createEntityManager();
        }
        return em;
    }
}
