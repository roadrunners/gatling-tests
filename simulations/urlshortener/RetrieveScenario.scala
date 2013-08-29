package urlshortener

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import bootstrap._

object RetrieveScenario {
  val scn = scenario("Retrieve Short URL")
    .feed(csv("shorturls.csv").circular)
    .during(Options.retrieveDuration) {
      exec(
        http("retrieve_short_url")
          .get("/${url}")
          .check(status.is(200)))
      .pause(Options.retrievePauseMin, Options.retrievePauseMax)
    }
}
