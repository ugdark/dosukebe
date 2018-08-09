package com.kokodayo.dosukebe.core.model

/**
  *
  * https://github.com/sisioh/scala-dddbase/ のパクり
  * ただ用途が理解できてない物などは削除してる。
  */
/**
  * エンティティを表すトレイト。
  *
  * @tparam ID 識別子の型
  */
trait Entity[ID <: Identifier[_]] {

  /** エンティティの識別子。 */
  val id: ID

  /**
    * ハッシュコードを返す。
    *
    * @return ハッシュコード
    */
  override final def hashCode: Int = 31 * id.##

  /**
    * 指定されたオブジェクトと等価であるかを判定する。
    *
    * @param that オブジェクト
    * @return 等価である場合はtrue
    */
  override final def equals(that: Any): Boolean = that match {
    case that: Entity[_] => id == that.id
    case _               => false
  }

}
