package com.example

import org.mule.tck.junit4.FunctionalTestCase
import org.junit.Test
import org.junit.Before

class EnvIntegrationTest extends FunctionalTestCase {

  @Override
  protected String getConfigResources() {
    return 'shared-config.xml, basic-http-flow-config.xml'
  }

  @Test
  void responseIsHandled() {
    sleep(10000)
  }
}
