package ex4;

public class BedroomBuilder implements Builder {

    private Bedroom bedroom;

    public BedroomBuilder() {
        bedroom = new Bedroom();
    }

    public void setBedType(String bedType) {
        bedroom.setBedType(bedType);
    }

    public void setWallColor(String wallColor) {
        bedroom.setWallColor(wallColor);
    }

    public void setFloorType(String floorType) {
        bedroom.setFloorType(floorType);
    }

    public void setHasTV(boolean hasTV) {
        bedroom.setHasTV(hasTV);
    }

    public void setHasDesk(boolean hasDesk) {
        bedroom.setHasDesk(hasDesk);
    }

    public void setHasBalcony(boolean hasBalcony) {
        bedroom.setHasBalcony(hasBalcony);
    }

    public void setNumberOfWindows(int numberOfWindows) {
        bedroom.setNumberOfWindows(numberOfWindows);
    }

    public void setLightingType(String lightingType) {
        bedroom.setLightingType(lightingType);
    }

    public Bedroom getBedroom() {
        return bedroom;
    }
}