package imgPorjectDataManager;

import java.io.File;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import pojo.xml;

public class imageManager {
	static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);  //加载动态链接库
    }
	/**
	 * 	工厂模式
	 * 	输入指定操作,输出目标图片
	 * @param mat 原图像
	 * @param xmlObj 注解数据
	 * @param size 增强扩大倍数
	 * @return
	 * @throws Exception 
	 */
	public Mat imagerManagerMaker(Mat mat,xml xmlObj,String newImagPath,String xmlPath,String newXmlPath,String xmlFileName) throws Exception{
		xmlManager.getXmlObjectData(xmlPath, xmlObj);
		Mat newmat1=ImageUtil.mirrorImageMaker(mat, xmlObj);
		imagerManagerSave(newmat1, newImagPath);
		xmlManager.writeToFile(xmlPath, newXmlPath, xmlObj, "UTF-8", newmat1, xmlFileName);
		return newmat1;
	} 
	/**
	 * 缩放
	 * @param mat
	 * @param xmlObj
	 * @param newImagPath
	 * @param xmlPath
	 * @param newXmlPath
	 * @param xmlFileName
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public Mat imagerManagerMaker2(Mat mat,xml xmlObj,String newImagPath,String xmlPath,String newXmlPath,String xmlFileName,double size) throws Exception{
		xmlManager.getXmlObjectData(xmlPath, xmlObj);
		Mat newmat1=ImageUtil.imageResize(mat, size, xmlObj);
		imagerManagerSave(newmat1, newImagPath);
		xmlManager.writeToFile(xmlPath, newXmlPath, xmlObj, "UTF-8", newmat1, xmlFileName);
		return newmat1;
	} 
	
	/**
	 * 矩阵转置
	 * @param mat
	 * @param xmlObj
	 * @param newImagPath
	 * @param xmlPath
	 * @param newXmlPath
	 * @param xmlFileName
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public Mat imagerManagerMaker3(Mat mat,xml xmlObj,String newImagPath,String xmlPath,String newXmlPath,String xmlFileName) throws Exception{
		xmlManager.getXmlObjectData(xmlPath, xmlObj);
		Mat newmat1=ImageUtil.transposition(mat, xmlObj);
		imagerManagerSave(newmat1, newImagPath);
		xmlManager.writeToFile(xmlPath, newXmlPath, xmlObj, "UTF-8", newmat1, xmlFileName);
		return newmat1;
	} 
	/**
	 * 前三种组合形式
	 * @param mat
	 * @param xmlObj
	 * @param newImagPath
	 * @param xmlPath
	 * @param newXmlPath
	 * @param xmlFileName
	 * @param size
	 * @return
	 * @throws Exception
	 */
	public Mat imagerManagerMaker4(Mat mat,xml xmlObj,String newImagPath,String xmlPath,String newXmlPath,String xmlFileName,double size) throws Exception{
		xmlManager.getXmlObjectData(xmlPath, xmlObj);
		Mat newmat1=ImageUtil.transposition(mat, xmlObj);
		Mat newmat2=ImageUtil.mirrorImageMaker(newmat1, xmlObj);
		Mat newmat3=ImageUtil.imageResize(newmat2, size, xmlObj);

		imagerManagerSave(newmat3, newImagPath);
		xmlManager.writeToFile(xmlPath, newXmlPath, xmlObj, "UTF-8", newmat3, xmlFileName);
		return newmat1;
	} 
	/**
	 * 饱和度调节
	 * @param mat
	 * @param xmlObj
	 * @param newImagPath
	 * @param xmlPath
	 * @param newXmlPath
	 * @param xmlFileName
	 * @return
	 * @throws Exception
	 */
	public Mat imagerManagerMaker5(Mat mat,xml xmlObj,String newImagPath,String xmlPath,String newXmlPath,String xmlFileName,int val) throws Exception{
		xmlManager.getXmlObjectData(xmlPath, xmlObj);
		Mat newmat1=ImageUtil.shiftSaturability(mat, val);
		imagerManagerSave(newmat1, newImagPath);
		xmlManager.writeToFile(xmlPath, newXmlPath, xmlObj, "UTF-8", newmat1, xmlFileName);
		return newmat1;
	} 
	
	public Mat imagerManagerMaker6(Mat mat,xml xmlObj,String newImagPath,String xmlPath,String newXmlPath,String xmlFileName) throws Exception{
		xmlManager.getXmlObjectData(xmlPath, xmlObj);
		Mat newmat1=ImageUtil.oilPainting(mat);
		imagerManagerSave(newmat1, newImagPath);
		xmlManager.writeToFile(xmlPath, newXmlPath, xmlObj, "UTF-8", newmat1, xmlFileName);
		return newmat1;
	} 
	/**
	 * 图像保存类
	 * @param mat
	 * @param path
	 * @param fileName
	 */
	private void imagerManagerSave(Mat mat,String path){
		 Mat dstImage = mat.clone();
 		//保存图像
 		Imgcodecs.imwrite(path, dstImage);
	}
}
