package reservasala;

import java.time.LocalDate;

public class Disponibilidade {
    private Sala sala;
    private LocalDate data;
    private Horario horario;

    public Disponibilidade(Sala sala, LocalDate data, Horario horario) {
        this.sala = sala;
        this.data = data;
        this.horario = horario;
    }

    // Getters e Setters
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
