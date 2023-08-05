package reservasala;

import java.time.LocalDate;

public class Reservas {
    private String id;
    private Usuarios usuario;
    private Sala sala;
    private LocalDate data;
    private Horario horario;

    public Reservas(String id, Usuarios usuario, Sala sala, LocalDate data, Horario horario) {
        this.id = id;
        this.usuario = usuario;
        this.sala = sala;
        this.data = data;
        this.horario = horario;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

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
