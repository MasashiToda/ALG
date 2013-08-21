package alg.number

import alg.algebra.Ring

class Integer(val value: Long) extends Number with Ring[Integer] {
  override def +(that: Integer): Integer = new Integer(this.value + that.value)
  override def -(that: Integer): Integer = new Integer(this.value - that.value)
  override def *(that: Integer): Integer = new Integer(this.value * that.value)
}