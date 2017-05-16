package com.jd.appstore.gateway.manager;

import com.jd.appstore.gateway.domain.dao.parameter.ActivityParameter;
import com.jd.appstore.gateway.domain.obj.ActivityObj;
import com.jd.appstore.gateway.domain.response.ActivityRes;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: YUNFENG
 * Date: 13-6-9
 * Time: 下午4:39
 * To change this template use File | Settings | File Templates.
 */
public interface ActivityManager {
    /**
     * 获得活动详情
     *
     * @param activityParameter
     * @return
     */
    List<ActivityObj> getActivityDetails(ActivityParameter activityParameter);
}
