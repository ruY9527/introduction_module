package com.iyang

import akka.actor.typed.ActorSystem


/**
 * @author : luohong
 * @since : 2021/5/26 / 下午8:59
 * @desc : 
 */
object IotApp {

  def main(args: Array[String]): Unit = {

    ActorSystem[Nothing](IotSupervisor(),"iot-system")

  }

}
