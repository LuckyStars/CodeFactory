package org.luckystars.codefactory.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

public class JsonUtil {
	
	private static final Gson gson = new Gson();
	
	public static Collection<?> getObjList(Type type,String filePath){
		return gson.fromJson(loadFile(filePath), type);
	}
	/**
	 * get String from json file
	 * @param filePath
	 * @return
	 * @author xuechong
	 */
	private static String loadFile(String filePath){
		try {
			return FileUtils.readFileToString(
					new File(
							Thread.currentThread().getContextClassLoader().
							getResource(filePath).toURI()));
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return "";
		}
	}
}
