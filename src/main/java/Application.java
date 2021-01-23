import Utils.ConexaoFactory;

import javax.persistence.EntityManager;

public class Application {
    public static void main(String[] args) {
        //cadastramento de um usuario no BD


        EntityManager em = ConexaoFactory.getConexao();
    }
}
