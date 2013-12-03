package com.baggers.bagboy;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;

public class MyMapView extends View {
	private ShapeDrawable mDrawable;
	Bitmap map;
	ArrayList<String> items;
	int[] x = new int[18];
	int[] y = new int[18];

	public MyMapView(Context context, AttributeSet attrs) {
		super(context, attrs);

		x[3] = 427;
		y[3] = 318;

		int dim = 18;
		items = ListManager.loadItemsFromList();

		mDrawable = new ShapeDrawable(new OvalShape());
		mDrawable.getPaint().setColor(0xff74AC23);
		mDrawable.getPaint().setStyle(Paint.Style.STROKE);
		mDrawable.getPaint().setStrokeWidth(2);
		mDrawable.setBounds(x[3], y[3], x[3] + dim, y[3] + dim);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// canvas.drawBitmap(map, 0, 0, null);
		mDrawable.draw(canvas);
	}

	private ArrayList<String> getAisles() {
		ArrayList<String> aisles = new ArrayList<String>();
		for (String item : items) {
			aisles.add(item);
		}
		return aisles;
	}
}