package ex4;

public class Architect {

    public static void main(String[] args) {

        BedroomBuilder builder = new BedroomBuilder();

        builder.setBedType("King Size");
        builder.setWallColor("White");
        builder.setFloorType("Wood");
        builder.setHasTV(true);
        builder.setHasDesk(true);
        builder.setHasBalcony(true);
        builder.setNumberOfWindows(2);
        builder.setLightingType("LED");

        Bedroom bedroom = builder.getBedroom();

        System.out.println(bedroom);
    }
}