package sample.model;

public class Pessoa {


        private String nome;
        private Contato contato;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Contato getContato() {
            return contato;
        }

    public void setContato(String wats, String email, String twiter) {
        Contato contato = new Contato();
        contato.setWats(wats);
        contato.setEmail(email);
        contato.setTwiter(twiter);
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome +" ," + contato;
    }
}
