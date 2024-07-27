package com.learning.examples;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.stubbing.Scenario.STARTED;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import java.io.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public class WiremockExample {
  public static void main(String[] args) {
    WireMockServer wireMockServer = new WireMockServer(WireMockConfiguration.options().port(9898));
    wireMockServer.start();
    wireMockServer.stubFor(
        post(urlMatching("/test/"))
            .inScenario("scenarioNow")
            .whenScenarioStateIs(STARTED)
            .willReturn(aResponse().withStatus(HttpStatus.OK.value()).withBody("Hiii"))
            .willSetStateTo("Level 1"));
    wireMockServer.stubFor(
        post(urlMatching("/test/"))
            .inScenario("scenarioNow")
            .whenScenarioStateIs("Level 1")
            .willReturn(aResponse().withStatus(HttpStatus.OK.value()).withBody("byeee"))
            .willSetStateTo("Level 2"));
    wireMockServer.stubFor(
        post(urlMatching("/test/"))
            .inScenario("scenarioNow")
            .whenScenarioStateIs("Level 2")
            .willReturn(aResponse().withStatus(HttpStatus.OK.value()).withBody("again?"))
            .willSetStateTo("Level 3"));
    wireMockServer.stubFor(
        post(urlMatching("/test/"))
            .inScenario("scenarioNow")
            .whenScenarioStateIs("Level 3")
            .willReturn(aResponse().withStatus(HttpStatus.OK.value()).withBody("go away"))
            .willSetStateTo(STARTED));
    System.out.println(
        "************************************************************************************************");
    System.out.println(wireMockServer.getAllScenarios().getScenarios().get(0).getState());
  }
}
