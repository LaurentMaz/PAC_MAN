/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.modele;

public class Ghost extends MobileElement {

    private GhostStatus status;

    private int color;

    public Ghost(int color) {
        this.color = color;
    }

    public GhostStatus getStatus() {
        return status;
    }

    public int getColor() {
        return color;
    }

    public void setStatus(GhostStatus status) {
        this.status = status;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
