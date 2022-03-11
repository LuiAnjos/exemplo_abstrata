public class Principal {
    public static void main(String[] args) {
        Papagaio p = new Papagaio();
        Cachorro c = new Cachorro();
        Gato g = new Gato();

        p.setNome("Louro");
        System.out.println(p.getNome());
        System.out.println(p.voar());
        System.out.println(p.emitirSom());

        c.setNome("Apolo");
        System.out.println(c.getNome());
        System.out.println(c.amamentar());
        System.out.println(c.emitirSom());

        g.setNome("Mingau");
        System.out.println(g.getNome());
        System.out.println(g.amamentar());
        System.out.println(g.emitirSom());

    }
}
