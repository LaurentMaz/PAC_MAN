/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.modele;

public class Pacman extends MobileElement {

    private PacmanStatus status;

    public PacmanStatus getStatus() {
        return status;
    }

    public void setStatus(PacmanStatus status) {
        this.status = status;
    }
}
