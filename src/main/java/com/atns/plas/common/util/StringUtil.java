package com.atns.plas.common.util;

import org.springframework.util.StringUtils;

public class StringUtil extends StringUtils{
	
	public static boolean isNull(String str) {

		if (str != null) {
			str = str.trim();
		}

		return (str == null || "".equals(str));
	}
	
    /**
     * isNullObject
     *
     * @param input
     * @param format
     * @return
     *  true    : 값이 Null이면 
     *  false   : 값이 Null이 아니면
     */
    public static boolean isNullObject(Object obj) {
        if(null == obj || "".equals(obj)){
            return true;
        }
        return false;
    }
    
    /**
     * isNotNullObject
     *
     * @param input
     * @param format
     * @return
     *  true    : 값이 Null이 아니면 
     *  false   : 값이 Null이면
     */
    public static boolean isNotNullObject(Object obj) {
        if(null == obj || "".equals(obj)){
            return false;
        }
        return true;
    }
    
    /**
     * checkNull
     *
     * @param input
     * @param format
     * @return
     *  empty   : 값이 null이면 '' 값 리턴 
     *  input   : 
     */
    public static String checkNullValue(String str){
		if(str == null)
			return "";
		else
			return str.trim();
	}
    
    /**
     * checkNull
     *
     * @param input
     * @param format
     * @return
     *  empty   : 값이 null이면 '' 값 리턴 
     *  input   : 
     */
    public static String getValidTextFromHtml(String val){
		
    	if (val != null && !"".equals(val)) {
			val = StringUtils.replace(val, "&",  "&amp;");
			val = StringUtils.replace(val, "#",  "&#35;");
			
			val = StringUtils.replace(val, "<",  "&lt;");
			val = StringUtils.replace(val, ">",  "&gt;");
			val = StringUtils.replace(val, "\"", "&quot;");
			val = StringUtils.replace(val, "\'", "&#39;");
			val = StringUtils.replace(val, "(",  "&#40;");
			val = StringUtils.replace(val, ")",  "&#41;");
			val = StringUtils.replace(val, "%",  "&#37;");
			val = StringUtils.replace(val, "+",  "&#43;");
			val = StringUtils.replace(val, "-",  "&#45;");
		}
		
		return val;
	}
    
	public static boolean isNumeric(String str) {
		if (str == null) {
			return false;
		}
		int sz = str.length();
		if (sz == 0)
			return false;
		for (int i = 0; i < sz; i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static String lPad(String str, int len, char pad) {
		return lPad(str, len, pad, false);
	}

	public static String lPad(String str, int len, char pad, boolean isTrim) {

		if (isNull(str)) {
			return null;
		}

		if (isTrim) {
			str = str.trim();
		}

		for (int i = str.length(); i < len; i++) {
			str = pad + str;
		}

		return str;
	}

	public static String rPad(String str, int len, char pad) {
		return rPad(str, len, pad, false);
	}

	public static String rPad(String str, int len, char pad, boolean isTrim) {

		if (isNull(str)) {
			return null;
		}

		if (isTrim) {
			str = str.trim();
		}

		for (int i = str.length(); i < len; i++) {
			str = str + pad;
		}

		return str;
	}


}
