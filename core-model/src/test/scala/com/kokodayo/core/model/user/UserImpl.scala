package com.kokodayo.core.model.user

import java.time.LocalDate

protected[user] case class UserImpl(id: UserId,
                                    email: String,
                                    name: String,
                                    birthday: LocalDate)
    extends User
