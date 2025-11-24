package dad.specials.privaditas;

import java.util.Random;

import dad.specials.*;

public class PrivaditaChampOpuesto implements PrivaditaEspecial {

    @Override
    public void Crear(SpecialContext ctx) {
        Random rand = new Random();
        int blueSpecialIndex = rand.nextInt(5);
        int redSpecialIndex = blueSpecialIndex;

        int roleCount = ctx.baseRoles.size();
        for (int i = 0; i < 5; i++) {
            String base = ctx.baseRoles.get(i % roleCount);
            ctx.blueRoles.set(i, (i == blueSpecialIndex) ? base + " ❗" : base);
            ctx.redRoles.set(i, (i == redSpecialIndex) ? base + " ❗" : base);
        }
        
        ctx.event.getChannel().sendMessage("👁️ Atención: " 
                                            + ctx.blueTeam.get(blueSpecialIndex).getName() + " y " 
                                            + ctx.redTeam.get(redSpecialIndex).getName() 
                                            + " deberán elegirse el campeón mutuamente. El campeón deberá pertenecer a ese rol dentro de lo estándar (❗)").queue();
    }
}