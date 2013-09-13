package urlshortener

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Options {
  val endpoint = sys.env("GATLING_ENDPOINT")

  val createDuration = 2 minutes
  val createWait = 0 seconds
  val createUsers = 600 users
  val createRampTime = 60 seconds

  val retrieveDuration = 2 minutes
  val retrieveWait = 3 minutes
  val retrieveUsers = 600 users
  val retrieveRampTime = 60 seconds
}
