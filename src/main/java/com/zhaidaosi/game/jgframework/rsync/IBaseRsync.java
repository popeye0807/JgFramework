package com.zhaidaosi.game.jgframework.rsync;

import com.zhaidaosi.game.jgframework.common.sdm.IBaseModel;

import java.util.Map;

public interface IBaseRsync {

    public void addRsync(Integer id, IBaseModel obj);

    public void runRsync();

    public void setRsyncMap(Map<Integer, IBaseModel> map);

    public void clearRsyncMap();

    public Map<Integer, IBaseModel> getNeedRsync();

    public IBaseModel get(Integer id);

    public void clearNeedRsync();

    public boolean isRunning();

    public void toRunning();

    public void toStop();

}
