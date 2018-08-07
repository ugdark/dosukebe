package com.kokodayo.core.model

/**
  * 空の識別子を表す値オブジェクト。
  */
class EmptyIdentifier extends Identifier[Nothing] {

  def value = throw EmptyIdentifierException()

  override def equals(obj: Any): Boolean = obj match {
    case that: EmptyIdentifier => this eq that
    case _                     => false
  }

  override def hashCode(): Int = 31 * 1

  override def toString = "EmptyIdentifier"
}

object EmptyIdentifier extends EmptyIdentifier
