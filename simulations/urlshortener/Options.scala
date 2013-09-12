package urlshortener

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Options {
  val endpoint = sys.env("GATLING_ENDPOINT")

  val createDuration = 1 minutes
  val createWait = 0 seconds
  val createUsers = 100 users
  val createRampTime = 30 seconds
  val createPauseMin = 100 milliseconds
  val createPauseMax = 300 milliseconds

  val retrieveDuration = 1 minutes
  val retrieveWait = 60 seconds
  val retrieveUsers = 100 users
  val retrieveRampTime = 30 seconds
  val retrievePauseMin = 100 milliseconds
  val retrievePauseMax = 300 milliseconds
}
