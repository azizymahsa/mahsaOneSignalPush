package onesignal.test.com.testmahsaonesignal;

import com.onesignal.OSNotification;
import com.onesignal.OneSignal;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class NotificationHandler implements OneSignal.NotificationReceivedHandler {
    @Override
    public void notificationReceived(OSNotification notification) {
        EventBus.getDefault().post(new EventModel(notification.payload.title));

    }

}
