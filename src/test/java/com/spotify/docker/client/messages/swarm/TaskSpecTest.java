package com.spotify.docker.client.messages.swarm;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.docker.client.ObjectMapperProvider;
import org.junit.Test;

public class TaskSpecTest {

  private ObjectMapper objectMapper = ObjectMapperProvider.objectMapper();

  @Test
  public void test1_32_WithoutNullables() throws Exception {
    final TaskSpec spec = objectMapper.readValue("{}", TaskSpec.class);
    assertThat(spec.containerSpec(), is(nullValue()));
    assertThat(spec.resources(), is(nullValue()));
    assertThat(spec.restartPolicy(), is(nullValue()));
    assertThat(spec.placement(), is(nullValue()));
    assertThat(spec.networks(), is(nullValue()));
    assertThat(spec.logDriver(), is(nullValue()));
  }
}