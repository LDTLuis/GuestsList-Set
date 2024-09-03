import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite) {
        Convidado convidadoRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidado() {
        return convidadoSet.size();
    }

    public void exibirConvidado() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Luisa", 1234);
        conjuntoConvidados.adicionarConvidado("Carlos", 5678);
        conjuntoConvidados.adicionarConvidado("Otavio", 2468);
        conjuntoConvidados.adicionarConvidado("Alexandre", 1357);

        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do Set de convidados");

        conjuntoConvidados.exibirConvidado();

    }
}
