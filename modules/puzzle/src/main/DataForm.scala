package lila.puzzle

import play.api.data._
import play.api.data.Forms._

object DataForm {

  val difficulty = Form(single(
    "difficulty" -> number(min = 1, max = 3)
  ))

  val round = Form(mapping(
    "win" -> number
  )(RoundData.apply)(RoundData.unapply))

  case class RoundData(win: Int) extends AnyVal {

    def isWin = win == 1
  }

  val vote = Form(single(
    "vote" -> number
  ))
}
