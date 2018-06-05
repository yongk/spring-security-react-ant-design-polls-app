package org.springframework.security.crypto.bcrypt;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BCryptPasswordEncoderTest {

    BCryptPasswordEncoder encoder;

    @Before
    public void setUp() {
        encoder = new BCryptPasswordEncoder();
    }

    @Test
    public void testEncode() {
        String passwd = encoder.encode("admin123");
        assertThat(passwd).isNotEqualTo("$2a$10$t0/k.waL32TDVv2u29P4v.wwCw6KUD3wQMa2kK0mCqCH8UbdNaTTe");
    }

    @Test
    public void testMatches() {
        boolean match = encoder.matches("admin123", "$2a$10$t0/k.waL32TDVv2u29P4v.wwCw6KUD3wQMa2kK0mCqCH8UbdNaTTe");
        assertThat(match).isTrue();
    }
}
