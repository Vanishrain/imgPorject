package imgPorjectDataManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class fileManager {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		List<String> list2=new ArrayList<String>();

		getFiles("C://Users//86183//Desktop//ces//img", list);
		getFiles("C://Users//86183//Desktop//ces//xml", list);
for (String string : list2) {
	System.out.println(string);
}
		for (String string : list) {
			System.out.println(string);
		}
	}
	/**
	 * 边缘校验
	 */
	public static void checkFilePath(String path) {
		if (path.trim().length() == 0 || path == null) {
			throw new IllegalArgumentException("路径不合法");
		}
	}

	/**
	 * 1.递归读取获得每个文件的路径
	 * 
	 * @throws FileNotFoundException
	 */
	public static void getFiles(String path, List<String> list) {
		checkFilePath(path);
		File file = new File(path);
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory()) {
					getFiles(files[i].getPath(), list);
				} else {
					list.add(files[i].getPath());
				}
			}
		} else {
			list.add(file.getPath());
		}
	}

	/**
	 * 2.IO流读取文件,数据为字符串
	 * 
	 * @param path
	 * @throws IOException
	 */
	public static List<String> readFileFromFilePath(List<String> list)
			throws IOException {
		FileInputStream fil;
		BufferedReader bfr = null;
		StringBuffer sbf = new StringBuffer();
		List<String> stringData = new ArrayList<String>();
		for (String string : list) {
			checkFilePath(string);
			File file = new File(string);
			try {
				bfr = new BufferedReader(new java.io.FileReader(file));
				String tempStr;
				while ((tempStr = bfr.readLine()) != null) {
					sbf.append(tempStr + "\n");
				}
				bfr.close();
				stringData.add(sbf.toString());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return stringData;
	}

}
