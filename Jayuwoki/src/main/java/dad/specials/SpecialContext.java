package dad.specials;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import java.util.List;
import dad.database.Player;
import java.util.*;

public class SpecialContext {
    public final List<Player> allPlayers;
    public final List<String> blueRoles;
    public final List<String> redRoles;
    public final List<Player> blueTeam;
    public final List<Player> redTeam;
    public final List<String> baseRoles;
    public final MessageReceivedEvent event;
    public final Random random;
    public final float eloMultiplier;

    public SpecialContext(
        List<Player> allPlayers,
        List<String> blueRoles,
        List<String> redRoles,
        List<Player> blueTeam,
        List<Player> redTeam,
        List<String> baseRoles,
        MessageReceivedEvent event,
        Random random,
        float eloMultiplier
    ) {
        this.allPlayers = allPlayers;
        this.blueRoles = blueRoles;
        this.redRoles = redRoles;
        this.blueTeam = blueTeam;
        this.redTeam = redTeam;
        this.baseRoles = baseRoles;
        this.event = event;
        this.random = random;
        this.eloMultiplier = eloMultiplier;
    }
}
