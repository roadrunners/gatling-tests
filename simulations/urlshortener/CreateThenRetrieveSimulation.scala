package urlshortener

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.Headers.Names._
import scala.concurrent.duration._

class CreateThenRetrieveSimulation extends Simulation {
  val httpProtocol = http.baseURL(Options.endpoint).disableFollowRedirect

  setUp(CreateScenario.scn(duration = 2 minutes).inject(nothingFor(0 seconds), ramp(600 users) over (60 seconds)),
    RetrieveScenario.scn(duration = 2 minutes).inject(nothingFor(180 seconds), ramp(600 users) over (60 seconds)))
    .protocols(httpProtocol)
}
