package no.didi.bdotools.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Vegar Engen
 */
class FamilyTest {

    public static final String FAMILY_NAME = "Carrotpouch";

    @Test
    public void testTrue() {
        assertTrue(true);
    }

    @Test
    public void FamilyContainsFamilyName() {
        Family family = Family.builder()
                .name(FAMILY_NAME)
                .build();

        assertEquals(FAMILY_NAME, family.getName());
    }
}