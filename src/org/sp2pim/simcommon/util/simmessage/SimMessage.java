package org.sp2pim.simcommon.util.simmessage;

import java.util.UUID;

public class SimMessage {
	   /**
	    * SimMessage的类型
	    * 在SimMethodType.java中有详细内容
	    * SimMethodType是一种枚举类型
	    * 
	    * */
       private SimMethodType  _SimMethod;
       /**
        * 标识Message的标签
        * 每一对request和response都有唯一的ID来标识
        * 主要目的是可以方便的标识一对应答，并且在日志文件中方便查找
        * */
       private String _MessageId=UUID.randomUUID().toString();;
       
       
}
