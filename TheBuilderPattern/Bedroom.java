package ex4;

public class Bedroom {

    private String bedType;
    private String wallColor;
    private String floorType;
    private boolean hasTV;
    private boolean hasDesk;
    private boolean hasBalcony;
    private int numberOfWindows;
    private String lightingType;

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    public void setHasDesk(boolean hasDesk) {
        this.hasDesk = hasDesk;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public void setLightingType(String lightingType) {
        this.lightingType = lightingType;
    }

    public String toString() {
        return "Bedroom{" +
                "bedType='" + bedType + '\'' +
                ", wallColor='" + wallColor + '\'' +
                ", floorType='" + floorType + '\'' +
                ", hasTV=" + hasTV +
                ", hasDesk=" + hasDesk +
                ", hasBalcony=" + hasBalcony +
                ", numberOfWindows=" + numberOfWindows +
                ", lightingType='" + lightingType + '\'' +
                '}';
    }
}