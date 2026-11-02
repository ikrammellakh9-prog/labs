package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "salles")
public class Salle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String code;

    @OneToMany(mappedBy = "salle", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Machine> machines;

    public Salle() {}

    public Salle(String code) {
        this.code = code;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public List<Machine> getMachines() { return machines; }
    public void setMachines(List<Machine> machines) { this.machines = machines; }

    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", code='" + code + '\'' + '}';
    }
}
