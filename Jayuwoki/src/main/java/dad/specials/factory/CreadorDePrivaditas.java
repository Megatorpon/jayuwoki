package dad.specials.factory;

import dad.specials.*;
import dad.specials.privaditas.*;

public class CreadorDePrivaditas {

    public static PrivaditaEspecial fromNumber(int n) {
        if (n == 20) return new PrivaditaSinRoles();
        if (n == 10) return new PrivaditaIlusion();
        if (n == 5) return new PrivaditaIntercambioDeRol();
        if (n == 1) return new PrivaditaChampOpuesto();
        return null; // caso normal
    }
}
