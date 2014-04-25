package ru.magnat.android.service.update;

import ru.magnat.android.service.update.aidl.IUpdatingService;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class UpdatingService extends Service {

	public static String TAG = "UpdatingService";
	
	public static class StartUpReceiver extends BroadcastReceiver {

		@Override
		public void onReceive(Context context, Intent intent) {
			Log.d(TAG, "UpdatingService has been started on boot completed");
		}
		
	}
	
	private IUpdatingService.Stub mBinder = new IUpdatingService.Stub() {

		@Override
		public String echo(String message) throws RemoteException {
			return message;
		}
		
	};
	
	@Override
	public IBinder onBind(Intent intent) {
		return mBinder.asBinder();
	}

}
