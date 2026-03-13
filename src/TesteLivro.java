import jdk.swing.interop.SwingInterOpUtils;

public class TesteLivro {
    public static void main(String[] args) {
        //Criar objetos - instanciar
        Livro meuLivro = new Livro();
        meuLivro.titulo = "Harry potter";
        meuLivro.editora = "editora";
        System.out.println(meuLivro.titulo);
        System.out.println(meuLivro);
        Livro favorito = new Livro();

    }
}
