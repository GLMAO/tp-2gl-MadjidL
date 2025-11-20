package com.polytech.tp;

/**
 * Décorateur Abstrait : Classe de base pour tous les décorateurs.
 * Elle implémente ICours et encapsule l'objet décoré, déléguant les appels.
 */
public abstract class CoursDecorator implements ICours {

    // Référence à l'objet ICours que nous décorons (Cours, ou un autre Decorator)
    protected ICours coursDecorated;

    public CoursDecorator(ICours cours) {
        // Stockage de la référence à l'objet à décorer
        this.coursDecorated = cours;
    }

    // Délégation par défaut pour les méthodes de ICours

    @Override
    public String getDescription() {
        // Délègue à l'objet encapsulé
        return coursDecorated.getDescription();
    }

    @Override
    public double getDuree() {
        // Délègue à l'objet encapsulé
        return coursDecorated.getDuree();
    }
}