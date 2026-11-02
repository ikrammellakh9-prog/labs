package services;

import dao.MachineDao;
import entities.Machine;

import java.util.List;

public class MachineService {
    private final MachineDao dao = new MachineDao();

    public boolean create(Machine o) { return dao.create(o); }
    public boolean delete(Machine o) { return dao.delete(o); }
    public boolean update(Machine o) { return dao.update(o); }
    public Machine getById(Long id) { return dao.getById(id); }
    public List<Machine> getAll() { return dao.getAll(); }
    public List<Machine> findByMarque(String marque) { return dao.findByMarque(marque); }
}
