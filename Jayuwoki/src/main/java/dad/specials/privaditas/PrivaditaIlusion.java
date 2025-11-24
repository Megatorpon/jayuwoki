package dad.specials.privaditas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import dad.database.Player;
import dad.specials.*;

public class PrivaditaIlusion implements PrivaditaEspecial {

    @Override
    public void Crear(SpecialContext ctx) {

        // Código para crear los equipos
        List<Player> allPlayers = ctx.allPlayers;

        allPlayers.sort(Comparator.comparingInt(Player::getElo));

        ctx.blueTeam.clear();
        ctx.blueTeam.addAll(allPlayers.subList(0,5));
        Collections.shuffle(ctx.blueTeam);
        ctx.redTeam.clear();
        ctx.redTeam.addAll(allPlayers.subList(5,10));
        Collections.shuffle(ctx.redTeam);

        int roleCount = ctx.baseRoles.size();
        for (int i = 0; i < 5; i++) {
            String base = ctx.baseRoles.get(i % roleCount);
            ctx.blueRoles.set(i, base);
            ctx.redRoles.set(i, base);
        }

        ctx.event.getChannel()
            .sendMessage("☢️ BOMBA DE HIDRÓGENO VS EQUIPO ILUSIÓN 🕊️\nSi gana Ilusión, x1.7 de elo.\nSi pierde Ilusión, x0.5 de elo.")
            .queue();
    }
}