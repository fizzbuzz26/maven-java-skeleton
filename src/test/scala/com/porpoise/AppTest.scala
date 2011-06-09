package com.porpoise;

import org.junit.runner.RunWith

// you can rename imports -- no more clashes with java.util.Date and java.sql.Date!
import scala.xml.{ Node => XmlNode }

import org.scalatest.Spec
import org.scalatest.FunSuite
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner
import org.scalatest.FeatureSpec
import org.scalatest.matchers.ShouldMatchers

/**
 * Spec tests look like this
 */
@RunWith(classOf[JUnitRunner])
class AppTest extends Spec with ShouldMatchers {

  describe("A Rational Number") {
    it("should be able to be added together") {
      Rational(1, 2) + Rational(3, 4) should be(Rational(5, 4))
    }
    it("should be able to be converted from a string") {
      import Rational._
      "2/1".inverse + Rational(3, 4) should be(Rational(5, 4))
    }
    it("should be able to be added to an integer") {
      import Rational._
      4 + Rational(1, 2) should be(Rational(9, 2))
    }
    it("should support having an integer added to it") {
      Rational(1, 2) + 4 should be(Rational(9, 2))
    }
  }
}