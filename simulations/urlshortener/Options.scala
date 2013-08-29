package urlshortener

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Options {
  val endpoint = sys.env("GATLING_ENDPOINT")

  val createDuration = 8 minutes
  val createWait = 0 seconds
  val createUsers = 20 users
  val createRampTime = 10 seconds
  val createPauseMin = 100 milliseconds
  val createPauseMax = 300 milliseconds

  val retrieveDuration = 5 minutes
  val retrieveWait = 60 seconds
  val retrieveUsers = 80 users
  val retrieveRampTime = 20 seconds
  val retrievePauseMin = 100 milliseconds
  val retrievePauseMax = 300 milliseconds
}
