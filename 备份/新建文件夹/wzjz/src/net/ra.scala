import org.apache.spark.SparkConf

import org.apache.spark.SparkContext
import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.{DataFrame, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.mllib.linalg.{Vector, Vectors}
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.regression.LinearRegression
import org.apache.spark.api.java.JavaRDD
import scala.collection.mutable.ArrayBuffer

import java.util.{Date, Locale}
import java.text.SimpleDateFormat
import java.lang.NumberFormatException
import org.apache.spark.ml.clustering.KMeans
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.Row
import org.apache.spark.sql.types.{StructType,StructField,StringType}
import org.apache.spark.sql.SparkSession
import java.io.FileWriter
import scala.io.Source
object ra {

  def main(args: Array[String]) {

    Logger.getLogger("org.apache.spark").setLevel(Level.ERROR)
    Logger.getLogger("org.eclipse.jetty.server").setLevel(Level.OFF)
    val sparkConf = new SparkConf().setAppName("sji").setMaster("local[2]")
    sparkConf.set("spark.testing.memory", "2147480000")
    val sc = new SparkContext(sparkConf)
    val current_dianpu="wzj"
    val out_fli11 = new FileWriter("/home/hadoop/Documents/"+current_dianpu+"_rudian_hour", true)
//    val mac="38:2d:e8:a6:12:5c"
//    val macc=mac.split(":")
//    val maccc=macc(0)+"-"+macc(1)+"-"+macc(2)
//    var pingpai:String=null
//    val ta=sc.textFile("/home/hadoop/Documents/mac_phone_api.txt")
//    val num=ta.count()
//    val list=ta.take(num.toInt)
//
//    for(i<-list){
//      val m=i.indexOf(maccc.toUpperCase)
//      if(m != -1)
//        pingpai=i
//    }
//    if(pingpai!=null){
//     val pinpai=pingpai.toLowerCase
//      if(pinpai.indexOf("apple")!= -1)
//        printf("Apple")
//      else if(pinpai.indexOf("huawei")!= -1)
//        printf("Huawei")
//      else if(pinpai.indexOf("microsoft")!= -1)
//        printf("Microsoft")
//      else if(pinpai.indexOf("htc")!= -1)
//        printf("HTC")
//      else if(pinpai.indexOf("tcl")!= -1)
//        printf("TCL")
//      else if(pinpai.indexOf("google")!= -1)
//        printf("Google")
//      else if(pinpai.indexOf("qiku")!= -1)
//        printf("360")
//      else if(pinpai.indexOf("qiku")!= -1)
//        printf("360Qiku")
//      else if(pinpai.indexOf("zte")!= -1)
//        printf("zhongxing")
//      else if(pinpai.indexOf("lg")!= -1)
//        printf("LG")
//      else if(pinpai.indexOf("sony")!= -1)
//        printf("Sony")
//      else if(pinpai.indexOf("nokia")!= -1)
//        printf("nokia")
//      else if(pinpai.indexOf("xiaomi")!= -1)
//        printf("xiaomi")
//      else if(pinpai.indexOf("lenovo")!= -1)
//        printf("Lenovo")
//      else if(pinpai.indexOf("samsung")!= -1)
//        printf("SAMSUNG")
//      else if(pinpai.indexOf("wingtech")!= -1||pinpai.indexOf("meizu")!= -1)
//        printf("meizu")
//      else if(pinpai.indexOf("oppo")!= -1)
//        printf("OPPO")
//      else if(pinpai.indexOf("vivo")!= -1)
//        printf("vivo")
//
//    }
  }
}