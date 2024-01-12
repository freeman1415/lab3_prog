package Enums;

public enum Location {
    HERE("тут"),NOTHERE("не тут");
    private String translation;
    Location(String translation){
        this.translation=translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
