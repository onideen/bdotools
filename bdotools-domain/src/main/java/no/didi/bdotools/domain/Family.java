package no.didi.bdotools.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/**
 * @author Vegar Engen
 */

@Builder
@Getter
@ToString
public class Family {

    @NonNull
    private String discordId;

    @NonNull
    private String name;
}
