package no.didi.bdotools.domain;

import com.sun.istack.internal.NotNull;
import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

/**
 * This object represent an ingame character with name, class, power and stats update
 *
 * @author Vegar Engen
 */

@Builder
@ToString
public class Character {

    @NonNull
    private String name;

    @NotNull
    private CharacterClass characterClass;

}
