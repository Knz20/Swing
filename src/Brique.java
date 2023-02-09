
import javax.swing.*;
import java.awt.*;

public class Brique extends JButton {
    private Color couleur;
    private int ligne;
    private int colonne;
    private boolean active;

    public Brique(int _ligne, int _colonne) {
        this.ligne = _ligne;
        this.colonne = _colonne;
        this.couleur = choixCouleur();
        this.active = true;
        this.setBackground(couleur);
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color _couleur) {
        this.couleur = _couleur;
    }

    public int getLigne() {
        return ligne;
    }

    public void setLigne(int _ligne) {
        this.ligne = _ligne;
    }

    public int getColonne() {
        return colonne;
    }

    public void setColonne(int _colonne) {
        this.colonne = _colonne;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean _active) {
        this.active = _active;
    }

    private static Color choixCouleur() {
        //Choisi alÃ©atoirement la couleur de la brique
        int coul = (int) (Math.random() * 7);
        if (coul == 1) return Color.CYAN;
        if (coul == 2) return Color.YELLOW;
        if (coul == 3) return Color.RED;
        if (coul == 4) return Color.GREEN;
        if (coul == 5) return Color.BLUE;
        else return Color.MAGENTA;
    }

    public void cliquee(){
        this.active = false;
        this.couleur = Color.WHITE;
        this.setBackground(couleur);
    }

    public void activer(){
        this.active = true;
        this.setBackground(couleur);
    }}

