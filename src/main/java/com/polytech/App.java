package com.polytech;

import com.polytech.tp.*;

public class App
{
    public static void main(String[] args) {
        ICours coursBase = new CoursBuilder()
                .setMatiere("Génie Logiciel")
                .setEnseignant("Madjid")
                .setSalle("INF6")
                .setDate("2025-11-20")
                .setHeureDebut("16:39")
                .build();

        ICours coursSpecial = new CoursEnLigne(
                new CoursEnAnglais(
                        new CoursMagistral(coursBase)));

        System.out.println(coursSpecial.getDescription());
    }
}
