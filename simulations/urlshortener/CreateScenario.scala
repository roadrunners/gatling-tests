package urlshortener

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import bootstrap._

object CreateScenario {
  def scn(name: String = "Create Short URL", duration: Duration) =
    scenario(name)
      .feed(csv("urls.csv").circular)
      .during(duration) {
        exec(
          http("create_short_url")
            .post("/")
            .param("url", "${url}")
            .check(status.is(201)))
      }
}
