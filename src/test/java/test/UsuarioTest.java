package test;

import controller.MessageServiceForTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsuarioTest {

    @DisplayName("Test MessageService.getCPF()") //E usada para fornecer um nome personalizado para a classe de teste e métodos de teste
    @Test   //no JUnit > 4 os métodos de teste são identificados com a anotação @Test
    void loginComprimentoCpfTest() {
        assertEquals(11, MessageServiceForTest.getCPF().length());
    }

    @DisplayName("Test MessageService.getApelido()")
    @Test
    void loginComprimentoApelidoTest() {
        assertEquals(true, (MessageServiceForTest.getApelido().length() < 20));
    }
}