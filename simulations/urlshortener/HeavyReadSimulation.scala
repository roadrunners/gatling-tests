package urlshortener

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.Headers.Names._
import scala.concurrent.duration._

class HeavyReadSimulation extends Simulation {
  val httpProtocol = http.baseURL(Options.endpoint).disableFollowRedirect

  setUp(RetrieveScenario.scn(duration = 120 seconds).inject(nothingFor(0 seconds), ramp(10000 users) over (30 seconds)))
    .protocols(httpProtocol)
}
