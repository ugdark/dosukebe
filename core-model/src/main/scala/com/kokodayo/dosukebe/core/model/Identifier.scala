package com.kokodayo.dosukebe.core.model

/**
  * エンティティの識別子を表すトレイト。
  *
  * エンティティで用いられる識別子を型として表現することを目的としている。
  *
  * @tparam A 識別子の値を表す型
  */
trait Identifier[+A] extends Serializable {

  /**
    * 識別子の値を取得する。
    *
    * @return 識別子の値
    */
  def value: A

}
