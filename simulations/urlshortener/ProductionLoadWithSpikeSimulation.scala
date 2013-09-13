package urlshortener

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.Headers.Names._
import scala.concurrent.duration._

class ProductionLoadWithSpikeSimulation extends Simulation {
  val httpProtocol = http.baseURL(Options.endpoint).disableFollowRedirect

  setUp(CreateScenario.scn(5 minutes).inject(nothingFor(0 seconds), ramp(100 users) over (30 seconds)),
    RetrieveScenario.scn(5 minutes).inject(nothingFor(0 seconds), ramp(1200 users) over (30 seconds)),
    CreateScenario.scn(60 seconds).inject(nothingFor(2 minutes), ramp(1000 users) over (15 seconds)))
    .protocols(httpProtocol)
}
