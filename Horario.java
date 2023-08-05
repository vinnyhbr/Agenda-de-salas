package reservasala;

public class Horario {
	private String id;
    private String horarioInicio;
    private String horarioFim;

    public Horario(String id, String horarioInicio, String horarioFim) {
        this.id = id;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }
}
