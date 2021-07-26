package test;
import imgPorjectDataManager.ImageUtil;
import imgPorjectDataManager.xmlManager;

import java.io.File;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import pojo.xml;


public class demo {

	static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);  //加载动态链接库
    }
	public static void main(String[] args) throws Exception {
	//	E://cifen_data//JPEGImages//1614629573(1).jpg
//		  Mat mat = Imgcodecs.imread("C://Users//86183//Desktop//ces//img//00001.jpg");
			  String fileName = "E://cifen_data//JPEGImages//00001.jpg"; //设置图片的路径
		        if (!new File(fileName).exists()){
		            System.out.println("文件不存在");
		        }else{
	 
		            Mat srcImg = Imgcodecs.imread(fileName);  //opencv读取
		            if (srcImg.empty()){
		                System.out.println("加载图片失败！");
		            }else{
//		            	  xml xmlObj=new xml();
//						  xmlManager.getXmlObjectData("//E://cifen_data//Annotations//00001.xml", xmlObj);
		        		Mat newMat= ImageUtil.oilPainting(srcImg);
//		        		System.out.println(xmlObj);
//		                Imgproc.resize(srcImg,newMat,new Size(1500,1500));
//		        		Mat newMat2= ImageUtil.transposition(srcImg, xmlObj);
//		        		System.out.println(xmlObj);

		        		System.out.println(newMat.size());
		                HighGui.imshow("image",newMat); //显示
		                HighGui.waitKey(0);
		                
//		                Mat dstImage = srcImg.clone();
		        		//保存图像
//		        		Imgcodecs.imwrite("C://Users//86183//Desktop//ces//example_write.jpg", dstImage);
		            }
		        }
	 
		
	  }
}




