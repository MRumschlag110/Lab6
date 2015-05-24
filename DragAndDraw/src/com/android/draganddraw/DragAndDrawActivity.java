package com.android.draganddraw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;


public class DragAndDrawActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {
		return new DragAndDrawFragment();
	}
	}
