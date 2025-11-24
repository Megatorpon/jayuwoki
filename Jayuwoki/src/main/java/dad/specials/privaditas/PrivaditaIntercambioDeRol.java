package dad.specials.privaditas;

import java.util.Random;

import dad.specials.*;

public class PrivaditaIntercambioDeRol implements PrivaditaEspecial {

    @Override
    public void Crear(SpecialContext ctx) {
        Random rand = new Random();
        int blueSpecialIndex = rand.nextInt(5);
        int redSpecialIndex = rand.nextInt(5);

        int roleCount = ctx.baseRoles.size();
        for (int i = 0; i < 5; i++) {
            String base = ctx.baseRoles.get(i % roleCount);
            ctx.blueRoles.set(i, (i == blueSpecialIndex) ? base + "*" : base);
            ctx.redRoles.set(i, (i == redSpecialIndex) ? base + "*" : base);
        }
        
        ctx.event.getChannel().sendMessage("\uD83D\uDD25 Atención: " 
                                            + ctx.blueTeam.get(blueSpecialIndex).getName() + " y " 
                                            + ctx.redTeam.get(redSpecialIndex).getName() 
                                            + " pueden cambiar su rol con cualquier miembro del equipo (*)").queue();
    }
}