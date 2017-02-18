package no.didi.bdotools.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author Vegar Engen
 */

@Builder
@Getter
public class Family {

    @NonNull
    private String name;

}
