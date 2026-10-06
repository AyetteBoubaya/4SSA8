package tn.esprit.autoLoc.services;

import tn.esprit.autoLoc.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    void supprimerMaintenance(Long id);
    List<Maintenance> recupererMaitnenance();
    Maintenance modifierMaintenance(Maintenance maintenance);
}
