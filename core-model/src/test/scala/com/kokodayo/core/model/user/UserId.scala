package com.kokodayo.core.model.user

import com.kokodayo.core.model.Identifier

trait UserId extends Identifier[Long]

object UserId {

  def apply(value: Long): UserId = UserIdImpl(value)

  def entry: UserId = EmptyUserId
}
