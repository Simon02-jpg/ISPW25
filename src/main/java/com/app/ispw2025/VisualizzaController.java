package com.app.ispw2025;

import model.domain.ui.GestionePerUI;

public class VisualizzaController extends Generic {
    public void elimina(){
        setComandi();
        comandi.elimina(posizione,testoLibero);
    }

    public static void passGestione(GestionePerUI temporaneo){
        gestionePerUI = temporaneo;
    }
}
