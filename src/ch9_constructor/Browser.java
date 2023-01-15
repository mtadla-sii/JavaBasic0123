package ch9_constructor;

public class Browser {
    String vendor;
    String name;
    int version;

    // tutaj powinna byc konstrukcja z 'this.' -> patrz klasa Peson
    public Browser(String vendorToSet, String nameToSet, int versionToSet) {
        vendor = vendorToSet;
        name = nameToSet;
        version = versionToSet;
    }

    public String getBrowserData() {
        return vendor + " " + name + " " + version;
    }
}
