package ru.magnat.android.service.update;

import ru.magnat.android.service.update.aidl.IUpdatingService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class UpdatingService extends Service {

	private IUpdatingService.Stub mBinder = new IUpdatingService.Stub() {
		
	};
	
	@Override
	public IBinder onBind(Intent arg0) {
		return mBinder.asBinder();
	}

}
