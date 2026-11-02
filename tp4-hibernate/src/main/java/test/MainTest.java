package test;

import entities.Machine;
import entities.Salle;
import services.MachineService;
import services.SalleService;

import java.util.Date;

public class MainTest {
    public static void main(String[] args) {
        SalleService salleService = new SalleService();
        MachineService machineService = new MachineService();

        Salle salle1 = new Salle("B204");
        salleService.create(salle1);

        Machine m1 = new Machine("PC-01", new Date(), "Dell", 8500.0, salle1);
        Machine m2 = new Machine("PC-02", new Date(), "HP", 9200.0, salle1);

        machineService.create(m1);
        machineService.create(m2);

        System.out.println("Liste des salles :");
        salleService.getAll().forEach(System.out::println);

        System.out.println("Liste des machines Dell :");
        machineService.findByMarque("Dell").forEach(System.out::println);
    }
}
