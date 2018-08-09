package com.kokodayo.dosukebe.core.model

import java.time.LocalDate

import com.kokodayo.dosukebe.core.model.user.{EmptyUserId, User, UserId}
import org.scalatest.FreeSpec

class EntitySpec extends FreeSpec {

  "User" - {
    "未エントリー" in {
      val user = User(UserId.entry,
                      "test@example.com",
                      "yamada",
                      LocalDate.of(2013, 12, 31))
      assert(user.id === EmptyUserId)
      assert(user.name === "yamada")
    }
    "採番済みのエントリー" in {
      val user = User(UserId(1),
                      "test@example.com",
                      "yamada",
                      LocalDate.of(2013, 12, 31))
      assert(user.id === UserId(1))
      assert(user.name === "yamada")
    }

  }
}
