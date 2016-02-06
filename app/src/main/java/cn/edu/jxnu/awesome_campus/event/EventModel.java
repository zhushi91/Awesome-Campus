package cn.edu.jxnu.awesome_campus.event;

import java.util.List;

/**
 * Created by MummyDing on 16-2-7.
 * GitHub: https://github.com/MummyDing
 * Blog: http://blog.csdn.net/mummyding
 */
public class EventModel<T> {
    private List<T> dataList;

    private int eventCode = 0;

    public EventModel(int eventCode,List<T> dataList) {
        this.dataList = dataList;
        this.eventCode = eventCode;
    }

    public EventModel(int eventCode) {
        this.eventCode = eventCode;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public int getEventCode() {
        return eventCode;
    }
}
