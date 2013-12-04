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
	int[] x = new int[15];
	int[] y = new int[15];
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
		x[13] = 273;
		y[13] = 34;
		x[14] = 504;
		y[14] = 121;
		
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
				else if(i == 7)
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
					canvas.drawLine(x[i] + dim/2, realY, 70, realY, p);
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
				if(i == 7)
				{
					canvas.drawLine(x[i] + dim/2, realY, 70, realY, p);
				}
				else
				{
					canvas.drawLine(x[i] + dim/2, realY, x[i+1] + dim/2, realY, p);
				}
			}
		}
		fy = 210;
		ty = 60;
		if(aisles.contains(8))
		{
			d.bottom = y[8] + dim;
			d.left = x[8];
			d.right = x[8] + dim;
			d.top = y[8];
			canvas.drawOval(d, p);
			if(top)
			{
				canvas.drawLine(70, realY, x[8] + dim/2, y[8], p);
			}
			else
			{
				canvas.drawLine(70, realY, x[8] + dim/2, y[8] + dim, p);
			}
			
			if(aisles.contains(9))
			{
				d.bottom = y[9] + dim;
				d.left = x[9];
				d.right = x[9] + dim;
				d.top = y[9];
				canvas.drawOval(d, p);
				canvas.drawLine(x[8] + dim/2, y[8], x[9] + dim/2, y[9] + dim, p);
				canvas.drawLine(x[9] + dim/2, y[9], 70, ty, p);
				realY = ty;
				top = true;
			}
			else
			{
				canvas.drawLine(x[8] + dim/2, y[8], 66, fy, p);
				realY = fy;
				top = false;
			}
		}
		else if(aisles.contains(9))
		{
			d.bottom = y[9] + dim;
			d.left = x[9];
			d.right = x[9] + dim;
			d.top = y[9];
			canvas.drawOval(d, p);
			canvas.drawLine(70, realY, x[9] + dim/2, y[9] + dim, p);
			canvas.drawLine(x[9] + dim/2, y[9], 70, ty, p);
			realY = ty;
			top = true;
		}
		else
		{
			canvas.drawLine(70, realY, 70, fy, p);
			realY = fy;
			top = false;
			
//			if(aisles.contains(13))
//			{
//				canvas.drawLine(70, realY, 70, ty, p);
//				realY = ty;
//				top = true;
//			}
//			else
//			{
//				canvas.drawLine(70, realY, 70, fy, p);
//				realY = fy;
//				top = false;
//			}
		}
		canvas.drawLine(70, realY, x[10] + dim/2, realY, p);
		
		if(aisles.contains(10))
		{
			d.bottom = y[10] + dim;
			d.left = x[10];
			d.right = x[10] + dim;
			d.top = y[10];
			canvas.drawOval(d, p);
			if(top)
			{
				canvas.drawLine(x[10] + dim/2, realY, x[10] + dim/2, y[10], p);
				realY = fy;
				top = !top;
				canvas.drawLine(x[10] + dim/2, y[10] + dim, x[10] + dim/2, realY, p);
			}
			else
			{
				canvas.drawLine(x[10] + dim/2, realY, x[10] + dim/2, y[10] + dim, p);
				realY = ty;
				top = !top;
				canvas.drawLine(x[10] + dim/2, y[10], x[10] + dim/2, realY, p);
			}
		}
		canvas.drawLine(x[10] + dim/2, realY, x[10+1] + dim/2, realY, p);
		
		if(aisles.contains(11))
		{
			d.bottom = y[11] + dim;
			d.left = x[11];
			d.right = x[11] + dim;
			d.top = y[11];
			canvas.drawOval(d, p);
			if(top)
			{
				canvas.drawLine(x[11] + dim/2, realY, x[11] + dim/2, y[11], p);
				if(!aisles.contains(13))
				{
					realY = fy;
					top = !top;
					canvas.drawLine(x[11] + dim/2, y[11] + dim, x[11] + dim/2, realY, p);
				}
			}
			else
			{
				canvas.drawLine(x[11] + dim/2, realY, x[11] + dim/2, y[11] + dim, p);
				if(!aisles.contains(13))
				{
					realY = ty;
					top = !top;
					canvas.drawLine(x[11] + dim/2, y[11], x[11] + dim/2, realY, p);
				}
			}
		}
		if(aisles.contains(13))
		{
			d.bottom = y[13] + 20;
			d.left = x[13];
			d.right = x[13] + 70;
			d.top = y[13];
			canvas.drawRect(d, p);
			if(aisles.contains(11))
			{
				canvas.drawLine(x[11] + dim/2, y[11], x[13] + 35, y[13] + 20, p);
			}
			else
			{
				canvas.drawLine(x[11] + dim/2, realY, x[13] + 35, y[13] + 20, p);
			}
			if(!top)
			{
				realY = ty;
				top = !top;
			}
			canvas.drawLine(x[13] + 35, y[13] + 20, x[12] + dim/2, realY, p);
		}
		else
		{
			canvas.drawLine(x[11] + dim/2, realY, x[12] + dim/2, realY, p);
		}
		
		if(aisles.contains(12))
		{
			d.bottom = y[12] + dim;
			d.left = x[12];
			d.right = x[12] + dim;
			d.top = y[12];
			canvas.drawOval(d, p);
			if(top)
			{
				canvas.drawLine(x[12] + dim/2, realY, x[12] + dim/2, y[12], p);
				realY = fy;
				top = !top;
				canvas.drawLine(x[12] + dim/2, y[12] + dim, x[12] + dim/2, realY, p);
			}
			else
			{
				canvas.drawLine(x[12] + dim/2, realY, x[12] + dim/2, y[12] + dim, p);
				realY = ty;
				top = !top;
				canvas.drawLine(x[12] + dim/2, y[12], x[12] + dim/2, realY, p);
			}
		}
		canvas.drawLine(x[12] + dim/2, realY, x[14] + 52, realY, p);
		
		if(aisles.contains(14))
		{
			d.bottom = y[14] + 22;
			d.left = x[14];
			d.right = x[14] + 104;
			d.top = y[14];
			canvas.drawRect(d, p);
			if(!top)
			{
				canvas.drawLine(x[14] + 52, realY, x[14] + 52, y[14] + 22, p);
			}
			else
			{
				canvas.drawLine(x[14] + 52, realY, x[14] + 52, y[14], p);
			}
			
		}
		
		fy = 450;
		ly = 418;
		ty = 232;
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