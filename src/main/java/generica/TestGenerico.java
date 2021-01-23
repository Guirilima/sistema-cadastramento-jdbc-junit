package generica;

public class TestGenerico {
    public static void main(String[] args) {
        ClasseGenerica<A> cg = new ClasseGenerica(); //Agora aqui definimos que queremos trabalhar com o A

        A a = new A();
        A aa = new A();

        B b = new B();
        B bb = new B();

        cg.add(a);
        //cg.add(b);    //Definimos na linha 5, que iremos trabalhar com a Classe A

        cg.add(aa);
        //cg.add(bb);   //Definimos na linha 5, que iremos trabalhar com a Classe A

        for ( A i : cg.getList() ) {
            i.metodo();
        }

        B find = cg.get(0); //Dará erro na conversão do cast  //Definimos na linha 5, que iremos trabalhar com a Classe A
        A find2 = cg.get(0); //Sucesso.
    }
}
