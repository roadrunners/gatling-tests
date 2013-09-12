package urlshortener

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Options {
  val endpoint = sys.env("GATLING_ENDPOINT")

  val createDuration = 5 minutes
  val createWait = 0 seconds
  val createUsers = 200 users
  val createRampTime = 10 seconds
  val createPauseMin = 100 milliseconds
  val createPauseMax = 300 milliseconds

  val retrieveDuration = 4 minutes
  val retrieveWait = 50 seconds
  val retrieveUsers = 300 users
  val retrieveRampTime = 10 seconds
  val retrievePauseMin = 100 milliseconds
  val retrievePauseMax = 300 milliseconds
}
