package nl.flotsam.lzw.io

import scala.collection.generic._
case class GrowingAppendable[T](growable: Growable[T]) extends Appendable[T] {
  def append(value: T) {
    growable += value
  }
}