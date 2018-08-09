package com.kokodayo.dosukebe.core.model.user

import java.time.LocalDate

import com.kokodayo.dosukebe.core.model.Entity

/**
  * ユーザー
  */
trait User extends Entity[UserId] {

  /**
    * email
    */
  val email: String

  /**
    * 名前
    */
  val name: String

  /**
    * 誕生日に変更
    */
  val birthday: LocalDate

}

object User {

  def apply(id: UserId,
            email: String,
            name: String,
            birthday: LocalDate): User = {
    UserImpl(
      id,
      email,
      name,
      birthday
    )
  }
}
