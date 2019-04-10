/**************************************************************************************** 
 Copyright © 2003-2012 hbasesoft Corporation. All rights reserved. Reproduction or     <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/

package com.hbasesoft.framework.message.delay.db.dao;

import org.springframework.transaction.annotation.Transactional;

import com.hbasesoft.framework.db.Dao;
import com.hbasesoft.framework.db.hibernate.IBaseDao;
import com.hbasesoft.framework.message.delay.db.entity.MsgDelaymsgEntity;

/**
 * <Description> T_MSG_DELAYMSG的Dao<br>
 * 
 * @author 工具生成<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年4月3日 <br>
 * @since V1.0<br>
 * @see com.hbasesoft.framework.db.hibernate.IBaseDao <br>
 */
@Dao
@Transactional
public interface MsgDelaymsgDao extends IBaseDao<MsgDelaymsgEntity> {
    void createTable();
}
