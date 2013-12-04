package com.baggers.bagboy;

import java.util.ArrayList;
import java.util.HashSet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class MyMapView extends View {
	Bitmap map;
	ArrayList<String> items;
	HashSet<Integer> aisles;
	Paint p = new Paint();
	int[] x = new int[18];
	int[] y = new int[18];
	int fy = 450;
	int ly = 418;
	int ty = 232;
	int realY;
	boolean top = false;
	int dim = 18;
	RectF d;

	public MyMapView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		x[0] = 710;
		y[0] = 530;
		x[1] = 566;
		y[1] = 318;
		x[2] = 508;
		y[2] = 318;
		x[3] = 427;
		y[3] = 318;
		x[4] = 350;
		y[4] = 318;
		x[5] = 272;
		y[5] = 318;
		x[6] = 195;
		y[6] = 318;
		x[7] = 114;
		y[7] = 318;
		x[8] = 37;
		y[8] = 297;
		x[9] = 46;
		y[9] = 124;
		x[10] = 159;
		y[10] = 125;
		x[11] = 281;
		y[11] = 125;
		x[12] = 378;
		y[12] = 125;
		
		p.setColor(0xff29348D);
		p.setStyle(Paint.Style.STROKE);
		p.setStrokeWidth(3);
		
		d = new RectF(x[0], y[0], x[0] + dim, y[0] + dim);

		items = ListManager.loadItemsFromList();
		aisles = getAisles();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		realY = fy;
		top = false;
		for (int i = 0; i < 8; i++)
		{
			if(aisles.contains(i))
			{
				d.bottom = y[i] + dim;
				d.left = x[i];
				d.right = x[i] + dim;
				d.top = y[i];
				if(i == 0)
				{
					canvas.drawRect(d, p);
					canvas.drawLine(x[i] + dim/2, y[i], x[i] + dim/2, realY, p);
					canvas.drawLine(x[i] + dim/2, realY, x[i+1] + dim/2, realY, p);
				}
				else
				{
					canvas.drawOval(d, p);
					if(top)
					{
						canvas.drawLine(x[i] + dim/2, realY, x[i] + dim/2, y[i], p);
						realY = fy;
						top = !top;
						canvas.drawLine(x[i] + dim/2, y[i] + dim, x[i] + dim/2, realY, p);
					}
					else
					{
						canvas.drawLine(x[i] + dim/2, realY, x[i] + dim/2, y[i] + dim, p);
						realY = ty;
						top = !top;
						canvas.drawLine(x[i] + dim/2, y[i], x[i] + dim/2, realY, p);
					}
					canvas.drawLine(x[i] + dim/2, realY, x[i+1] + dim/2, realY, p);
				}
			}
			else
			{
				canvas.drawLine(x[i] + dim/2, realY, x[i+1] + dim/2, realY, p);
			}
		}
	}

	private HashSet<Integer> getAisles() {
		HashSet<Integer> aisles = new HashSet<Integer>();
		aisles.add(0);
		for (String item : items) {
			aisles.add(ListManager.loadAislesFromProductName(item));
		}
		return aisles;
	}
}