package com.porpoise

import org.junit.runner.RunWith

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
class ScalaBeanSpec extends Spec with ShouldMatchers {

  describe("A Scala Bean") {
    it("should be able to copy itself") {
      //ScalaBean("name", 123).copy(str = "changed") should be(ScalaBean("changed", 123))
      new JavaBean("string").getName() should be("string")
    }
  }
}