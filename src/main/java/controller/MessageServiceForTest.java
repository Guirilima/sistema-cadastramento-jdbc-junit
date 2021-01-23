package controller;

import model.UsuarioEntity;

public class MessageServiceForTest {

    public static UsuarioEntity getCPF() {
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setCpf("45029380841");
        return usuario;
    }

    public static UsuarioEntity getApelido() {
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setNome("Guilherme");
        return usuario;
    }
}
