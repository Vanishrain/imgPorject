package imgPorjectDataManager;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import pojo.xml;

public class manager {
	/**
	 * 获取文件路径
	 * @param path
	 * @return
	 */
	public static List<String> getFilePathCollection(String path){
		List<String> list=new ArrayList<String>();
		fileManager.getFiles(path, list);
		return list;
	}
	public static void start(){
		String path="C://Users//86183//Desktop//ces//img";
		List<String> list=getFilePathCollection(path);
		int i=0;
		for (String string : list) {
			String filename="C:/Users/86183/Desktop/ces/xml"+string.split("img")[1].replace("\\", "/").replace(".jpg", ".xml");
			//xml文件中注解的文件名称
			String filenameString=System.currentTimeMillis()+""+i+"";
			String newImagePathString="E://cifen_data//img_aug//"+filenameString+".jpg";
			String newXmlPathString="E://cifen_data//xlm_aug//"+filenameString+".xml";

			imageManager objImageManager=new imageManager();
		        if (!new File(string).exists()){
		            System.out.println("文件不存在");
		        }else{

		            Mat srcImg = Imgcodecs.imread(string);  //opencv读取
		            if (srcImg.empty()){
		                System.out.println("加载图片失败！");
		            }else{
		            	  xml xmlObj=new xml();
						  try {
							xmlManager.getXmlObjectData(filename, xmlObj);
							objImageManager.imagerManagerMaker(srcImg, xmlObj, newImagePathString,filename ,newXmlPathString, filenameString);
						} catch (Exception e) {
							e.printStackTrace();
						}
		            	}
		            }
		
			
			
			
			System.out.println(filenameString);
			System.out.println(filename);
			i++;
		}
		
	}
	/**
	 * 缩放
	 */
	public static void start2(double size){
		String path="C://Users//86183//Desktop//ces//img";
		List<String> list=getFilePathCollection(path);
		int i=0;
		for (String string : list) {

				String filename="C:/Users/86183/Desktop/ces/xml"+string.split("img")[1].replace("\\", "/").replace(".jpg", ".xml");
				//xml文件中注解的文件名称
				String filenameString=System.currentTimeMillis()+""+i+"";
				String newImagePathString="E://cifen_data//img_aug//"+filenameString+".jpg";
				String newXmlPathString="E://cifen_data//xlm_aug//"+filenameString+".xml";

				imageManager objImageManager=new imageManager();
			        if (!new File(string).exists()){
			            System.out.println("文件不存在");
			        }else{

			            Mat srcImg = Imgcodecs.imread(string);  //opencv读取
			            if (srcImg.empty()){
			                System.out.println("加载图片失败！");
			            }else{
			            	  xml xmlObj=new xml();
							  try {
								xmlManager.getXmlObjectData(filename, xmlObj);
								objImageManager.imagerManagerMaker2(srcImg, xmlObj, newImagePathString,filename ,newXmlPathString, filenameString, size);
							} catch (Exception e) {
								e.printStackTrace();
							}
			            	}
			            }
			
				
				
				
				System.out.println(filenameString);
				System.out.println(filename);
				i++;
			
			
		}
		
		
		
		
	}
	
	/**
	 * 转置
	 */
	public static void start3(){
		String path="C://Users//86183//Desktop//ces//img";
		List<String> list=getFilePathCollection(path);
		int i=0;
		for (String string : list) {
			String filename="C:/Users/86183/Desktop/ces/xml"+string.split("img")[1].replace("\\", "/").replace(".jpg", ".xml");
			//xml文件中注解的文件名称
			String filenameString=System.currentTimeMillis()+""+i+"";
			String newImagePathString="E://cifen_data//img_aug//"+filenameString+".jpg";
			String newXmlPathString="E://cifen_data//xlm_aug//"+filenameString+".xml";

			imageManager objImageManager=new imageManager();
		        if (!new File(string).exists()){
		            System.out.println("文件不存在");
		        }else{

		            Mat srcImg = Imgcodecs.imread(string);  //opencv读取
		            if (srcImg.empty()){
		                System.out.println("加载图片失败！");
		            }else{
		            	  xml xmlObj=new xml();
						  try {
							xmlManager.getXmlObjectData(filename, xmlObj);
							objImageManager.imagerManagerMaker3(srcImg, xmlObj, newImagePathString,filename ,newXmlPathString, filenameString);
						} catch (Exception e) {
							e.printStackTrace();
						}
		            	}
		            }
		
			
			
			
			System.out.println(filenameString);
			System.out.println(filename);
			i++;
		}
		
	}
	
	/**
	 * 组合形式
	 * @param size
	 */
	public static void start4(double size){
		String path="C://Users//86183//Desktop//ces//img";
		List<String> list=getFilePathCollection(path);
		int i=0;
		for (String string : list) {

				String filename="C:/Users/86183/Desktop/ces/xml"+string.split("img")[1].replace("\\", "/").replace(".jpg", ".xml");
				//xml文件中注解的文件名称
				String filenameString=System.currentTimeMillis()+""+i+"";
				String newImagePathString="E://cifen_data//img_aug//"+filenameString+".jpg";
				String newXmlPathString="E://cifen_data//xlm_aug//"+filenameString+".xml";

				imageManager objImageManager=new imageManager();
			        if (!new File(string).exists()){
			            System.out.println("文件不存在");
			        }else{

			            Mat srcImg = Imgcodecs.imread(string);  //opencv读取
			            if (srcImg.empty()){
			                System.out.println("加载图片失败！");
			            }else{
			            	  xml xmlObj=new xml();
							  try {
								xmlManager.getXmlObjectData(filename, xmlObj);
								objImageManager.imagerManagerMaker4(srcImg, xmlObj, newImagePathString,filename ,newXmlPathString, filenameString, size);
							} catch (Exception e) {
								e.printStackTrace();
							}
			            	}
			            }
				System.out.println(filenameString);
				System.out.println(filename);
				i++;
		}
		
		
		
		
	}
	/**
	 * 饱和度
	 * @param size
	 */
	public static void start5(int size){
		String path="C://Users//86183//Desktop//ces//img";
		List<String> list=getFilePathCollection(path);
		int i=0;
		for (String string : list) {

				String filename="C:/Users/86183/Desktop/ces/xml"+string.split("img")[1].replace("\\", "/").replace(".jpg", ".xml");
				//xml文件中注解的文件名称
				String filenameString=System.currentTimeMillis()+""+i+"";
				String newImagePathString="E://cifen_data//img_aug//"+filenameString+".jpg";
				String newXmlPathString="E://cifen_data//xlm_aug//"+filenameString+".xml";

				imageManager objImageManager=new imageManager();
			        if (!new File(string).exists()){
			            System.out.println("文件不存在");
			        }else{

			            Mat srcImg = Imgcodecs.imread(string);  //opencv读取
			            if (srcImg.empty()){
			                System.out.println("加载图片失败！");
			            }else{
			            	  xml xmlObj=new xml();
							  try {
								xmlManager.getXmlObjectData(filename, xmlObj);
								objImageManager.imagerManagerMaker5(srcImg, xmlObj, newImagePathString,filename ,newXmlPathString, filenameString, size);
							} catch (Exception e) {
								e.printStackTrace();
							}
			            	}
			            }
				System.out.println(filenameString);
				System.out.println(filename);
				i++;
		}
		
		
		
		
	}
	/**
	 * 油画
	 * @param size
	 */
	public static void start6(){
		String path="C://Users//86183//Desktop//ces//img";
		List<String> list=getFilePathCollection(path);
		int i=0;
		for (String string : list) {

				String filename="C:/Users/86183/Desktop/ces/xml"+string.split("img")[1].replace("\\", "/").replace(".jpg", ".xml");
				//xml文件中注解的文件名称
				String filenameString=System.currentTimeMillis()+""+i+"";
				String newImagePathString="E://cifen_data//img_aug//"+filenameString+".jpg";
				String newXmlPathString="E://cifen_data//xlm_aug//"+filenameString+".xml";

				imageManager objImageManager=new imageManager();
			        if (!new File(string).exists()){
			            System.out.println("文件不存在");
			        }else{

			            Mat srcImg = Imgcodecs.imread(string);  //opencv读取
			            if (srcImg.empty()){
			                System.out.println("加载图片失败！");
			            }else{
			            	  xml xmlObj=new xml();
							  try {
								xmlManager.getXmlObjectData(filename, xmlObj);
								objImageManager.imagerManagerMaker6(srcImg, xmlObj, newImagePathString,filename ,newXmlPathString, filenameString);
							} catch (Exception e) {
								e.printStackTrace();
							}
			            	}
			            }
				System.out.println(filenameString);
				System.out.println(filename);
				i++;
		}
		
		
		
		
	}
	public static void main(String[] args) {
//		start();
//		start2(0.5);
//		start3();
//		start4(0.5);
		for (int i = 0; i <= 255; i=i+50) {
			start5(i);
		}
//		start6();
	}
}
