package com.kokodayo.dosukebe.util

import org.slf4j.{LoggerFactory, Logger => Slf4jLogger}

/**
  * 通知とloggerを共通化
  *
  * ログを吐いたり、Slackなどで通知したりできる。
  */
trait NoticeLogger {

  /**
    * SLF4Jのロガー
    *
    * ログを吐きたいだけのときは、こちらを利用する
    */
  protected val logger: Slf4jLogger = LoggerFactory.getLogger(getClass)

}
