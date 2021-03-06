package urlshortener

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import bootstrap._

object RetrieveScenario {
  def scn(name: String = "Retrieve Short URL", duration: Duration) =
    scenario(name)
      .feed(csv("shorturls.csv").circular)
      .during(duration) {
        exec(
          http("retrieve_short_url")
            .get("/${url}")
            .check(status.is(200)))
      }
}
