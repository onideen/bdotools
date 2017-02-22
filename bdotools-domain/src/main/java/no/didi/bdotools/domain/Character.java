package no.didi.bdotools.domain;

import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

import java.util.List;

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

    @NonNull
    private BDOClass bdoClass;

    @NonNull
    private List<BDOStat> bdoStats;

}
