package com.Zxing.Demo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;

import com.Zxing.Demo.view.ViewfinderView;
import com.google.zxing.Result;
import com.zijunlin.Zxing.Demo.R;

public class CaptureActivity extends FragmentActivity {
	
	
	private CaptureFragment frag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity);
		frag= new CaptureFragment();
		getSupportFragmentManager().beginTransaction()
													  .add(R.id.fragmentContainer, frag)
													  .commit();
	}

	public ViewfinderView getViewfinderView() {

		return frag.getViewfinderView();
	}

	public void handleDecode(Result obj, Bitmap barcode) {

		frag.handleDecode(obj, barcode);
	}

	public void drawViewfinder() {

		frag.drawViewfinder();
	}

	public Handler getHandler() {

		return frag.getHandler();
	}
}