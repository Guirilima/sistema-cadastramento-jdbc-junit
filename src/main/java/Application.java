import Utils.ConexaoFactory;
import model.UsuarioEntity;
import repository.UsuarioRepository;
import service.UsuarioService;

import javax.persistence.EntityManager;

public class Application {
    public static void main(String[] args) throws IllegalAccessException {

        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setLogin("Guirilima");
        usuarioEntity.setNome("Guilherme");
        usuarioEntity.setCpf("3434344");
        usuarioEntity.setSenha("1234");

        UsuarioRepository repository = new UsuarioRepository();
        repository.incluir(usuarioEntity);

        //Buscando usuario pelo login
        usuarioEntity = new UsuarioEntity();
        usuarioEntity = repository.buscar("Guirilima");

        //Alterando Dados do Usuario
        usuarioEntity.setNome("NOVO NOME");
        repository.alterar(usuarioEntity);


        //2 - PARTE DO TESTE
        UsuarioEntity usuarioEntity2 = new UsuarioEntity();
        usuarioEntity.setLogin("Guirilima2");
        usuarioEntity.setNome("Guilherme2");
        usuarioEntity.setCpf("34343");
        usuarioEntity.setSenha("4321");

        ///////////////////////
        UsuarioService service = new UsuarioService();
        service.incluir(usuarioEntity);
    }
}
