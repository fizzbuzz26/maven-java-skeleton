package com.porpoise
import java.util._
case class ScalaBean(str : String, num : Int, date : Date = new Date()) {
	
	def asJavaBean = new JavaBean(str)
}
object App {
	def main(args : Array[String]) = {
		println(ScalaBean("scala bean as java bean", 1).asJavaBean.getName)
	}
}
