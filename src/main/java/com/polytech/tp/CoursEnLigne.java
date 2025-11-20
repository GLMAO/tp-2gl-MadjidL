package com.polytech.tp;

/**
 * Décorateur Concret : Ajoute la caractéristique "En ligne".
 * Surcharge getDescription() pour ajouter un suffixe.
 */
public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        // Appel au constructeur parent pour initialiser coursDecorated
        super(cours);
    }

    @Override
    public String getDescription() {
        // On prend la description actuelle et on ajoute notre spécificité
        return super.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
        // La durée ne change pas, on utilise la méthode par défaut du parent
        return super.getDuree();
    }
}