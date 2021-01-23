import Utils.ConexaoFactory;
import model.UsuarioEntity;

import javax.persistence.EntityManager;

public class Application {
    public static void main(String[] args) {

        EntityManager em = ConexaoFactory.getConexao();

        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setLogin("Guirilima");
        usuarioEntity.setNome("Guilherme");
        usuarioEntity.setCpf("3434344");
        usuarioEntity.setSenha("1234");

        em.getTransaction().begin();
        em.persist(usuarioEntity);
        em.getTransaction().commit();
    }
}
