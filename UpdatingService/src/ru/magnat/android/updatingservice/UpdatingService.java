package ru.magnat.android.updatingservice;

import ru.magnat.android.updatingservice.aidl.IUpdatingService;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class UpdatingService extends Service {

	public static final String TAG = "UpdatingService";
	
	public static class StartUpReceiver extends BroadcastReceiver {

		@Override
		public void onReceive(Context context, Intent intent) {
			Log.d(TAG, "UpdatingService has been started on boot completed");
		}
		
	}
	
	private IUpdatingService.Stub mBinder = new IUpdatingService.Stub() {

		@Override
		public void update() throws RemoteException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void upgrade() throws RemoteException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void install() throws RemoteException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void remove() throws RemoteException {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	@Override
	public IBinder onBind(Intent intent) {
		return mBinder.asBinder();
	}

}
