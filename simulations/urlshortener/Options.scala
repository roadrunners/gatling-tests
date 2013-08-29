package urlshortener

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Options {
  val endpoint = sys.env("GATLING_ENDPOINT")

  val createDuration = sys.env("GATLING_CREATE_DURATION").toInt minutes
  val createWait = sys.env("GATLING_CREATE_WAIT").toInt seconds
  val createUsers = sys.env.contains("GATLING_CREATE_USERS").toInt users
  val createRampTime = sys.env("GATLING_CREATE_RAMPTIME").toInt seconds
  val createPauseMin = 100 milliseconds
  val createPauseMax = 300 milliseconds

  val retrieveDuration = sys.env("GATLING_RETRIEVE_DURATION").toInt minutes
  val retrieveWait = sys.env("GATLING_RETRIEVE_WAIT").toInt seconds
  val retrieveUsers = sys.env("GATLING_RETRIEVE_USERS").toInt users
  val retrieveRampTime = sys.env("GATLING_RETRIEVE_RAMPTIME").toInt seconds
  val retrievePauseMin = 100 milliseconds
  val retrievePauseMax = 300 milliseconds
}
