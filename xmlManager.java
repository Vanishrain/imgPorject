package imgPorjectDataManager;


import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileOutputStream;
  
import java.io.OutputStreamWriter;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.opencv.core.Mat;

import pojo.xml;
public class xmlManager {
	/**
	 * 传入路径,解析xml文件,返回实体类对象
	 * @param path
	 * @param xmlObj
	 * @return
	 * @throws Exception
	 */
	public static xml getXmlObjectData(String path ,xml xmlObj) throws Exception{
		 SAXReader reader = new SAXReader();
	        File file = new File(path);
	        Document document = reader.read(file);
	        Element root = document.getRootElement();
	        xmlObj.setName(root.selectSingleNode("//filename").getText());
	        xmlObj.setXmax(Integer.parseInt(root.selectSingleNode("//xmax").getText()));
	        xmlObj.setYmax(Integer.parseInt(root.selectSingleNode("//ymax").getText()));
	        xmlObj.setXmin(Integer.parseInt(root.selectSingleNode("//xmin").getText()));
	        xmlObj.setYmin(Integer.parseInt(root.selectSingleNode("//ymin").getText()));
	        System.out.println(xmlObj);
			return xmlObj;
	}
	/**
	 * xml注解保存类
	 * @param filePath 源文件路径
	 * @param xmlObj  xml增强后数据
	 * @param encoding 编码
	 * @throws Exception 异常
	 */
	  public static void writeToFile( String filePath,String newpath,xml xmlObj,
	            String encoding,Mat mat,String filename) throws Exception {
		  	SAXReader reader = new SAXReader();
	        File file = new File(filePath);
	        Document document = reader.read(file);
	        Element root = document.getRootElement();
	        int height=Integer.parseInt(mat.size().toString().split("x")[0]);
	     	int weight=Integer.parseInt(mat.size().toString().split("x")[1]);
	        root.selectSingleNode("//filename").setText(filename);
	        root.selectSingleNode("//path").setText(newpath);
	        root.selectSingleNode("//width").setText(weight+"");
	        root.selectSingleNode("//height").setText(height+"");
	        											
	        root.selectSingleNode("//xmax").setText(xmlObj.getXmax()+"");
	        root.selectSingleNode("//ymax").setText(xmlObj.getYmax()+"");
	        root.selectSingleNode("//xmin").setText(xmlObj.getXmin()+"");
	        root.selectSingleNode("//ymin").setText(xmlObj.getYmin()+"");
	        try {
	            OutputFormat fmt = OutputFormat.createPrettyPrint();
	            fmt.setEncoding(encoding);

	            XMLWriter xmlWriter = new XMLWriter(new OutputStreamWriter(
	                    new FileOutputStream(newpath), encoding), fmt);
	            xmlWriter.write(document);
	            xmlWriter.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	  
	  
	  
	  
	  
	  public static void main(String[] args) throws Exception {
		  //E://cifen_data//Annotations//0000啊啊啊1.xml
		  xml xmlObj=new xml();
					  getXmlObjectData("//E://cifen_data//Annotations//00001.xml", xmlObj);
		  xmlObj.setXmax(15649);
//		  writeToFile("//E://cifen_data//Annotations//00001.xml", "//E://cifen_data//Annotations//0000啊啊啊123.xml", xmlObj, "UTF-8");
	}
}
