package urlshortener

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Options {
  val endpoint = sys.env("GATLING_ENDPOINT")

  val createDuration = 5 minutes
  val createWait = 0 seconds
  val createUsers = 300 users
  val createRampTime = 20 seconds

  val retrieveDuration = 4 minutes
  val retrieveWait = 30 seconds
  val retrieveUsers = 600 users
  val retrieveRampTime = 30 seconds
}
