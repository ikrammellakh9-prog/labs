package services;

import dao.SalleDao;
import entities.Salle;

import java.util.List;

public class SalleService {
    private final SalleDao dao = new SalleDao();

    public boolean create(Salle o) { return dao.create(o); }
    public boolean delete(Salle o) { return dao.delete(o); }
    public boolean update(Salle o) { return dao.update(o); }
    public Salle getById(Long id) { return dao.getById(id); }
    public List<Salle> getAll() { return dao.getAll(); }
}
