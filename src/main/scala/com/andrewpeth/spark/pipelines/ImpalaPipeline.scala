package com.andrewpeth.spark.pipelines

import com.andrewpeth.spark.bean.Config
import org.apache.spark.sql.SparkSession

class ImpalaPipeline(@transient spark : SparkSession, config : Config) extends Pipeline {
  def start() : Unit = {

  }
}
