package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "machines")
public class Machine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String ref;

    @Temporal(TemporalType.DATE)
    private Date dateAchat;

    @Column(length = 100)
    private String marque;

    private double prix;

    @ManyToOne
    @JoinColumn(name = "salle_id")
    private Salle salle;

    public Machine() {}

    public Machine(String ref, Date dateAchat, String marque, double prix, Salle salle) {
        this.ref = ref;
        this.dateAchat = dateAchat;
        this.marque = marque;
        this.prix = prix;
        this.salle = salle;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getRef() { return ref; }
    public void setRef(String ref) { this.ref = ref; }
    public Date getDateAchat() { return dateAchat; }
    public void setDateAchat(Date dateAchat) { this.dateAchat = dateAchat; }
    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }
    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }
    public Salle getSalle() { return salle; }
    public void setSalle(Salle salle) { this.salle = salle; }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", ref='" + ref + '\'' + ", marque='" + marque + '\'' + ", prix=" + prix + '}';
    }
}
