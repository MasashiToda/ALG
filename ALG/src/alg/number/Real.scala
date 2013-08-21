package alg.number

import alg.algebra.Field

class Real(val value: Double) extends Number with Field[Real] {
  override def +(that: Real): Real = new Real(this.value + that.value)
  override def -(that: Real): Real = new Real(this.value - that.value)
  override def *(that: Real): Real = new Real(this.value * that.value)
  override def /(that: Real): Real = new Real(this.value / that.value)
}

