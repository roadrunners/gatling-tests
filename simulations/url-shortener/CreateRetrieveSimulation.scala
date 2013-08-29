package in.roadrunners.urlshortener

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.Headers.Names._
import scala.concurrent.duration._

class CreateRetrieveSimulation extends Simulation {
  val httpProtocol = http.baseURL(Options.endpoint).disableFollowRedirect

  setUp(CreateScenario.scn.inject(nothingFor(Options.createWait), ramp(Options.createUsers) over (Options.createRampTime)),
    RetrieveScenario.scn.inject(nothingFor(Options.retrieveWait), ramp(Options.retrieveUsers) over (Options.retrieveRampTime)))
    .protocols(httpProtocol)
}
