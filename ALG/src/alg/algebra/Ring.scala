package alg.algebra

trait Ring[R<: Ring[R]] {
  def +(that: R): R
  def -(that: R): R
  def *(that: R): R
}