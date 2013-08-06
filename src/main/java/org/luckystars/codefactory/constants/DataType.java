package org.luckystars.codefactory.constants;

/**
 * 数据类型
 * @author xuechong
 */
public enum DataType {
	
	UNKNOWN("unknow",0x0),
	INT("int",0x1),
	STRING("str",0x2),
	BOOL("bool",0x3),
	FK("fk",0x4);
	
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
	
	/**
	 * return {@link DataType.UNKNOWN} if no such name
	 * @param name
	 * @return
	 * @author xuechong
	 */
	public static DataType findByName(String name){
		for (DataType data : DataType.values()) {
			if(data.getName().equals(name)){
				return data;
			}
		}
		return UNKNOWN;
	}
	/**
	 * return unknown if no such code 
	 * @param code
	 * @return
	 * @author xuechong
	 */
	public static DataType findByCode(int code){
		for (DataType data : DataType.values()) {
			if(data.getCode() == code){
				return data;
			}
		}
		return UNKNOWN;
	}
}
