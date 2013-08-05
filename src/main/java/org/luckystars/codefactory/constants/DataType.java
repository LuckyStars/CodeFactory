package org.luckystars.codefactory.constants;

/**
 * 数据类型
 * @author xuechong
 *
 */
public enum DataType {
	
	INT("int",0x1),
	STRING("str",0x2),
	BOOL("bool",0x3);
	
	private final String name;
	private final int code;
	
	DataType(String name,int code){
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}
	public int getCode() {
		return code;
	}
	
	public static DataType findByName(String name){
		for (DataType data : DataType.values()) {
			if(data.getName().equals(name)){
				return data;
			}
		}
		return null;
	}
	
	public static DataType findByCode(int code){
		for (DataType data : DataType.values()) {
			if(data.getCode() == code){
				return data;
			}
		}
		return null;
	}
}
