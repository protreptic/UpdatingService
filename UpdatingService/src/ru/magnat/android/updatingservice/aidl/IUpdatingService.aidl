package ru.magnat.android.updatingservice.aidl;

interface IUpdatingService {
	void update();
	void upgrade();
	void install();
	void remove();
}