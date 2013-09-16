package urlshortener

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.Headers.Names._
import scala.concurrent.duration._

class ProductionLoadWithSpikeSimulation extends Simulation {
  val httpProtocol = http.baseURL(Options.endpoint).disableFollowRedirect

  setUp(CreateScenario.scn(duration = 110 seconds).inject(nothingFor(0 seconds), ramp(100 users) over (10 seconds)),
    RetrieveScenario.scn(duration = 110 seconds).inject(nothingFor(0 seconds), ramp(600 users) over (10 seconds)),
    CreateScenario.scn(name = "Spike Creation of URLs", duration = 30 seconds).inject(nothingFor(30 seconds), ramp(400 users) over (10 seconds)))
    .protocols(httpProtocol)
}
