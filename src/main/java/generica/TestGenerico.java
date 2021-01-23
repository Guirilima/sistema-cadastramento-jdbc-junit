package generica;

public class TestGenerico {
    public static void main(String[] args) {
        ClasseGenerica<A> cg = new ClasseGenerica(); //Agora aqui definimos que queremos trabalhar com o A

        A a = new A();
        A aa = new A();

        B b = new B();
        B bb = new B();

        cg.add(a);
        //cg.add(b);

        cg.add(aa);
        //cg.add(bb);

        for ( A i : cg.getList() ) {
            i.metodo();
        }

        B find = cg.get(0); //Dará erro na conversão do cast
        A find2 = cg.get(0); //Sucesso.
    }
}
