/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.modele;

public class Space extends StaticElement {

    private SpaceTypeId spaceTypeId;

    public Space(SpaceTypeId id) {
        this.spaceTypeId = id;
    }

    public SpaceTypeId getSpaceTypeId() {
        return spaceTypeId;
    }

    public void setSpaceTypeId(SpaceTypeId spaceTypeId) {
        this.spaceTypeId = spaceTypeId;
    }
}
