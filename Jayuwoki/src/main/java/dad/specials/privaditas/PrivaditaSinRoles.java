package dad.specials.privaditas;

import dad.specials.*;

public class PrivaditaSinRoles implements PrivaditaEspecial {

    @Override
    public void Crear(SpecialContext ctx) {

        ctx.event.getChannel()
            .sendMessage("🔥 Freemolly labubu ayiyi ahora no tienen excusa")
            .queue();
    }
}