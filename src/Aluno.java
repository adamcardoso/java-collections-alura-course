public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null){
            throw new NullPointerException("nome não pode ser null");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matrícula: " + this.numeroMatricula + "]";
    }

    @Override
    public int hashCode() { // hashCode() é um método da classe Object que retorna um número inteiro que representa o objeto
        return this.nome.charAt(0);
    }

    @Override
    public boolean equals(Object o) { // sobrescreve o método equals
        Aluno outro = (Aluno) o;
        return this.nome.equals(outro.nome);
    }
}
