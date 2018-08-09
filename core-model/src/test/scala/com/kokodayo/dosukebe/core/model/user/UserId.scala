package com.kokodayo.dosukebe.core.model.user

import com.kokodayo.dosukebe.core.model.Identifier

trait UserId extends Identifier[Long]

object UserId {

  def apply(value: Long): UserId = UserIdImpl(value)

  def entry: UserId = EmptyUserId
}
