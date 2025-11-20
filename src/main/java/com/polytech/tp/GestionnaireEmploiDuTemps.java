package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {

    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observateurs = new ArrayList<>();

    // ========= SUBJECT METHODS =========

    @Override
    public void attach(Observer o) {
        observateurs.add(o);
    }

    @Override
    public void detach(Observer o) {
        observateurs.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer obs : observateurs) {
            obs.update(message);
        }
    }

    // ========= BUSINESS LOGIC =========

    public void ajouterCours(ICours cours) {
        listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        notifyObservers("Nouveau cours ajouté : " + cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        // logique de modification...
        System.out.println("Cours modifié : " + message);
        notifyObservers("Cours modifié : " + message);
    }

    public void setChangement(String changement) {
        notifyObservers(changement);
    }
}
