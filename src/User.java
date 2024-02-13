import java.time.OffsetDateTime;

public class User {
    public User(int id, String nome, OffsetDateTime dataDiNascita) {
        this.id = id;
        this.nome = nome;
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                '}';
    }

    private int id;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public OffsetDateTime getDataDiNascita() {
        return dataDiNascita;
    }

    private String nome;
    private OffsetDateTime dataDiNascita;


}
