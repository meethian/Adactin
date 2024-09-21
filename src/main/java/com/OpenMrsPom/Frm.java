package com.OpenMrsPom;

import com.helper.ConfigReaderOpenMrs;

public class Frm {
	private Frm() {
	}
	private static Frm fr;
	public static Frm	getInstancefrm(){
		if(fr==null) {
			fr=new Frm();
		}
		return fr;
	}
	public ConfigReaderOpenMrs getInstanceConfigReaderOpenMrs() {
		ConfigReaderOpenMrs cf=new ConfigReaderOpenMrs();
		return cf;
	}
	}


