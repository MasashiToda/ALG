package alg.algebra

trait Field[F<: Field[F]] extends Ring[F] {
  def +(that: F): F
  def -(that: F): F
  def *(that: F): F
  def /(that: F): F
}

object Field {
}