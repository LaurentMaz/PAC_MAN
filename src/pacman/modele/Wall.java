/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.modele;

public class Wall extends StaticElement {

    private WallTypeId wallTypeId;

    public Wall(WallTypeId id) {
        this.wallTypeId = id;
    }

    public WallTypeId getWallTypeId() {
        return wallTypeId;
    }

    public void setWallTypeId(WallTypeId wallTypeId) {
        this.wallTypeId = wallTypeId;
    }
}
