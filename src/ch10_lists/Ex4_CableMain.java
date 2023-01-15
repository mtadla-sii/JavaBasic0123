package ch10_lists;

import java.util.ArrayList;
import java.util.List;

public class Ex4_CableMain {

    public static void main(String[] args) {
        List<Cable> cables = new ArrayList<>();

        cables.add(new Cable("usb"));
        cables.add(new Cable("hdmi"));
        cables.add(new Cable("dsub"));
        cables.add(new Cable("dvi"));

        for (Cable cable : cables) {
            cable.printInfo();
        }
    }
}
